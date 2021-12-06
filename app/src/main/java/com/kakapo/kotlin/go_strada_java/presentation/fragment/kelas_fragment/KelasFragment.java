package com.kakapo.kotlin.go_strada_java.presentation.fragment.kelas_fragment;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.kakapo.kotlin.go_strada_java.databinding.KelasFragmentBinding;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.view_pager.KelasAdapter;

public class KelasFragment extends Fragment {

    private String[] daftarKelas = {"Class Room Today", "Coming Soon"};

    private KelasViewModel mViewModel;
    private KelasFragmentBinding binding;
    private FragmentActivity myContext;

    public static KelasFragment newInstance() {
        return new KelasFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = KelasFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(KelasViewModel.class);
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

        KelasAdapter adapter = new KelasAdapter(
                myContext.getSupportFragmentManager(),
                getLifecycle()
        );

        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> tab.setText(daftarKelas[position])).attach();

    }
}