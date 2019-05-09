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
import com.ourride.ui.Activity.EditProfileActivity;


public class ProfileFragment extends Fragment implements View.OnClickListener {

    private Button btn_edit_profile;
    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        btn_edit_profile = view.findViewById(R.id.btn_edit_profile);
        btn_edit_profile.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_edit_profile:
                Intent integer = new Intent(getActivity(), EditProfileActivity.class);
                startActivity(integer);
                break;
        }
    }
}
