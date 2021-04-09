package com.example.radio.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.radio.R;
import com.example.radio.model.StationFormat;
import com.example.radio.model.Stations;
import com.example.radio.ui.radio.RadioStationFragment;
import com.squareup.picasso.Picasso;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    LayoutInflater inflater;
    Stations radioStations;

    public CustomAdapter(Context ctx, Stations radioStations){
        this.inflater= LayoutInflater.from(ctx);
        this.radioStations=radioStations;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= inflater.inflate(R.layout.item_layout, parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.radioName.setText(radioStations.stationsArray[position].getRadioName());
        Picasso.get().load(radioStations.stationsArray[position].getRadioImageLink()).into(holder.stationImage);

    }

    @Override
    public int getItemCount() {
        return radioStations.stationsArray.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView radioName;
        ImageView stationImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            radioName= itemView.findViewById(R.id.radioName);
            stationImage= itemView.findViewById(R.id.stationImage);
            itemView.setOnClickListener((this));
        }

        @Override
        public void onClick(View v) {
            StationFormat radioStation= RadioStationFragment.radioStations.stationsArray[getLayoutPosition()];
            RadioStationFragment.currentStation= radioStation;
            Navigation.findNavController(v).navigate(R.id.action_navigation_radio_to_navigation_player);
        }
    }
}
