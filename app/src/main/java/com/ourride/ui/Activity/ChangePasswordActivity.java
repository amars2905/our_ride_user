package com.ourride.ui.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.ourride.R;
import com.ourride.utils.BaseActivity;


public class ChangePasswordActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        ((ImageView) findViewById(R.id.ivBack)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ivBack:
                onBackPressed();
                break;
        }
    }
}
