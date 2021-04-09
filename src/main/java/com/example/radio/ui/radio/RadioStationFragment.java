package com.example.radio.ui.radio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.radio.R;
import com.example.radio.controller.CustomAdapter;
import com.example.radio.model.StationFormat;
import com.example.radio.model.Stations;

public class RadioStationFragment extends Fragment {

    private RadioStationViewModel radioViewModel;
    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    public static StationFormat currentStation;
    public static Stations radioStations= new Stations();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        radioViewModel =
                new ViewModelProvider(this).get(RadioStationViewModel.class);
        View root = inflater.inflate(R.layout.fragment_radio, container, false);
        recyclerView= root.findViewById(R.id.stationsList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter= new CustomAdapter(getContext(), radioStations);
        recyclerView.setAdapter(adapter);
        currentStation= new StationFormat();
        radioViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}