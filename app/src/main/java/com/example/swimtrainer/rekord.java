package com.example.swimtrainer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class rekord extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rekord);

ViewPager2 viewPager2=findViewById(R.id.view_pager);
viewPager2.setAdapter(new fragmentadapter(this));
        TabLayout tabLayout=findViewById(R.id.tab_layout);
        TabLayoutMediator tabLayoutMediator= new TabLayoutMediator(
                tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch(position)
                {
                    case 0:{
                        tab.setText("Rekordy Polski");
                        tab.setIcon(R.drawable.ic_baseline_timer_24);
                        break;
                    }
                    case 1:{
                        tab.setText("Rekordy świata");
                        tab.setIcon(R.drawable.ic_baseline_timer_24);
                        break;
                    }

                }
            }
        }
        );
        tabLayoutMediator.attach();
    }
}
