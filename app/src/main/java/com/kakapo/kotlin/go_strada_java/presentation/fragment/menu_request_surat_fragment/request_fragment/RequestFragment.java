package com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_request_surat_fragment.request_fragment;

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
import com.kakapo.kotlin.go_strada_java.databinding.RequestFragmentBinding;
import com.kakapo.kotlin.go_strada_java.databinding.RequestSuratFragmentBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.RequestSurat;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter.RequestSuratAdapter;

import java.util.ArrayList;
import java.util.List;

public class RequestFragment extends Fragment {

    private RequestViewModel mViewModel;
    private RequestFragmentBinding binding;

    public static RequestFragment newInstance() {
        return new RequestFragment();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = RequestFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(RequestViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createRecyclerView();
    }

    private void createRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireActivity());
        List<RequestSurat> lisSurat = fakeList();
        RequestSuratAdapter adapter = new RequestSuratAdapter(this, lisSurat);
        binding.rcRequestSurat.setLayoutManager(layoutManager);
        binding.rcRequestSurat.setAdapter(adapter);
    }

    private List<RequestSurat> fakeList(){
        ArrayList<RequestSurat> listRequest = new ArrayList<>();
        RequestSurat dataRequest1 = new RequestSurat(
                "Surat Keterangan Kuliah",
                "30 Maret 2021",
                "Need Approval"
        );
        listRequest.add(dataRequest1);
        RequestSurat dataRequest2 = new RequestSurat(
                "Surat Keterangan Praktek",
                "30 Maret 2021",
                "Need Approval"
        );
        listRequest.add(dataRequest2);
        RequestSurat dataRequest3 = new RequestSurat(
                "Surat Praktikum Lapangan",
                "30 Maret 2021",
                "Need Approval"
        );
        listRequest.add(dataRequest3);
        return listRequest;
    }

}