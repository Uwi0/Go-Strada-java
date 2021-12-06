package com.kakapo.kotlin.go_strada_java.presentation.adapter.view_pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_request_surat_fragment.approved_fragment.ApprovedFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_request_surat_fragment.guide_fragment.GuideFragment;
import com.kakapo.kotlin.go_strada_java.presentation.fragment.menu_request_surat_fragment.request_fragment.RequestFragment;

public class RequestSuratAdapter extends FragmentStateAdapter {

    final static int NUM_TABS = 2;

    public RequestSuratAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new RequestFragment();
        } else if (position == 1) {
            return new ApprovedFragment();
        } else {
            return new GuideFragment();
        }
    }

    @Override
    public int getItemCount() {
        return NUM_TABS;
    }
}
