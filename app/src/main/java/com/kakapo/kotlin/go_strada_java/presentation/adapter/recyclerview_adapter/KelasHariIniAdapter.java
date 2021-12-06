package com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kakapo.kotlin.go_strada_java.databinding.ItemKelasHariIniBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.KelasHariIni;

import java.util.List;

public class KelasHariIniAdapter extends RecyclerView.Adapter<KelasHariIniAdapter.ViewHolder> {

    private final Fragment fragment;
    private final List<KelasHariIni> listKelasHariIni;

    public KelasHariIniAdapter(Fragment fragment, List<KelasHariIni> listKelasHariIni){
        this.fragment = fragment;
        this.listKelasHariIni = listKelasHariIni;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemKelasHariIniBinding binding = ItemKelasHariIniBinding.inflate(
                LayoutInflater.from(fragment.getContext()),
                parent,
                false
        );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        KelasHariIni listKelas = listKelasHariIni.get(position);
        holder.namaDosen.setText(listKelas.getNamaDosen());
        holder.materi.setText(listKelas.getMateri());
        Glide.with(fragment).load(listKelas.getImgDosen()).into(holder.avatarDosen);
    }

    @Override
    public int getItemCount() {
        return listKelasHariIni.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView namaDosen;
        private final ImageView avatarDosen;
        private final TextView materi;

        public ViewHolder(ItemKelasHariIniBinding itemBinding) {
            super(itemBinding.getRoot());
            namaDosen = itemBinding.txtNamaDosenPangajar;
            avatarDosen = itemBinding.imgDosenPengajar;
            materi = itemBinding.txtMateri;
        }

    }

}
