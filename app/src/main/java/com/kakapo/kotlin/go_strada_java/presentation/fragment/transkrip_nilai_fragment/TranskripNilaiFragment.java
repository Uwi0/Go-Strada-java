package com.kakapo.kotlin.go_strada_java.presentation.fragment.transkrip_nilai_fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kakapo.kotlin.go_strada_java.R;

public class TranskripNilaiFragment extends Fragment {

    private TranskripNilaiViewModel mViewModel;

    public static TranskripNilaiFragment newInstance() {
        return new TranskripNilaiFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.transkrip_nilai_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(TranskripNilaiViewModel.class);
        // TODO: Use the ViewModel
    }

}