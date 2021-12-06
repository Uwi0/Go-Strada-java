package com.kakapo.kotlin.go_strada_java.presentation.adapter.view_pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_kuliah.jadwal_hari_jumat_fragment.JadwalHariJumatFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_kuliah.jadwal_hari_kamis_fragment.JadwalHariKamisFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_kuliah.jadwal_hari_rabu_fragment.JadwalHariRabuFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_kuliah.jadwal_hari_sabtu_fragment.JadwalHariSabtuFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_kuliah.jadwal_hari_selasa_fragment.JadwalHariSelasaFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_jadwal_kuliah.jadwal_hari_senin_fragment.JadwalHariSeninFragment;


public class JadwalAdapter extends FragmentStateAdapter {

    final static int NUM_TABS = 6;

    public JadwalAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new JadwalHariSeninFragment();
        } else if (position == 1) {
            return new JadwalHariSelasaFragment();
        } else if (position == 2) {
            return new JadwalHariRabuFragment();
        } else if (position == 3) {
            return new JadwalHariKamisFragment();
        } else if (position == 4) {
            return new JadwalHariJumatFragment();
        } else {
            return new JadwalHariSabtuFragment();
        }
    }

    @Override
    public int getItemCount() {
        return NUM_TABS;
    }
}
