package com.example.swimtrainer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class fragmentadapter extends FragmentStateAdapter {


    public fragmentadapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
      switch (position)
      {
          case 0:
              return new fragrekordy2();
          default:
              return new fragrekordy3();


      }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
