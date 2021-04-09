package com.example.radio.ui.player;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StationPlayerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StationPlayerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is player fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}