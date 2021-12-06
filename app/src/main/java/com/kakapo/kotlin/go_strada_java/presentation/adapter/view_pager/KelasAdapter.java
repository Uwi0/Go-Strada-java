package com.kakapo.kotlin.go_strada_java.presentation.adapter.view_pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_kelas_fragment.kelas_hari_ini_fragment.KelasHariIniFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_kelas_fragment.kelas_selanjutnya_fragment.KelasSelanjutnyaFragment;

public class KelasAdapter extends FragmentStateAdapter {
    final static int NUM_TABS = 2;
    FragmentManager fragmentManager;
    Lifecycle lifecycle;

    public KelasAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        this.fragmentManager = fragmentManager;
        this.lifecycle = lifecycle;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new KelasHariIniFragment();
        } else {
            return new KelasSelanjutnyaFragment();
        }
    }

    @Override
    public int getItemCount() {
        return NUM_TABS;
    }
}
