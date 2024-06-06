package com.example.aqi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aqi.model.AQIResponse;
import com.example.aqi.model.AQIStation;
import com.example.aqi.network.AQIApiService;
import com.example.aqi.repository.RetrofitClient;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AQIAdapter adapter;
    private List<AQIStation> aqiStationList;
    private static final String API_KEY = "5bdd0d35-4193-4d42-b04f-7d70ba21fb4d"; // 替換成你的API密鑰

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        fetchAQIData();
    }

    private void fetchAQIData() {
        AQIApiService apiService = RetrofitClient.getClient().create(AQIApiService.class);
        Call<AQIResponse> call = apiService.getAQIStations("json", 0, 100, API_KEY); // 0 offset and limit 100, you can adjust as needed
        call.enqueue(new Callback<AQIResponse>() {
            @Override
            public void onResponse(Call<AQIResponse> call, Response<AQIResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    aqiStationList = response.body().getRecords();
                    for (AQIStation station : aqiStationList) {
                        Log.d("AQIData", "Site: " + station.getSiteName() + ", AQI: " + station.getAQI());
                    }
                    adapter = new AQIAdapter(aqiStationList, item -> {
                        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                        intent.putExtra("aqiStation", item);
                        startActivity(intent);
                    });
                    recyclerView.setAdapter(adapter);
                } else {
                    Log.e("APIError", "Response Code: " + response.code());
                    Log.e("APIError", "Response Message: " + response.message());
                    if (response.errorBody() != null) {
                        try {
                            Log.e("APIError", "Error Body: " + response.errorBody().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    Toast.makeText(MainActivity.this, "Failed to retrieve data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<AQIResponse> call, Throwable t) {
                Log.e("APIError", "Error: " + t.getMessage());
                Toast.makeText(MainActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
