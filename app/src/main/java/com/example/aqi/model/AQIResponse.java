package com.example.aqi.model;

import java.io.Serializable;
import java.util.List;

public class AQIResponse implements Serializable {
    private List<AQIStation> records;

    public List<AQIStation> getRecords() {
        return records;
    }

    public void setRecords(List<AQIStation> records) {
        this.records = records;
    }
}
