package com.fiqri.u_language.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fiqri.u_language.Fragment.ColorsFragment;
import com.fiqri.u_language.Fragment.FamilyMembersFragment;
import com.fiqri.u_language.Fragment.NumbersFragment;
import com.fiqri.u_language.Fragment.PhrasesFragment;
import com.fiqri.u_language.R;

/**
 * Created by syntax on 31/01/18.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // Untuk mendapatkan wadah untuk menempatkan si page tittle
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyMembersFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else {
            return new PhrasesFragment();
        }
    }

    // Disini untuk mendaptkan jumlah halamannya
    @Override
    public int getCount() {
        return 4;
    }

    // Mendapatkan tittle halaman
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.category_family);
        } else if (position == 2) {
            return mContext.getString(R.string.category_colors);
        } else {
            return mContext.getString(R.string.category_phrases);
        }
    }
}
