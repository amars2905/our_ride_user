package com.ourride.ui.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ourride.R;

public class MobileNumberActivity extends AppCompatActivity {

    private Button btn_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_number);

        btn_number = findViewById(R.id.btn_number);

        btn_number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MobileNumberActivity.this, OtpActivity.class);
                startActivity(intent);
            }
        });
    }
}
