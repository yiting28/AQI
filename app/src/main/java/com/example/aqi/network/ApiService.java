package com.example.aqi.network;

import com.example.aqi.model.AQIResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("aqx_p_432")
    Call<AQIResponse> getAQIData(
            @Query("format") String format,
            @Query("api_key") String apiKey
    );
}
