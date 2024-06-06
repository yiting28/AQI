package com.example.aqi.model;

import java.io.Serializable;

public class AQIStation implements Serializable {
    private String SiteName;
    private String County;
    private String AQI;
    private String Pollutant;
    private String Status;
    private String SO2;
    private String CO;
    private String O3;
    private String PM10;
    private String PM25;
    private String NO2;
    private String WindSpeed;
    private String WindDirec;
    private String PublishTime;

    // Getters and setters
    public String getSiteName() {
        return SiteName;
    }

    public void setSiteName(String siteName) {
        SiteName = siteName;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getAQI() {
        return AQI;
    }

    public void setAQI(String AQI) {
        this.AQI = AQI;
    }

    public String getPollutant() {
        return Pollutant;
    }

    public void setPollutant(String pollutant) {
        Pollutant = pollutant;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getSO2() {
        return SO2;
    }

    public void setSO2(String SO2) {
        this.SO2 = SO2;
    }

    public String getCO() {
        return CO;
    }

    public void setCO(String CO) {
        this.CO = CO;
    }

    public String getO3() {
        return O3;
    }

    public void setO3(String o3) {
        O3 = o3;
    }

    public String getPM10() {
        return PM10;
    }

    public void setPM10(String PM10) {
        this.PM10 = PM10;
    }

    public String getPM25() {
        return PM25;
    }

    public void setPM25(String PM25) {
        this.PM25 = PM25;
    }

    public String getNO2() {
        return NO2;
    }

    public void setNO2(String NO2) {
        this.NO2 = NO2;
    }

    public String getWindSpeed() {
        return WindSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        WindSpeed = windSpeed;
    }

    public String getWindDirec() {
        return WindDirec;
    }

    public void setWindDirec(String windDirec) {
        WindDirec = windDirec;
    }

    public String getPublishTime() {
        return PublishTime;
    }

    public void setPublishTime(String publishTime) {
        PublishTime = publishTime;
    }
}
