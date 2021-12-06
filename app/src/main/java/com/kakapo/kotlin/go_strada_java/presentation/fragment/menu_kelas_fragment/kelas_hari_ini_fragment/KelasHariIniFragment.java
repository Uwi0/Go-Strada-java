package com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_kelas_fragment.kelas_hari_ini_fragment;

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
import com.kakapo.kotlin.go_strada_java.databinding.KelasHariIniFragmentBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.KelasHariIni;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter.KelasHariIniAdapter;

import java.util.ArrayList;
import java.util.List;

public class KelasHariIniFragment extends Fragment {

    private KelasHariIniViewModel mViewModel;

    public static KelasHariIniFragment newInstance() {
        return new KelasHariIniFragment();
    }

    private KelasHariIniFragmentBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = KelasHariIniFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(KelasHariIniViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createRecyclerView();
    }

    private void createRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireActivity());
        List<KelasHariIni> listKelasHarini = fakeList();
        KelasHariIniAdapter adapter =
                new KelasHariIniAdapter(this, listKelasHarini);
        binding.rcKelasHariIni.setLayoutManager(layoutManager);
        binding.rcKelasHariIni.setAdapter(adapter);
    }

    private List<KelasHariIni> fakeList(){
        ArrayList<KelasHariIni> fakeList = new ArrayList<>();
        KelasHariIni data1 = new KelasHariIni(
                R.drawable.user_icon,
                "Candra Wahyuni, SST., M.Kes",
                "Kuliah Kesehatan Lingkungan",
                ""
        );
        fakeList.add(data1);
        fakeList.add(data1);
        fakeList.add(data1);
        fakeList.add(data1);
        fakeList.add(data1);
        return  fakeList;
    }
}