package com.example.showticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);
        textView = findViewById(R.id.textView);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences pref = getSharedPreferences("login",MODE_PRIVATE);
                Boolean check = pref.getBoolean("flag",false);
                Intent intent;
                if(check){
                    intent = new Intent(MainActivity.this,navigation.class);
                }
                else{
                    intent = new Intent(MainActivity.this,Login.class);
                }
                startActivity(intent);
                finish();
            }
        },4000);
        Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.animation);
        logo.startAnimation(animation);
        textView.startAnimation(animation);
    }
}