package com.kakapo.kotlin.go_strada_java.presentation;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.kakapo.kotlin.go_strada_java.R;
import com.kakapo.kotlin.go_strada_java.databinding.ActivityMainBinding;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private NavController navController;
    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        navController = Navigation.findNavController(this, R.id.main_nav_host);

        setupAppBarLayoutTitle();
        inflateActionBarInLayout();
        inflateTitleActionBarWithNavFragment();
        hideVisibilityBottomNavInSomeFragment(navController);

    }

    @Override
    public void onBackPressed() {
        boolean checkDrawer = binding.mainDrawerLayout.isDrawerOpen(GravityCompat.START);
        if (checkDrawer) {
            binding.mainDrawerLayout.closeDrawer(GravityCompat.START);
        }
        super.onBackPressed();
    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, appBarConfiguration);
    }

    private void setupAppBarLayoutTitle() {
        appBarConfiguration =
                new AppBarConfiguration.Builder(
                        R.id.homeFragment,
                        R.id.kelasFragment,
                        R.id.konsultasiFragment,
                        R.id.aktivitasFragment
                )
                        .setOpenableLayout(binding.mainDrawerLayout)
                        .build();
    }

    private void inflateActionBarInLayout() {
        setSupportActionBar(binding.mainToolbar);
    }

    private void inflateTitleActionBarWithNavFragment() {
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }

    private void hideVisibilityBottomNavInSomeFragment(NavController navController) {
        navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
            hideNavigationFromScreen(destination.getId());
        });
    }

    private void hideNavigationFromScreen(int id) {
        if (id == R.id.menu_absensi) {
            hideBothNavigation();
        } else if (id == R.id.menu_jadwal_kuliah) {
            hideBothNavigation();
        } else if (id == R.id.menu_kalender_akademik) {
            hideBothNavigation();
        } else if (id == R.id.menu_lihat_khs) {
            hideBothNavigation();
        } else if (id == R.id.menu_none_akademik) {
            hideBothNavigation();
        } else if (id == R.id.menu_pembayaran_spp) {
            hideBothNavigation();
        } else if (id == R.id.menu_request_surat) {
            hideBothNavigation();
        } else if (id == R.id.menu_riwayat_krs) {
            hideBothNavigation();
        } else if (id == R.id.menu_transkrip_nilai) {
            hideBothNavigation();
        } else {
            showBothNavigation();
        }
    }

    private void hideBothNavigation() {
        binding.mainBottomNavigationView.setVisibility(View.GONE);
        binding.mainNavigationView.setVisibility(View.GONE);
        binding.mainDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);
    }

    private void hideBottomNavigation() {
        binding.mainBottomNavigationView.setVisibility(View.GONE);
        binding.mainNavigationView.setVisibility(View.VISIBLE);
        binding.mainDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);

        NavigationUI.setupWithNavController(binding.mainNavigationView, navController);
    }

    private void showBothNavigation() {
        binding.mainBottomNavigationView.setVisibility(View.VISIBLE);
        binding.mainNavigationView.setVisibility(View.VISIBLE);
        binding.mainDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
        setupNavController();
    }

    private void setupNavController() {
        NavigationUI.setupWithNavController(binding.mainNavigationView, navController);
        NavigationUI.setupWithNavController(binding.mainBottomNavigationView, navController);
    }

    private void exitApp() {
        this.finishAffinity();
    }



}