package com.example.aqi.network;

import com.example.aqi.model.AQIResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AQIApiService {
    @GET("api/v2/aqx_p_432")
    Call<AQIResponse> getAQIStations(
            @Query("format") String format,
            @Query("offset") int offset,
            @Query("limit") int limit,
            @Query("api_key") String apiKey
    );
}
