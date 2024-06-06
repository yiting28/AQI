package com.example.aqi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aqi.model.AQIStation;

import java.util.List;

public class AQIAdapter extends RecyclerView.Adapter<AQIAdapter.ViewHolder> {

    private List<AQIStation> aqiStations;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(AQIStation item);
    }

    public AQIAdapter(List<AQIStation> aqiStations, OnItemClickListener listener) {
        this.aqiStations = aqiStations;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_aqi, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AQIStation item = aqiStations.get(position);
        holder.textSiteName.setText(item.getSiteName());
        holder.textCounty.setText(item.getCounty());
        holder.textAQI.setText("AQI: " + item.getAQI());
        holder.textStatus.setText(item.getStatus());
        holder.itemView.setOnClickListener(v -> listener.onItemClick(item));
    }

    @Override
    public int getItemCount() {
        return aqiStations.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textSiteName, textCounty, textAQI, textStatus;

        public ViewHolder(View itemView) {
            super(itemView);
            textSiteName = itemView.findViewById(R.id.textSiteName);
            textCounty = itemView.findViewById(R.id.textCounty);
            textAQI = itemView.findViewById(R.id.textAQI);
            textStatus = itemView.findViewById(R.id.textStatus);
        }
    }
}
