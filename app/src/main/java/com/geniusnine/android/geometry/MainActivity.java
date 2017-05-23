package com.geniusnine.android.geometry;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.geniusnine.android.geometry.AreaCalculator.AreaCalculator;
import com.geniusnine.android.geometry.SlopeCalculator.SlopeCalculator;
import com.geniusnine.android.geometry.SurfaceArea.SurfaceArea;
import com.geniusnine.android.geometry.TriangleCalculator.TriangleCalculator;
import com.geniusnine.android.geometry.VolumeCalculator.VolumeCalculator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private CustomAdapter mAdapter;
    private ArrayList<String> listCountry;
    private ArrayList<Integer> listFlag;


    private GridView gridView;

    FragmentManager mFragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        prepareList();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        mAdapter = new CustomAdapter(this, listCountry, listFlag);

        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(mAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position == 0) {
                    Intent i = new Intent(MainActivity.this, TriangleCalculator.class);
                    finish();
                    startActivity(i);

                }
              if (position == 1) {
                    Intent i = new Intent(MainActivity.this, VolumeCalculator.class);
                    finish();
                    startActivity(i);

                }
           if (position == 2) {
                    Intent i = new Intent(MainActivity.this, AreaCalculator.class);
                    finish();
                    startActivity(i);

                }
              if (position == 3) {
                    Intent i = new Intent(MainActivity.this, SlopeCalculator.class);
                    finish();
                    startActivity(i);

                }

             if (position == 4) {
                    Intent i = new Intent(MainActivity.this, SurfaceArea.class);
                    finish();
                    startActivity(i);

                }

                if (position == 5) {
                    Intent i = new Intent(MainActivity.this, CircleAreaCal.class);
                    finish();
                    startActivity(i);

                }


            }
        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    public void prepareList() {
        listCountry = new ArrayList<String>();

        listCountry.add("Triangle");
        listCountry.add("Volume ");
        listCountry.add("Area ");
        listCountry.add("Slope ");
        listCountry.add("Surface Area");
        listCountry.add("Circle ");

        listFlag = new ArrayList<Integer>();
        listFlag.add(R.drawable.triangle);
        listFlag.add(R.drawable.volumeareapic);
        listFlag.add(R.drawable.areacalpic);
        listFlag.add(R.drawable.righttriangle);
        listFlag.add(R.drawable.cone);
        listFlag.add(R.drawable.circleareapic);


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
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

       /* if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
