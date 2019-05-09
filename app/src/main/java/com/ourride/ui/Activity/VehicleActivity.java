package com.ourride.ui.Activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.ourride.R;
import com.ourride.adapter.VehicleListAdapter;
import com.ourride.model.VehicleListModel;

import java.util.ArrayList;

public class VehicleActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView rv_vehicle_list;
    private ArrayList<String> vehicleListModels = new ArrayList<>();
    private VehicleListAdapter adapter;
    private TextView add_vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        init();
    }

    public void init(){
        rv_vehicle_list = findViewById(R.id.rv_vehicle_list);
        add_vehicle = findViewById(R.id.add_vehicle);
        add_vehicle.setOnClickListener(this);


        for (int i=0 ; i < 20 ; i++)
        {
            vehicleListModels.add("amardeep");
        }

        adapter = new VehicleListAdapter(this,vehicleListModels,this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        rv_vehicle_list.setLayoutManager(mLayoutManager);
        rv_vehicle_list.setItemAnimator(new DefaultItemAnimator());
        rv_vehicle_list.setAdapter(adapter);



    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btn_detail :

                int pos = Integer.parseInt(view.getTag().toString());
                String s = vehicleListModels.get(pos).toString();

                showDialog(this, s);

                break;

            case R.id.vehicle_layout :

                int pos1 = Integer.parseInt(view.getTag().toString());
                String s1 = vehicleListModels.get(pos1).toString();
                Intent intent = new Intent(this, ReservRide2Activity.class);
                startActivity(intent);
                break;

            case R.id.add_vehicle :

                Intent intent1 = new Intent(this, ResetveRideActivity.class);
                startActivity(intent1);
                break;
        }
    }


    public void showDialog(Activity activity, String msg){
        final Dialog dialog = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog_vehicle);



        Button btnRemove = (Button) dialog.findViewById(R.id.btn_remove);
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        Button btnUpdate = (Button) dialog.findViewById(R.id.btn_update);
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }
}
