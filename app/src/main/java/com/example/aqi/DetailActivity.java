package com.example.aqi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.aqi.model.AQIStation;

public class DetailActivity extends AppCompatActivity {
    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView textSiteName = findViewById(R.id.tvSiteName);
        TextView textCounty = findViewById(R.id.tvCounty);
        TextView textAQI = findViewById(R.id.tvAQI);
        TextView textStatus = findViewById(R.id.tvStatus);

        AQIStation aqiStation = (AQIStation) getIntent().getSerializableExtra("aqiStation");
        if (aqiStation != null) {
            textSiteName.setText(aqiStation.getSiteName());
            textCounty.setText(aqiStation.getCounty());
            textAQI.setText("AQI: " + aqiStation.getAqi());
            textStatus.setText(aqiStation.getStatus());
        }
    }
}
