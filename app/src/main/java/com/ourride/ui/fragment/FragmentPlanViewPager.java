package com.ourride.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ourride.R;

public class FragmentPlanViewPager extends android.support.v4.app.Fragment {
    TextView tv_rules, tv_plan_detail, tv_plan_price, tv_plan_name, tv_validete;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_plan_view_pager, container, false);

        tv_plan_name = v.findViewById(R.id.tv_title);
        tv_plan_detail = v.findViewById(R.id.tv_place_detail);
        tv_plan_price = v.findViewById(R.id.tv_price);
        tv_rules = v.findViewById(R.id.tv_rules);
        tv_validete = v.findViewById(R.id.tv_validete);

        tv_plan_name.setText(getArguments().getString("plan_name"));
        tv_plan_price.setText(getArguments().getString("plan_price"));
        tv_plan_detail.setText(getArguments().getString("plan_detail"));
        tv_rules.setText(getArguments().getString("plan_rule"));
        tv_validete.setText(getArguments().getString("plan_validite"));
        return v;
    }

    public static FragmentPlanViewPager newInstance(String plan_name,String plan_price,String plan_validite,String plan_detial,String plan_rule) {

        FragmentPlanViewPager f = new FragmentPlanViewPager();
        Bundle b = new Bundle();
        b.putString("plan_name", plan_name);
        b.putString("plan_price", plan_price);
        b.putString("plan_validite", plan_validite);
        b.putString("plan_detail", plan_detial);
        b.putString("plan_rule", plan_rule);

        f.setArguments(b);

        return f;
    }
}
