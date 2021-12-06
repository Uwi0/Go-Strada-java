package com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.kakapo.kotlin.go_strada_java.databinding.ItemKhsBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.DataKhs;

import java.util.List;

public class KhsAdapter extends RecyclerView.Adapter<KhsAdapter.ViewHolder> {
    private final Fragment fragment;
    private final List<DataKhs> list;

    public KhsAdapter(Fragment fragment, List<DataKhs> list){
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
        DataKhs dataKhs = list.get(position);
        holder.bobotMatkul.setText(dataKhs.getBobot());
        holder.kodeMatkul.setText(dataKhs.getKodeMatkul());
        holder.sksMatkul.setText(dataKhs.getSks());
        holder.namaMatkulInggris.setText(dataKhs.getNamaMatkulInggris());
        holder.nilai.setText(dataKhs.getNilai());
        holder.namaMatkul.setText(dataKhs.getNamaMatkul());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView nilai;
        private final TextView namaMatkul;
        private final TextView namaMatkulInggris;
        private final TextView sksMatkul;
        private final TextView kodeMatkul;
        private final TextView bobotMatkul;

        public ViewHolder(ItemKhsBinding binding) {
            super(binding.getRoot());
            nilai = binding.txtNilai;
            namaMatkul = binding.txtMatkul;
            namaMatkulInggris = binding.txtMatkulInggris;
            sksMatkul = binding.txtSks;
            kodeMatkul = binding.txtKodeMatkul;
            bobotMatkul = binding.txtBobotMatkul;
        }
    }
}
