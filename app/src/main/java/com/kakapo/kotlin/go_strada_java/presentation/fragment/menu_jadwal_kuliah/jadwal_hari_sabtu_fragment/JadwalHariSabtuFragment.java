package com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_kuliah.jadwal_hari_sabtu_fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kakapo.kotlin.go_strada_java.R;

public class JadwalHariSabtuFragment extends Fragment {

    private JadwalHariSabtuViewModel mViewModel;

    public static JadwalHariSabtuFragment newInstance() {
        return new JadwalHariSabtuFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.jadwal_hari_sabtu_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(JadwalHariSabtuViewModel.class);
        // TODO: Use the ViewModel
    }

}