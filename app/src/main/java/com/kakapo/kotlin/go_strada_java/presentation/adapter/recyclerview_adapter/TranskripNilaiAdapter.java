package com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.kakapo.kotlin.go_strada_java.databinding.ItemKhsBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.TranskripNilai;

import java.util.List;

public class TranskripNilaiAdapter extends RecyclerView.Adapter<TranskripNilaiAdapter.ViewHolder> {

    private final Fragment fragment;
    private final List<TranskripNilai> list;

    public TranskripNilaiAdapter(Fragment fragment, List<TranskripNilai> list) {
        this.fragment = fragment;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemKhsBinding binding = ItemKhsBinding.inflate(
                LayoutInflater.from(fragment.getContext()),
                parent,
                false
        );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TranskripNilai transkripNilai = list.get(position);
        holder.kodeMatkul.setText(transkripNilai.getKodeMatkul());
        holder.bobotMatkul.setText(transkripNilai.getBobot());
        holder.sksMatkul.setText(transkripNilai.getSks());
        holder.nilaiMatkul.setText(transkripNilai.getNilai());
        holder.namaMatkulInggris.setText(transkripNilai.getNamaMatkulInggris());
        holder.namaMatkul.setText(transkripNilai.getNamaMatkul());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView namaMatkul;
        private final TextView namaMatkulInggris;
        private final TextView nilaiMatkul;
        private final TextView sksMatkul;
        private final TextView bobotMatkul;
        private final TextView kodeMatkul;

        public ViewHolder(ItemKhsBinding binding) {
            super(binding.getRoot());
            namaMatkul = binding.txtMatkul;
            namaMatkulInggris = binding.txtMatkulInggris;
            nilaiMatkul = binding.txtNilai;
            sksMatkul = binding.txtSks;
            bobotMatkul = binding.txtBobotMatkul;
            kodeMatkul = binding.txtKodeMatkul;
        }
    }
}
