package com.kakapo.kotlin.go_strada_java.presentation.fragment.kalender_akademik_fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kakapo.kotlin.go_strada_java.R;

public class KalenderAkademikFragment extends Fragment {

    private KalenderAkademikViewModel mViewModel;

    public static KalenderAkademikFragment newInstance() {
        return new KalenderAkademikFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.kalender_akademik_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(KalenderAkademikViewModel.class);
        // TODO: Use the ViewModel
    }

}