package com.example.aqi.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class AQIStation implements Serializable {
    @SerializedName("sitename")
    private String siteName;

    @SerializedName("county")
    private String county;

    @SerializedName("aqi")
    private String aqi;

    @SerializedName("pollutant")
    private String pollutant;

    @SerializedName("status")
    private String status;

    @SerializedName("so2")
    private String so2;

    @SerializedName("co")
    private String co;

    @SerializedName("o3")
    private String o3;

    @SerializedName("o3_8hr")
    private String o3_8hr;

    @SerializedName("pm10")
    private String pm10;

    @SerializedName("pm2.5")
    private String pm25;

    @SerializedName("no2")
    private String no2;

    @SerializedName("nox")
    private String nox;

    @SerializedName("no")
    private String no;

    @SerializedName("wind_speed")
    private String windSpeed;

    @SerializedName("wind_direc")
    private String windDirec;

    @SerializedName("publishtime")
    private String publishTime;

    @SerializedName("co_8hr")
    private String co_8hr;

    @SerializedName("pm2.5_avg")
    private String pm25_avg;

    @SerializedName("pm10_avg")
    private String pm10_avg;

    @SerializedName("so2_avg")
    private String so2_avg;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("siteid")
    private String siteId;

    // Getters and setters
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

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getPollutant() {
        return pollutant;
    }

    public void setPollutant(String pollutant) {
        this.pollutant = pollutant;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public String getO3_8hr() {
        return o3_8hr;
    }

    public void setO3_8hr(String o3_8hr) {
        this.o3_8hr = o3_8hr;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getNox() {
        return nox;
    }

    public void setNox(String nox) {
        this.nox = nox;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindDirec() {
        return windDirec;
    }

    public void setWindDirec(String windDirec) {
        this.windDirec = windDirec;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getCo_8hr() {
        return co_8hr;
    }

    public void setCo_8hr(String co_8hr) {
        this.co_8hr = co_8hr;
    }

    public String getPm25_avg() {
        return pm25_avg;
    }

    public void setPm25_avg(String pm25_avg) {
        this.pm25_avg = pm25_avg;
    }

    public String getPm10_avg() {
        return pm10_avg;
    }

    public void setPm10_avg(String pm10_avg) {
        this.pm10_avg = pm10_avg;
    }

    public String getSo2_avg() {
        return so2_avg;
    }

    public void setSo2_avg(String so2_avg) {
        this.so2_avg = so2_avg;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
}
