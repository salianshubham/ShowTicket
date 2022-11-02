package com.example.showticket;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class comedyFragment extends Fragment {


    public comedyFragment() {
        // Required empty public constructor
    }
    ImageView kenny_sebastian,abhishek_upmanyu,anubhav_singh_bassi,zakir_khan,vir_das,kapil_sharma;
    Bundle bundle = new Bundle();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comedy, container, false);
//        //*********CONCERT***************************************************************
        kenny_sebastian = view.findViewById(R.id.kenny_sebastian);
        abhishek_upmanyu = view.findViewById(R.id.abhishek_upmanyu);
        anubhav_singh_bassi = view.findViewById(R.id.anubhav_singh_bassi);
        zakir_khan = view.findViewById(R.id.zakir_khan);
        vir_das = view.findViewById(R.id.vir_das);
        kapil_sharma = view.findViewById(R.id.kapil_sharma);
////        //***********COMEDY ONCLICK***************************************************
        kenny_sebastian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("kenny_sebastian","kenny_sebastian");
                loadfrag(new selectMovie(),bundle);
            }
        });
////
        abhishek_upmanyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("abhishek_upmanyu","abhishek_upmanyu");
                loadfrag(new selectMovie(),bundle);
            }
        });
////
        anubhav_singh_bassi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("anubhav_singh_bassi","anubhav_singh_bassi");
                loadfrag(new selectMovie(),bundle);
            }
        });
////
        zakir_khan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("zakir_khan","zakir_khan");
                loadfrag(new selectMovie(),bundle);
            }
        });
////
        vir_das.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("vir_das","vir_das");
                loadfrag(new selectMovie(),bundle);
            }
        });
////
        kapil_sharma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("kapil_sharma","kapil_sharma");
                loadfrag(new selectMovie(),bundle);
            }
        });
        return  view;
    }

    public void loadfrag(Fragment fragment,Bundle bundle){
        FragmentManager fm = getParentFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragment.setArguments(bundle);
        ft.replace(R.id.comedy_container,fragment).addToBackStack(null).commit();
    }
}