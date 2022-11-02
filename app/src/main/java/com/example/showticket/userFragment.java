package com.example.showticket;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class userFragment extends Fragment {

    public userFragment() {
        // Required empty public constructor
    }

    CardView light,dark;
    TextView profilename1,profileemail1,orderSeats,orderdate,orderprice;
    Button logoutbtn;
    String email,name,seats,date,price;
    private static final String login_email = "login_email";
    private static final String profilename = "profilename";
    private static final String save_seats = "seats";
    private static final String save_date = "date";
    private static final String save_price = "price";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_user, container, false);
        SharedPreferences pref = getActivity().getSharedPreferences("login", Context.MODE_PRIVATE);
        email = pref.getString(login_email,null);
        name = pref.getString(profilename,null);
        seats = pref.getString(save_seats,null);
        date = pref.getString(save_date,null);
        price = pref.getString(save_price,null);
        light = view.findViewById(R.id.light);
        dark = view.findViewById(R.id.dark);
        logoutbtn = view.findViewById(R.id.logoutbtn);
        profilename1 = view.findViewById(R.id.profileName);
        profileemail1 = view.findViewById(R.id.profileemail);
        orderSeats = view.findViewById(R.id.orderSeats);
        orderdate = view.findViewById(R.id.orderdate);
        orderprice = view.findViewById(R.id.orderprice);
        profileemail1.setText(email);
        profilename1.setText(name);
        orderSeats.setText("seats:"+seats);
        orderdate.setText(date);
        orderprice.setText(price);

        //***Theme***
        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });
        dark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
        });

        //***on click Logout Button***
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences pref = getActivity().getSharedPreferences("login", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("flag",false);
                editor.apply();
                Intent intent = new Intent(getActivity(),Login.class);
                startActivity(intent);

            }
        });
        return view;
    }
}