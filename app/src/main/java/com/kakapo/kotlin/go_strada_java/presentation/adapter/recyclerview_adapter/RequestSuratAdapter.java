package com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.kakapo.kotlin.go_strada_java.databinding.ItemRequestSuratBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.RequestSurat;

import java.util.List;

public class RequestSuratAdapter extends RecyclerView.Adapter<RequestSuratAdapter.ViewHolder> {
    private final Fragment fragment;
    private final List<RequestSurat> list;

    public RequestSuratAdapter(Fragment fragment, List<RequestSurat> list) {
        this.fragment = fragment;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemRequestSuratBinding binding = ItemRequestSuratBinding.inflate(
                LayoutInflater.from(fragment.getContext()),
                parent,
                false
        );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RequestSurat requestSurat = list.get(position);
        holder.tanggalSurat.setText(requestSurat.getKeterangan());
        holder.keteranganSurat.setText(requestSurat.getTanggal());
        holder.statusSurat.setText(requestSurat.getStatus());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView keteranganSurat;
        private final TextView tanggalSurat;
        private final TextView statusSurat;

        public ViewHolder(ItemRequestSuratBinding binding) {
            super(binding.getRoot());

            keteranganSurat = binding.tvKeterangan;
            tanggalSurat = binding.tvTanggal;
            statusSurat = binding.tvStatus;
        }
    }
}
