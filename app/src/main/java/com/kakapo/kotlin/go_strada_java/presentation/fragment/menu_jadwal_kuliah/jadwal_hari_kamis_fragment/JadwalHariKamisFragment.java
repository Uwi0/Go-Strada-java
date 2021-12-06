package com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_kuliah.jadwal_hari_kamis_fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kakapo.kotlin.go_strada_java.R;

public class JadwalHariKamisFragment extends Fragment {

    private JadwalHariKamisViewModel mViewModel;

    public static JadwalHariKamisFragment newInstance() {
        return new JadwalHariKamisFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.jadwal_hari_kamis_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(JadwalHariKamisViewModel.class);
        // TODO: Use the ViewModel
    }

}