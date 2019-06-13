package com.ourride.ui.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.ourride.R;
import com.ourride.constant.Constant;
import com.ourride.ui.fragment.AddFamilyMemberFragment;
import com.ourride.ui.fragment.AddVehicleFragment;
import com.ourride.ui.fragment.HistoryFragment;
import com.ourride.ui.fragment.HomeFragment;
import com.ourride.ui.fragment.PlanFragment;
import com.ourride.ui.fragment.ProfileFragment;

public class HomeActivity extends AppCompatActivity
        implements View.OnClickListener {

    private Button btn_proceed;
    Context context;
    private Toolbar toolbar;

    private static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        context = this;

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        ((TextView) findViewById(R.id.nav_book_a_ride)).setOnClickListener(this);
        ((TextView) findViewById(R.id.nav_plan)).setOnClickListener(this);
        ((TextView) findViewById(R.id.nav_history)).setOnClickListener(this);
        ((TextView) findViewById(R.id.nav_vehicle)).setOnClickListener(this);
        ((TextView) findViewById(R.id.nav_profile)).setOnClickListener(this);
        ((TextView) findViewById(R.id.nav_home)).setOnClickListener(this);
        ((TextView) findViewById(R.id.nav_add_familymember)).setOnClickListener(this);
        ((TextView) findViewById(R.id.nav_logout)).setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();

        if (savedInstanceState == null) {
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.home_frame, new HomeFragment(), Constant.HomeFragment).commit();
        }


    }

    // Replace Login Fragment with animation
    public void replaceLoginFragment() {
        fragmentManager
                .beginTransaction()
                .replace(R.id.home_frame, new HomeFragment(),
                        Constant.HomeFragment).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nav_book_a_ride:
                toolbar.setTitle("Book A Ride");
                fragmentManager.beginTransaction().replace(R.id.home_frame, new HomeFragment(), Constant.HomeFragment).commit();
                onBackPressed();
                break;
            case R.id.nav_plan:
                toolbar.setTitle("Plan");
                fragmentManager.beginTransaction().replace(R.id.home_frame, new PlanFragment(), Constant.PlanFragment).commit();
                onBackPressed();
                break;
            case R.id.nav_history:
                toolbar.setTitle("History");
                fragmentManager.beginTransaction().replace(R.id.home_frame, new HistoryFragment(), Constant.HistoryFragment).commit();
                onBackPressed();
                break;
            case R.id.nav_vehicle:
                toolbar.setTitle("Vehicle");
                fragmentManager.beginTransaction().replace(R.id.home_frame, new AddVehicleFragment(), Constant.AddVehicleFragment).commit();
                onBackPressed();
                break;
            case R.id.nav_profile:
                toolbar.setTitle("Change Password");
                fragmentManager.beginTransaction().replace(R.id.home_frame, new ProfileFragment(), Constant.ProfileFragment).commit();
                onBackPressed();
                break;
            case R.id.nav_home:
                toolbar.setTitle("Home");
                fragmentManager.beginTransaction().replace(R.id.home_frame, new ProfileFragment(), Constant.ProfileFragment).commit();
                onBackPressed();
                break;
            case R.id.nav_add_familymember:
                toolbar.setTitle("Add Family Member");
                fragmentManager.beginTransaction().replace(R.id.home_frame, new AddFamilyMemberFragment(), Constant.AddFamilyMemberFragment).commit();
                onBackPressed();
                break;
            case R.id.nav_logout:
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                break;

        }

        /*        }*//* else if (id == R.id.nav_change_password) {
            Intent intent = new Intent(HomeActivity.this, ResetveRideActivity.class);
            startActivity(intent);
        }*//* else if (id == R.id.nav_logout) {
            Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();*/

    }
}
