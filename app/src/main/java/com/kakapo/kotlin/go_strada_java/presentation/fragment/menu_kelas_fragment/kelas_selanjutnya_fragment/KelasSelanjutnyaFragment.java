package com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_kelas_fragment.kelas_selanjutnya_fragment;

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
import com.kakapo.kotlin.go_strada_java.databinding.KelasSelanjutnyaFragmentBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.KelasSelanjutnya;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter.KelasSelanjutnyaAdapter;

import java.util.ArrayList;
import java.util.List;

public class KelasSelanjutnyaFragment extends Fragment {

    private KelasSelanjutnyaViewModel mViewModel;
    private KelasSelanjutnyaFragmentBinding binding;

    public static KelasSelanjutnyaFragment newInstance() {
        return new KelasSelanjutnyaFragment();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = KelasSelanjutnyaFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(KelasSelanjutnyaViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createRecyclerView();
    }

    private void createRecyclerView() {
        LinearLayoutManager layoutmanager = new LinearLayoutManager(requireActivity());
        List<KelasSelanjutnya> listKelas = fakeList();
        KelasSelanjutnyaAdapter adapter = new KelasSelanjutnyaAdapter(this, listKelas);
        binding.rcKelasSelanjutnya.setLayoutManager(layoutmanager);
        binding.rcKelasSelanjutnya.setAdapter(adapter);

    }

    private List<KelasSelanjutnya> fakeList() {
        ArrayList<KelasSelanjutnya> fakeList = new ArrayList<>();
        KelasSelanjutnya data1 = new KelasSelanjutnya(
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
        return fakeList;
    }
}