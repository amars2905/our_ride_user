package com.ourride.adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;


import com.ourride.R;
import com.ourride.model.VehicleListModel;

import java.util.ArrayList;

public class VehicleListAdapter extends RecyclerView.Adapter<VehicleListAdapter.ViewHolder> {

    public ArrayList<String> vehicleListModels;
    Context context;
    private View.OnClickListener onClickListener;



    public VehicleListAdapter(Context context, ArrayList<String> vehicleListModels, View.OnClickListener onClickListener) {

        this.vehicleListModels = vehicleListModels;
        this.context = context;
        this.onClickListener = onClickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvName,tvPath;
        public ImageView btn_detail;
        public LinearLayout vehicle_layout;
        public ViewHolder(View v) {
            super(v);

            btn_detail = v.findViewById(R.id.btn_detail);
            vehicle_layout = v.findViewById(R.id.vehicle_layout);

        }

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_vehicle, parent, false);

        ViewHolder viewHolder1 = new ViewHolder(view);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(final ViewHolder Vholder, final int position) {


        Vholder.btn_detail.setTag(position);
        Vholder.btn_detail.setOnClickListener(onClickListener);

        Vholder.vehicle_layout.setTag(position);
        Vholder.vehicle_layout.setOnClickListener(onClickListener);

    }

    @Override
    public int getItemCount() {

        return vehicleListModels.size();
    }
}
