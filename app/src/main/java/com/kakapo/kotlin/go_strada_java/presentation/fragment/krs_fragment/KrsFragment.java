package com.kakapo.kotlin.go_strada_java.presentation.fragment.krs_fragment;

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
import com.kakapo.kotlin.go_strada_java.databinding.KrsFragmentBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.DataKrs;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter.KrsAdapter;

import java.util.ArrayList;
import java.util.List;

public class KrsFragment extends Fragment {

    private KrsViewModel mViewModel;
    private KrsFragmentBinding binding;

    public static KrsFragment newInstance() {
        return new KrsFragment();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = KrsFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(KrsViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createRecyclerView();
        dropDownMenuAdapter();
    }

    private void dropDownMenuAdapter(){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                requireActivity(),
                R.layout.item_simple_menu,
                fakeListMenu()
        );

        binding.txtAutoComplete.setAdapter(adapter);
    }

    private List<String> fakeListMenu(){
        ArrayList<String> menu = new ArrayList<>();
        menu.add("semester 1");
        menu.add("semester 2");
        menu.add("semester 3");
        menu.add("semester 4");
        menu.add("semester 5");
        menu.add("semester 6");

        return menu;
    }

    private void createRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireActivity());
        List<DataKrs> listKrs = fakeListKrs();
        KrsAdapter adapter = new KrsAdapter(this, listKrs);
        binding.rcKrs.setLayoutManager(layoutManager);
        binding.rcKrs.setAdapter(adapter);
    }

    private List<DataKrs> fakeListKrs(){
        ArrayList<DataKrs> dataKrs = new ArrayList<>();
        DataKrs data1 = new DataKrs(
                "BD3. 19001",
                "Ketrampilan Dasar klinik Kebidanan The basic skills of midwifery clinics",
                "3"
        );
        dataKrs.add(data1);
        DataKrs data2 = new DataKrs(
                "BD3. 19002",
                "Anfis dan Biologi Perkembangan ANFIS and Biology Developments",
                "3"
        );
        dataKrs.add(data2);
        DataKrs data3 = new DataKrs(
                "BD3. 19001",
                "Ketrampilan Dasar klinik Kebidanan The basic skills of midwifery clinics",
                "3"
        );
        dataKrs.add(data3);
        return dataKrs;
    }
}