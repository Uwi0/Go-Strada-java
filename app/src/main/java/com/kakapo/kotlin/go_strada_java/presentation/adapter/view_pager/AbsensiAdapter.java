package com.kakapo.kotlin.go_strada_java.presentation.adapter.view_pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_absensi_fragment.absen_hari_jumat_fragment.AbsenHariJumatFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_absensi_fragment.absen_hari_kamis_fragment.AbsenHariKamisFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_absensi_fragment.absen_hari_rabu_fragment.AbsenHariRabuFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_absensi_fragment.absen_hari_sabtu_fragment.AbsenHariSabtuFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_absensi_fragment.absen_hari_selasa_fragment.AbsenHariSelasaFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_absensi_fragment.absen_hari_senin_fragment.AbsenHariSeninFragment;

public class AbsensiAdapter extends FragmentStateAdapter {

    private final static int NUM_TABS = 6;

    public AbsensiAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0){
            return new AbsenHariSeninFragment();
        }else if (position == 1){
            return new AbsenHariSelasaFragment();
        }else if (position == 2){
            return new AbsenHariRabuFragment();
        }else if (position == 3){
            return new AbsenHariKamisFragment();
        }else if (position == 4){
            return new AbsenHariJumatFragment();
        }else{
            return new AbsenHariSabtuFragment();
        }
    }

    @Override
    public int getItemCount() {
        return NUM_TABS;
    }
}
