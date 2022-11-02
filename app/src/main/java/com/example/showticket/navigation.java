package com.example.showticket;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.sax.RootElement;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class navigation extends AppCompatActivity {
    BottomNavigationView btnNavView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        btnNavView = findViewById(R.id.bottomNav);
        int flag = 0;
        loadfragment(new homeFragment(),1);
        btnNavView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if(id == R.id.home){
                    loadfragment(new homeFragment(),0);
                }
//                else if(id == R.id.ticket){
//                    loadfragment(new ticketFragment(),0);
//                }
                else if(id == R.id.user){
                    loadfragment(new userFragment(),0);
                }
//                else if(id == R.id.notification){
//                    loadfragment(new notificationFragment(),0);
//
//                }
                else{
                    loadfragment(new helpFragment(),0);
                }

                return true;
            }
        });

    }
    public void loadfragment(Fragment fragment,int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag == 0){

            ft.replace(R.id.container,fragment);
        }
        else{
            ft.add(R.id.container,fragment);
        }
        ft.commit();
    }

}

