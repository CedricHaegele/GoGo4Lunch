package com.example.android.gogo4lunch.drawerNav.lunch;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LunchViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LunchViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is lunch fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}