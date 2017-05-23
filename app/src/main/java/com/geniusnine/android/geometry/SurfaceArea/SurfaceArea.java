package com.geniusnine.android.geometry.SurfaceArea;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.geniusnine.android.geometry.MainActivity;
import com.geniusnine.android.geometry.R;
import com.geniusnine.android.geometry.VolumeCalculator.CapVolume;
import com.geniusnine.android.geometry.VolumeCalculator.ConicalVolume;
import com.geniusnine.android.geometry.VolumeCalculator.EllipsoidVolume;
import com.geniusnine.android.geometry.VolumeCalculator.SquareVolume;

public class SurfaceArea extends AppCompatActivity  implements  TabLayout.OnTabSelectedListener{
    private TabLayout tabLayout;

    //This is our viewPager

    FrameLayout simpleFrameLayout;
    private FragmentPagerAdapter mPagerAdapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface_area);

        mPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            private final Fragment[] mFragments = new Fragment[] {
                    new BallSurfaceArea(),
                    new CubeSurface(),
                    new ConeSurfaceArea(),

                    new CylindricalSurfaceArea(),
                    new CapsuleSurfaceArea(),
                    new SquarePyramidSurface(),
                    new RectangularSurfaceArea(),
                    new CapSurfaceArea(),
                    new ConicalSurfaceArea(),
                    new EllipsoidSurfaceArea()
            };
            private final String[] mFragmentNames = new String[] {
                    getString(R.string.app_name11),
                    getString(R.string.app_name13),
                    getString(R.string.app_name12),
                    getString(R.string.app_name14),
                    getString(R.string.app_name45),
                    getString(R.string.app_name20),
                    getString(R.string.app_name15),
                    getString(R.string.app_name17),
                    getString(R.string.app_name18),
                    getString(R.string.app_name19),
            };
            @Override
            public Fragment getItem(int position) {
                return mFragments[position];
            }
            @Override
            public int getCount() {
                return mFragments.length;
            }

            public CharSequence getPageTitle(int position) {
                return mFragmentNames[position];
            }

        };

        viewPager = (ViewPager) findViewById(R.id.pagerSurfaceArea);
        viewPager.setAdapter(mPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayoutSurfaceArea);
        tabLayout.setupWithViewPager(viewPager);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            Intent intent=new Intent(SurfaceArea.this,MainActivity.class);
            //    finish();
            startActivity(intent);


        }


        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:

                Intent intent=new Intent(SurfaceArea.this,MainActivity.class);
                finish();
                startActivity(intent);

                return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}

