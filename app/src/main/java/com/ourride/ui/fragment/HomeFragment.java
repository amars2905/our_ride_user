package com.ourride.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ourride.R;
import com.ourride.ui.Activity.VehicleActivity;


public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button btn_proceed;

    public View view;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_home, container, false);

        init();

        return view;
    }

    public void init()
    {
        btn_proceed = view.findViewById(R.id.btn_proceed);
        btn_proceed.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_proceed :
                Intent intent = new Intent(getActivity(), VehicleActivity.class);
                startActivity(intent);

                break;
        }

    }
}
