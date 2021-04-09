package com.example.radio.ui.radio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RadioStationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RadioStationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is radio fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}