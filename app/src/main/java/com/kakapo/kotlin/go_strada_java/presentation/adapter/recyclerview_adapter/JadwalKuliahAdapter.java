package com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.kakapo.kotlin.go_strada_java.databinding.ItemJadwalKuliahBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.JadwalKuliah;

import java.util.List;

public class JadwalKuliahAdapter extends RecyclerView.Adapter<JadwalKuliahAdapter.ViewHolder> {

    private final Fragment fragment;
    private final List<JadwalKuliah> list;

    public JadwalKuliahAdapter(Fragment fragment, List<JadwalKuliah> list){
        this.fragment = fragment;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemJadwalKuliahBinding binding = ItemJadwalKuliahBinding.inflate(
                LayoutInflater.from(fragment.getContext()),
                parent,
                false
        );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        JadwalKuliah jadwalKuliah = list.get(position);
        holder.matkul.setText(jadwalKuliah.getMatkul());
        holder.jamMasuk.setText(jadwalKuliah.getJamMasuk());
        holder.jamPulang.setText(jadwalKuliah.getJamPulang());
        holder.gedungPerkuliahan.setText(jadwalKuliah.getGedungPerkuliahan());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView matkul;
        private final TextView jamMasuk;
        private final TextView jamPulang;
        private final TextView gedungPerkuliahan;

        public ViewHolder(ItemJadwalKuliahBinding binding) {
            super(binding.getRoot());
            matkul = binding.txtMatkul;
            jamMasuk = binding.txtJamMasuk;
            jamPulang = binding.txtJamPulang;
            gedungPerkuliahan = binding.txtGedungPerkuliahan;
        }
    }
}
