package com.kakapo.kotlin.go_strada_java.presentation.fragment.absensi_fragment;

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
import com.kakapo.kotlin.go_strada_java.databinding.AbsensiFragmentBinding;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.view_pager.AbsensiAdapter;

public class AbsensiFragment extends Fragment {

    private static String[] jadwalAbsen = {
            "Senin",
            "Selasa",
            "Rabu",
            "Kamis",
            "Jum'at",
            "Sabtu"
    };

    private AbsensiViewModel mViewModel;
    private AbsensiFragmentBinding binding;
    private FragmentActivity myContext;

    public static AbsensiFragment newInstance() {
        return new AbsensiFragment();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = AbsensiFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AbsensiViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        myContext = getActivity();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager2 viewPager = binding.viewPager;
        TabLayout tabLayout = binding.tabLayout;

        AbsensiAdapter adapter = new AbsensiAdapter(
                myContext.getSupportFragmentManager(),
                getLifecycle()
        );

        viewPager.setAdapter(adapter);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        new TabLayoutMediator(
                tabLayout,
                viewPager,
                (tab, position) -> tab.setText(jadwalAbsen[position])
        ).attach();
    }
}