package com.jsy3949.mytoolbar;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        toolbar.findViewById(R.id.toolbar_email).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"메시지 없음",Toast.LENGTH_LONG).show();
            }
        });

        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,0,0);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.main_navigationView);

        //앱이 실행되면서 첫번째 프래그먼트 화면을 호출하는 기능
        getFragmentManager().beginTransaction().replace(R.id.main_frameLayout , new FirstFragment()).commit();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.first){
                    getFragmentManager().beginTransaction().replace(R.id.main_frameLayout, new FirstFragment()).commit();
                }
                if (item.getItemId() == R.id.second){
                    getFragmentManager().beginTransaction().replace(R.id.main_frameLayout, new SecondFragment()).commit();
                }
                if (item.getItemId() == R.id.third){
                    getFragmentManager().beginTransaction().replace(R.id.main_frameLayout, new ThirdFragment()).commit();
                }
                if (item.getItemId() == R.id.fourth){
                    getFragmentManager().beginTransaction().replace(R.id.main_frameLayout, new FourthFragment()).commit();
                }
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });
        /*로고 클릭시 , 메인화면을 호출해서 표현하는 기능*/
        ImageView imageView_logo = (ImageView)findViewById(R.id.logo);
        imageView_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().replace(R.id.main_frameLayout,new FirstFragment()).commit();
            }
        });

    }
    public void onProductLink01(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.memebox.com/product/24574"));
        startActivity(intent);
    }
    public void onProductLink02(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW , Uri.parse("https://www.memebox.com/product/24574"));
        startActivity(intent);
    }
}
