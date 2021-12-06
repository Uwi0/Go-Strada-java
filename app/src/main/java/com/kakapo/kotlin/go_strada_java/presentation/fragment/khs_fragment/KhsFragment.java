package com.kakapo.kotlin.go_strada_java.presentation.fragment.khs_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.kakapo.kotlin.go_strada_java.R;
import com.kakapo.kotlin.go_strada_java.databinding.KhsFragmentBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.DataKhs;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter.KhsAdapter;

import java.util.ArrayList;
import java.util.List;

public class KhsFragment extends Fragment {

    private KhsViewModel mViewModel;
    private KhsFragmentBinding binding;

    public static KhsFragment newInstance() {
        return new KhsFragment();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = KhsFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(KhsViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createDropdownMenu();
        createRecyclerView();
    }

    private void createDropdownMenu() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireActivity(),
                R.layout.item_simple_menu,
                fakeListMenu()
        );

        binding.txtAutoComplete.setAdapter(adapter);
    }

    private void createRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireActivity());
        List<DataKhs> listData = fakeList();
        KhsAdapter adapter = new KhsAdapter(this, listData);
        binding.rcKrs.setLayoutManager(layoutManager);
        binding.rcKrs.setAdapter(adapter);
    }

    private List<String> fakeListMenu() {
        ArrayList<String> menu = new ArrayList<>();
        menu.add("semester 1");
        menu.add("semester 2");
        menu.add("semester 3");
        menu.add("semester 4");
        menu.add("semester 5");
        menu.add("semester 6");
        return menu;
    }

    private List<DataKhs> fakeList() {
        ArrayList<DataKhs> listData = new ArrayList<>();
        DataKhs khs1 = new DataKhs(
                "A",
                "Ketrampilan Dasar Klinik Kebidanan",
                "The basic skills of midwifery clinics",
                "3 SKS",
                "Kode : BD3. 19001",
                "Bobot : 12"
        );
        listData.add(khs1);
        DataKhs khs2 = new DataKhs(
                "B",
                "Anfis dan Biologi Perkembangan",
                "Anfis and Biology Development",
                "2 SKS",
                "Kode : BD3. 19002",
                "Bobot : 8"
        );
        listData.add(khs2);
        DataKhs khs3 = new DataKhs(
                "C",
                "Konsep Kebidanan",
                "Concept of midwifery",
                "4 SKS",
                "Kode : BD3. 19003",
                "Bobot : 16"
        );
        listData.add(khs3);
        DataKhs khs4 = new DataKhs(
                "A",
                "Asuhan kebidanan kehamilan 1",
                "Pregnancy midwifery care 1",
                "2 SKS",
                "Kode : BD3. 19004",
                "Bobot : 8"
        );
        listData.add(khs4);
        return listData;
    }
}