package com.example.aqi.network;

import com.example.aqi.model.AQIStation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AQIApiService {
    @GET("api/v1/aqx_p_432")
    Call<List<AQIStation>> getAQIStations(
            @Query("format") String format,
            @Query("api_key") String apiKey
    );
}
