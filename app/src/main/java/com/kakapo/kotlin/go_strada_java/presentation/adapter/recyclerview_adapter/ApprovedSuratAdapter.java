package com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.kakapo.kotlin.go_strada_java.databinding.ItemApprovedSuratBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.ApprovedSurat;

import java.util.List;

public class ApprovedSuratAdapter extends RecyclerView.Adapter<ApprovedSuratAdapter.ViewHolder> {

    private final Fragment fragment;
    private final List<ApprovedSurat> list;

    public ApprovedSuratAdapter(Fragment fragment, List<ApprovedSurat> list){
        this.fragment = fragment;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemApprovedSuratBinding binding = ItemApprovedSuratBinding.inflate(
                LayoutInflater.from(fragment.getContext()),
                parent,
                false
        );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ApprovedSurat approvedSurat = list.get(position);
        holder.tanggalSurat.setText(approvedSurat.getTanggalSurat());
        holder.keteranganSurat.setText(approvedSurat.getKeteranganSurat());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView keteranganSurat;
        private final TextView tanggalSurat;

        public ViewHolder(ItemApprovedSuratBinding binding) {
            super(binding.getRoot());
            keteranganSurat = binding.txtKeteranganSurat;
            tanggalSurat = binding.txtTanggalSurat;
        }
    }
}
