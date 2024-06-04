package com.example.aqi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aqi.model.AQIStation;
import com.example.aqi.network.AQIApiService;
import com.example.aqi.repository.RetrofitClient;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AQIAdapter adapter;
    private List<AQIStation> aqiStationList;
    private static final String API_KEY = "5bdd0d35-4193-4d42-b04f-7d70ba21fb4d";

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
        Call<List<AQIStation>> call = apiService.getAQIStations("json", API_KEY);
        call.enqueue(new Callback<List<AQIStation>>() {
            @Override
            public void onResponse(Call<List<AQIStation>> call, Response<List<AQIStation>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    aqiStationList = response.body();
                    adapter = new AQIAdapter(aqiStationList, item -> {
                        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                        intent.putExtra("aqiStation", item);
                        startActivity(intent);
                    });
                    recyclerView.setAdapter(adapter);
                } else {
                    Toast.makeText(MainActivity.this, "Failed to retrieve data", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<AQIStation>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
