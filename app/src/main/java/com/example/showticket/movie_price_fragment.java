package com.example.showticket;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import pl.droidsonroids.gif.GifImageView;


public class movie_price_fragment extends Fragment {


    public movie_price_fragment() {
        // Required empty public constructor
    }

    Button confirmBooking,royal,gold,silver;
    TextView seats,movieDate,moviePrice;
    GifImageView checkMark;
    int num,price;
    String date;
    private static final String save_seats = "seats";
    private static final String save_date = "date";
    private static final String save_price = "price";
    private  static final String CHANNEL_ID = "mychannel";
    private  static final int NOTIFICATION_ID = 100;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // accept data from DateofShowfragment
        if(getArguments()!=null){
             date = getArguments().getString("date");
            num = getArguments().getInt("totalSeat");
        }

        View view =   inflater.inflate(R.layout.fragment_movie_price_fragment, container, false);
        //*************************************************************************
        checkMark = view.findViewById(R.id.checkmark);
        confirmBooking = view.findViewById(R.id.confirmbooking);
        royal = view.findViewById(R.id.royal);
        gold = view.findViewById(R.id.gold);
        silver = view.findViewById(R.id.silver);
        seats = view.findViewById(R.id.seats);
        movieDate = view.findViewById(R.id.movieDate);
        moviePrice = view.findViewById(R.id.moviePrice);
        String num1 = String.valueOf(num);

        seats.setText("Seats : "+num1);
        movieDate.setText(date);
        //*****NOtification**************************************************
        Drawable drawable = ResourcesCompat.getDrawable(getResources(),R.drawable.logo_png,null);
        BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
        Bitmap largeicon = bitmapDrawable.getBitmap();
        //*********************************************************************
        confirmBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String price1 = String.valueOf(price);
                SharedPreferences pref = getActivity().getSharedPreferences("login",Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putString(save_seats,num1);
                editor.putString(save_date,date);
                editor.putString(save_price,price1);
                editor.apply();
                editor.commit();
                checkMark.setVisibility(View.VISIBLE);
               // AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
              //  builder.setMessage("You have successfully booked a ticket").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
              //      @Override
               //     public void onClick(DialogInterface dialogInterface, int i) {
                        //***Notification******************
                        NotificationManager nm = (NotificationManager) getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
                        Notification notification;
                        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                            notification= new Notification.Builder(getActivity())
                                    .setLargeIcon(largeicon)
                                    .setSmallIcon(R.drawable.logo_png)
                                    .setContentText("Booking Successfull")
                                    .setSubText("Congratulations your ticket has been confirmed")
                                    .setChannelId(CHANNEL_ID)
                                    .build();
                            nm.createNotificationChannel(new NotificationChannel(CHANNEL_ID,"new channel",NotificationManager.IMPORTANCE_HIGH));
                        }else{
                            notification= new Notification.Builder(getActivity())
                                    .setLargeIcon(largeicon)
                                    .setSmallIcon(R.drawable.logo_png)
                                    .setContentText("Booking Successfull")
                                    .setSubText("Congratulations your ticket has been confirmed")
                                    .build();
                        }
                        nm.notify(NOTIFICATION_ID,notification);
                        //dialogInterface.cancel();
                        //***Intenet after pressing ok***
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Fragment homefragment = new homeFragment();
                        FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                        fm.replace(R.id.movie_price_pragment,homefragment).addToBackStack(null).commit();
                        confirmBooking.setVisibility(View.INVISIBLE);
                    }
                },4000);

              //      }

            //    });
             //   AlertDialog alert = builder.create();
             //   alert.setTitle("Congratulations");
            //    alert.show();

            }
        });

        royal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                price = num*500;
                moviePrice.setText(price+"Rs");
            }
        });
        gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               price = num*250;
                moviePrice.setText(price+"Rs");
            }
        });
        silver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                price = num*200;
                moviePrice.setText(price+"Rs");
            }
        });
        return view;

    }
}

