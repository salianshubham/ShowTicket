package com.example.showticket;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class dramafragment extends Fragment {

    public dramafragment() {
        // Required empty public constructor
    }
    ImageView remember,first_kill,table_for_two,drama_ratu_drama,family_drama,the_train_of_love;
    Bundle bundle = new Bundle();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dramafragment, container, false);
        //*********DRAMA***************************************************************
        remember = view.findViewById(R.id.remember);
        first_kill = view.findViewById(R.id.first_kill);
        table_for_two = view.findViewById(R.id.table_for_two);
        drama_ratu_drama = view.findViewById(R.id.drama_ratu_drama);
        family_drama = view.findViewById(R.id.family_drama);
        the_train_of_love = view.findViewById(R.id.the_train_of_love);
        //***********DRAMA ONCLICK***************************************************
        remember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("remember","remember");
                loadfrag(new selectMovie(),bundle);
            }
        });

        first_kill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("first_kill","first_kill");
                loadfrag(new selectMovie(),bundle);
            }
        });

        table_for_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("table_for_two","table_for_two");
                loadfrag(new selectMovie(),bundle);
            }
        });
//
        drama_ratu_drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("drama_ratu_drama","drama_ratu_drama");
                loadfrag(new selectMovie(),bundle);
            }
        });
//
        family_drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("family_drama","family_drama");
                loadfrag(new selectMovie(),bundle);
            }
        });
//
        the_train_of_love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("the_train_of_love","the_train_of_love");
                loadfrag(new selectMovie(),bundle);
            }
        });
        return view;
    }
    public void loadfrag(Fragment fragment,Bundle bundle){
        FragmentManager fm = getParentFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragment.setArguments(bundle);
        ft.replace(R.id.drama_container,fragment).addToBackStack(null).commit();
    }
}