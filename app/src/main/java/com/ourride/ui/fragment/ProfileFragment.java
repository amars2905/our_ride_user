package com.ourride.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ourride.R;
import com.ourride.ui.Activity.ChangePasswordActivity;
import com.ourride.utils.BaseFragment;


public class ProfileFragment extends BaseFragment implements View.OnClickListener {
    private View rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        mContext = getActivity();
        init();
        return rootView;
    }

    private void init() {
        ((TextView) rootView.findViewById(R.id.tvChangePassword)).setOnClickListener(this);
        //   tvEditProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvChangePassword:
                startActivity(new Intent(mContext, ChangePasswordActivity.class));
                break;
        }

    }
}
