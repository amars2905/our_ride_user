package com.ourride.ui.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ourride.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_sign_in, btn_sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }

    private void init()
    {
        btn_sign_in = findViewById(R.id.btn_sign_in);
        btn_sign_up = findViewById(R.id.btn_sign_up);

        btn_sign_in.setOnClickListener(this);
        btn_sign_up.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_sign_in :

                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);

                break;

            case R.id.btn_sign_up :
                Intent intent2 = new Intent(LoginActivity.this, MobileNumberActivity.class);
                startActivity(intent2);
                break;

        }
    }
}
