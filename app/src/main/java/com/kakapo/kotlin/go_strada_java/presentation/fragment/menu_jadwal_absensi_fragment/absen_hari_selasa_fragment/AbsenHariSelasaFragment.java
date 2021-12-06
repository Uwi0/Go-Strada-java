package com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_absensi_fragment.absen_hari_selasa_fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kakapo.kotlin.go_strada_java.R;

public class AbsenHariSelasaFragment extends Fragment {

    private AbsenHariSelasaViewModel mViewModel;

    public static AbsenHariSelasaFragment newInstance() {
        return new AbsenHariSelasaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.absen_hari_selasa_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AbsenHariSelasaViewModel.class);
        // TODO: Use the ViewModel
    }

}