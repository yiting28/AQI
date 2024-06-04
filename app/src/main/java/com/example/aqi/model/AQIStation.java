package com.example.aqi.model;

public class AQIStation {
    private String siteName;
    private String county;
    private String AQI;
    private String PM25;
    private String status;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAQI() {
        return AQI;
    }

    public void setAQI(String AQI) {
        this.AQI = AQI;
    }

    public String getPM25() {
        return PM25;
    }

    public void setPM25(String PM25) {
        this.PM25 = PM25;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
