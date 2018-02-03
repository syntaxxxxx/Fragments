package com.fiqri.u_language;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fiqri.u_language.Adapter.CategoryAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Menemukan atau mengenalkan ViewPagernya
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Supaya adapter tau mana yang harus ditampilkan setiap halaman makanya dia menghubungkan dengan si CategoryAdapter
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        // Menghubungkan dan mengatur agar terhubung
        viewPager.setAdapter(adapter);

        // Mencari tataletak tabs yang dituju
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Mengatur tablayout agar dia terhubung ViewPager
        tabLayout.setupWithViewPager(viewPager);
    }
}