package com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_absensi_fragment.absen_hari_senin_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.kakapo.kotlin.go_strada_java.R;
import com.kakapo.kotlin.go_strada_java.databinding.AbsenHariSeninFragmentBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.AbsenHarian;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter.AbsensiHarianAdapter;

import java.util.ArrayList;
import java.util.List;

public class AbsenHariSeninFragment extends Fragment {

    private AbsenHariSeninViewModel mViewModel;
    private AbsenHariSeninFragmentBinding binding;

    public static AbsenHariSeninFragment newInstance() {
        return new AbsenHariSeninFragment();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = AbsenHariSeninFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AbsenHariSeninViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createRecyclerView();
    }

    private void createRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireActivity());
        List<AbsenHarian> listAbsen = fakeList();
        AbsensiHarianAdapter adapter = new AbsensiHarianAdapter(this, listAbsen);
        binding.rcAbsenHarian.setLayoutManager(layoutManager);
        binding.rcAbsenHarian.setAdapter(adapter);
    }

    private List<AbsenHarian> fakeList(){
        ArrayList<AbsenHarian> fakeList = new ArrayList<>();
        AbsenHarian data1 = new AbsenHarian(
                "bahasa Indo",
                "08.00"
        );
        fakeList.add(data1);
        fakeList.add(data1);
        fakeList.add(data1);
        fakeList.add(data1);
        fakeList.add(data1);
        fakeList.add(data1);
        fakeList.add(data1);

        return fakeList;
    }
}