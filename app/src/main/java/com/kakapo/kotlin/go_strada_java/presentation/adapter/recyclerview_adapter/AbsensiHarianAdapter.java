package com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.kakapo.kotlin.go_strada_java.databinding.ItemAbsenBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.AbsenHarian;

import java.util.List;

public class AbsensiHarianAdapter extends RecyclerView.Adapter<AbsensiHarianAdapter.ViewHolder> {

    private final Fragment fragment;
    private final List<AbsenHarian> list;

    public AbsensiHarianAdapter(Fragment fragment, List<AbsenHarian> list){
        this.fragment = fragment;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemAbsenBinding binding = ItemAbsenBinding.inflate(
                LayoutInflater.from(fragment.getContext()),
                parent,
                false
        );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        AbsenHarian absenHarian = list.get(position);
        int nomor = (position + 1);
        holder.nomor.setText("" + nomor);
        holder.jamMatkul.setText(absenHarian.getMatkul());
        holder.absenMatkul.setText(absenHarian.getMatkul());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView nomor;
        private final TextView absenMatkul;
        private final TextView jamMatkul;

        public ViewHolder(ItemAbsenBinding binding) {
            super(binding.getRoot());
            nomor = binding.txtNumberColumn;
            absenMatkul = binding.txtAbsenMatkul;
            jamMatkul = binding.txtJamMatkul;
        }
    }
}
