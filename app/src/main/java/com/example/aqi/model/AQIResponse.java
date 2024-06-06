package com.example.aqi.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class AQIResponse {
    @SerializedName("records")
    private List<AQIStation> records;

    public List<AQIStation> getRecords() {
        return records;
    }

    public void setRecords(List<AQIStation> records) {
        this.records = records;
    }
}
