package com.example.android.gogo4lunch.drawerNav.lunch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.android.gogo4lunch.databinding.FragmentMylunchBinding;

public class LunchFragment extends Fragment {

    private FragmentMylunchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LunchViewModel lunchViewModel =
                new ViewModelProvider(this).get(LunchViewModel.class);

        binding = FragmentMylunchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}