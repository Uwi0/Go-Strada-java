package com.kakapo.kotlin.go_strada_java.presentation.fragment.aktivitas_fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kakapo.kotlin.go_strada_java.R;

public class AktivitasFragment extends Fragment {

    private AktivitasViewModel mViewModel;

    public static AktivitasFragment newInstance() {
        return new AktivitasFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.aktivitas_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AktivitasViewModel.class);
        // TODO: Use the ViewModel
    }

}