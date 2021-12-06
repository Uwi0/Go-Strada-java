package com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_kuliah.jadwal_hari_senin_fragment;

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
import com.kakapo.kotlin.go_strada_java.databinding.JadwalHariSeninFragmentBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.JadwalKuliah;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter.JadwalKuliahAdapter;

import java.util.ArrayList;
import java.util.List;

public class JadwalHariSeninFragment extends Fragment {

    private JadwalHariSeninViewModel mViewModel;
    private JadwalHariSeninFragmentBinding binding;

    public static JadwalHariSeninFragment newInstance() {
        return new JadwalHariSeninFragment();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = JadwalHariSeninFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(JadwalHariSeninViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createRecyclerView();
    }

    private void createRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireActivity());
        List<JadwalKuliah> fakeList = fakeList();
        JadwalKuliahAdapter adapter = new JadwalKuliahAdapter(this, fakeList);
        binding.rcJadwalMatkul.setLayoutManager(layoutManager);
        binding.rcJadwalMatkul.setAdapter(adapter);
    }

    private List<JadwalKuliah> fakeList(){
        ArrayList<JadwalKuliah> fakeJadwal = new ArrayList<>();
        JadwalKuliah data1 = new JadwalKuliah(
                "Kuliah Metodologi Penelitian",
                "12.00 WIB",
                "13.45 WIB",
                "Gedung Adipama Lantai 5"
        );
        fakeJadwal.add(data1);
        JadwalKuliah data2 = new JadwalKuliah(
                "Kuliah Metodologi Penelitian",
                "12.00 WIB",
                "13.45 WIB",
                "Gedung Adipama Lantai 5"
        );
        fakeJadwal.add(data2);
        return fakeJadwal;
    }
}