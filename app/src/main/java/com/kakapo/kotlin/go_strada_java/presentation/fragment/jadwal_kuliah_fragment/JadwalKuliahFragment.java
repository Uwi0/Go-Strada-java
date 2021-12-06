package com.kakapo.kotlin.go_strada_java.presentation.fragment.jadwal_kuliah_fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.kakapo.kotlin.go_strada_java.R;
import com.kakapo.kotlin.go_strada_java.databinding.JadwalKuliahFragmentBinding;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.view_pager.JadwalAdapter;

public class JadwalKuliahFragment extends Fragment {

    private static String[] jadwalKuliah = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jum'at",
            "Sabtu"
    };

    private JadwalKuliahFragmentBinding binding;
    private JadwalKuliahViewModel mViewModel;
    private FragmentActivity myContext;

    public static JadwalKuliahFragment newInstance() {
        return new JadwalKuliahFragment();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = JadwalKuliahFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(JadwalKuliahViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onAttach(@NonNull Context context) {
        myContext = getActivity();
        super.onAttach(context);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager2 viewPager = binding.viewPager;
        TabLayout tabLayout = binding.tabLayout;

        JadwalAdapter jadwalAdapter = new JadwalAdapter(
                myContext.getSupportFragmentManager(), getLifecycle()
        );

        viewPager.setAdapter(jadwalAdapter);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            tab.setText(jadwalKuliah[position]);
        }).attach();
    }
}