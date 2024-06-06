package com.example.aqi;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aqi.model.AQIResponse;
import com.example.aqi.model.AQIStation;
import com.example.aqi.network.ApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AQIAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://data.moenv.gov.tw/api/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);
        Call<AQIResponse> call = apiService.getAQIData("json", "5bdd0d35-4193-4d42-b04f-7d70ba21fb4d");

        call.enqueue(new Callback<AQIResponse>() {
            @Override
            public void onResponse(Call<AQIResponse> call, Response<AQIResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<AQIStation> stations = response.body().getRecords();
                    adapter = new AQIAdapter(stations, item -> {
                        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                        intent.putExtra("aqiStation", item);
                        startActivity(intent);
                    });
                    recyclerView.setAdapter(adapter);
                } else {
                    Log.d("AQI", "Response not successful: " + response.message());
                }
            }

            @Override
            public void onFailure(Call<AQIResponse> call, Throwable t) {
                Log.d("AQI", "Error: " + t.getMessage());
            }
        });
    }
}
