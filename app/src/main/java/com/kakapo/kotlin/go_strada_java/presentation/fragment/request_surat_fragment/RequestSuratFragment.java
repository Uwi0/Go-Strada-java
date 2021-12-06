package com.kakapo.kotlin.go_strada_java.presentation.fragment.request_surat_fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.kakapo.kotlin.go_strada_java.R;
import com.kakapo.kotlin.go_strada_java.databinding.RequestSuratFragmentBinding;
import com.kakapo.kotlin.go_strada_java.presentation.adapter.view_pager.RequestSuratAdapter;

import java.util.ArrayList;
import java.util.List;

public class RequestSuratFragment extends Fragment {

    private final static String[] requestMenu = {
            "Request",
            "Approved",
            "Guide"
    };

    private RequestSuratViewModel mViewModel;
    private RequestSuratFragmentBinding binding;
    private FragmentActivity myContext;

    public static RequestSuratFragment newInstance() {
        return new RequestSuratFragment();
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = RequestSuratFragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(RequestSuratViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onAttach(@NonNull Context context) {
        myContext = getActivity();
        super.onAttach(context);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager2 viewPager = binding.viewPager;
        TabLayout tablayout = binding.tabLayout;

        RequestSuratAdapter adapter = new RequestSuratAdapter(
                myContext.getSupportFragmentManager(),
                getLifecycle()
        );

        viewPager.setAdapter(adapter);

        new TabLayoutMediator(tablayout, viewPager, (tab, position) -> {
            tab.setText(requestMenu[position]);
        }).attach();
    }

    private void createDropDownMenuAdapter(){
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                requireActivity(),
                R.layout.item_simple_menu,
                fakeListDropDownMenu()
        );

        binding.txtAutoComplete.setAdapter(adapter);
    }

    private List<String> fakeListDropDownMenu(){
        ArrayList<String> menu = new ArrayList<>();
        menu.add("semester 1");
        menu.add("semester 2");
        menu.add("semester 3");
        menu.add("semester 4");
        menu.add("semester 5");

        return menu;
    }
}