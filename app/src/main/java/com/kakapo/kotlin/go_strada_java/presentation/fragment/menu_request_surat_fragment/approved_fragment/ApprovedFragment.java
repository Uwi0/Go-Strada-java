package com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_request_surat_fragment.approved_fragment;

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
import com.kakapo.kotlin.go_strada_java.databinding.ApprovedFragmentBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.ApprovedSurat;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter.ApprovedSuratAdapter;

import java.util.ArrayList;
import java.util.List;

public class ApprovedFragment extends Fragment {

    private ApprovedViewModel mViewModel;
    private ApprovedFragmentBinding binding;

    public static ApprovedFragment newInstance() {
        return new ApprovedFragment();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = ApprovedFragmentBinding.inflate(inflater,container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ApprovedViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createRecyclerView();
    }

    private void createRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireActivity());
        List<ApprovedSurat> listApproved = fakeList();
        ApprovedSuratAdapter adapter = new ApprovedSuratAdapter(this, listApproved);
        binding.rcSuratApproved.setLayoutManager(layoutManager);
        binding.rcSuratApproved.setAdapter(adapter);
    }

    private List<ApprovedSurat> fakeList(){
        ArrayList<ApprovedSurat> fakeApproved = new ArrayList<>();
        ApprovedSurat approvedSurat1 = new ApprovedSurat(
                "Surat Keterangan Kuliah",
                ""
        );
        fakeApproved.add(approvedSurat1);
        ApprovedSurat approvedSurat2 = new ApprovedSurat(
                "Surat Keterangan Survey",
                "25 Jan 2020"
        );
        fakeApproved.add(approvedSurat2);
        ApprovedSurat approvedSurat3 = new ApprovedSurat(
                "Surat Keterangan",
                "25 Jan 2020"
        );
        fakeApproved.add(approvedSurat3);
        return fakeApproved;
    }
}