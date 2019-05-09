package com.ourride.ui.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ourride.R;

public class PlanFragment extends Fragment {

    public PlanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_plan, container, false);

        ViewPager pager = (ViewPager) view.findViewById(R.id.pager);
        pager.setAdapter(new MyPagerAdapter(getActivity().getSupportFragmentManager()));

        return view;
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int pos) {
            switch (pos) {
                case 0:
                    return FragmentPlanViewPager.newInstance("VIP Membership","$20","12 Month Minimum","Explore the basics with this \n introductory course","Priority Pickup\n\n" +
                            "Member Rates on All Services\n\n" +
                            "Unlimited Use of On-Demand Pickup Service (8 uses per month max)\n\n" +
                            "No Fees for On-Demand Pickup Service\n\n" +
                            "Personal Driver Service $20 per Hour\n\n" +
                            "Scheduled Reservations\n\n" +
                            "Membership Guide&amp; Keytag");
                case 1:
                    return FragmentPlanViewPager.newInstance("Fee Preferred Membership","$50","(up to 10 Miles)$1 per mile after","Explore the basics with this \n introductory course","Priority Pickup Over Non-Members\n\n" +
                            "Access to All Services\n\n" +
                            "Member Rates on All Services\n\n" +
                            "On-Demand Pickup Service\n\n" +
                            "Personal Driver Service $25 per Hour\n\n" +
                            "Scheduled Reservations\n\n" +
                            "Covers an Additional Family Member");
                case 2:
                    return FragmentPlanViewPager.newInstance("Family Membership","$30","12 Month Minimum","Explore the basics with this \n introductory course","Priority Pickup Over Non-Members\n\n" +
                            "Access to All Services\n\n" +
                            "Member Rates on All Services\n\n" +
                            "On-Demand Pickup Service $25 plus $3.00 per Mile\n\n" +
                            "Personal Driver Service$30 per Hour\n\n" +
                            "Covers an Additional Family Member\n\n" +
                            "12 Month Minimum");
                default:
                    return FragmentPlanViewPager.newInstance("Beginner","30","VALID FOR 15 YEAR","Explore the basics with this \n introductory course","6 classes \n\n 3 individual sessions \n\nOnline resources");
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

}
