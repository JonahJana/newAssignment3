package com.example.newassignment3;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragMangAdapter extends FragmentPagerAdapter {

    //private final List<Fragment> mFragmentList = new ArrayList<>();
    private Fragment[] mFragmentList;

    public FragMangAdapter(FragmentManager fm){
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        mFragmentList = new Fragment[]
                {
                        new Edit_Meetings(),
                        new View_Meetings()

                };

    }

    @Override
    public int getCount(){
        //notifyDataSetChanged();
        return mFragmentList.length;
    }

    @Override
    public Fragment getItem(int pos){
        return mFragmentList[pos];
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        String title = getItem(position).getClass().getName();
        return title.subSequence(title.lastIndexOf(".") + 1, title.length());
    }


//
//    public void addFragment(Fragment frag){
//        mFragmentList.add(frag);
//    }
}
