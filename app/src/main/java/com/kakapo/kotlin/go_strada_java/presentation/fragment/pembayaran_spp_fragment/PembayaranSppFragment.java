package com.kakapo.kotlin.go_strada_java.presentation.fragment.pembayaran_spp_fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kakapo.kotlin.go_strada_java.R;

public class PembayaranSppFragment extends Fragment {

    private PembayaranSppViewModel mViewModel;

    public static PembayaranSppFragment newInstance() {
        return new PembayaranSppFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.pembayaran_spp_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PembayaranSppViewModel.class);
        // TODO: Use the ViewModel
    }

}