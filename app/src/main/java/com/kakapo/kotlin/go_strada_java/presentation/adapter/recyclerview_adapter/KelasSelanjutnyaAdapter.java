package com.kakapo.kotlin.go_strada_java.presentation.adapter.recyclerview_adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kakapo.kotlin.go_strada_java.databinding.ItemKelasSelanjutnyaBinding;
import com.kakapo.kotlin.go_strada_java.domain.models.KelasSelanjutnya;

import java.util.List;

public class KelasSelanjutnyaAdapter extends
        RecyclerView.Adapter<KelasSelanjutnyaAdapter.ViewHolder> {

    private final Fragment fragment;
    private final List<KelasSelanjutnya> listKelasSelanjutnya;

    public KelasSelanjutnyaAdapter(Fragment fragment, List<KelasSelanjutnya> listKelasSelanjutnya) {
        this.fragment = fragment;
        this.listKelasSelanjutnya = listKelasSelanjutnya;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemKelasSelanjutnyaBinding binding = ItemKelasSelanjutnyaBinding.inflate(
                LayoutInflater.from(fragment.getContext()),
                parent,
                false
        );
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        KelasSelanjutnya listKelas = listKelasSelanjutnya.get(position);
        holder.namaDosen.setText(listKelas.getNamaDosen());
        holder.materi.setText(listKelas.getMateri());
        Glide.with(fragment).load(listKelas.getImgDosen()).into(holder.avatarDosen);
    }

    @Override
    public int getItemCount() {
        return listKelasSelanjutnya.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView namaDosen;
        private final TextView materi;
        private final ImageView avatarDosen;

        public ViewHolder(ItemKelasSelanjutnyaBinding binding) {
            super(binding.getRoot());
            namaDosen = binding.txtNamaDosenPangajar;
            materi = binding.txtMateri;
            avatarDosen = binding.imgDosenPengajar;
        }
    }
}
