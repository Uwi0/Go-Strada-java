package com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.kakapo.kotlin.go_strada_java.databinding.ItemKrsBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.DataKrs;

import java.util.List;

public class KrsAdapter extends RecyclerView.Adapter<KrsAdapter.ViewHolder> {
    private final Fragment fragment;
    private final List<DataKrs> list;

    public KrsAdapter(Fragment fragment, List<DataKrs> list){
        this.fragment = fragment;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemKrsBinding binding = ItemKrsBinding.inflate(
                LayoutInflater.from(fragment.getContext()),
                parent,
                false
        );

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataKrs dataKrs = list.get(position);
        int nomer = position + 1;
        holder.nomer.setText("" + nomer);
        holder.kodeMk.setText(dataKrs.getKodeMk());
        holder.mataKuliah.setText(dataKrs.getMataKuliah());
        holder.sks.setText(dataKrs.getSks());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView nomer;
        private final TextView kodeMk;
        private final TextView mataKuliah;
        private final TextView sks;
        public ViewHolder(ItemKrsBinding binding) {
            super(binding.getRoot());

            nomer = binding.txtNo;
            kodeMk = binding.txtKodeMk;
            mataKuliah = binding.txtMataKuliah;
            sks = binding.txtSks;
        }
    }
}
