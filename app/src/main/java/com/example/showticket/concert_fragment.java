package com.example.showticket;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class concert_fragment extends Fragment {



    public concert_fragment() {
        // Required empty public constructor
    }

    ImageView live_music,rock_concert,music_nagin,jazz_music,red_rock_music,crystalyne;
    Bundle bundle = new Bundle();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_concert_fragment, container, false);
//        //*********CONCERT***************************************************************
        live_music = view.findViewById(R.id.live_music);
        rock_concert = view.findViewById(R.id.rock_concert);
        music_nagin = view.findViewById(R.id.music_nagin);
        jazz_music = view.findViewById(R.id.jazz_music);
        red_rock_music = view.findViewById(R.id.red_rock_music);
        crystalyne = view.findViewById(R.id.crystalyne);
//        //***********CONCERT ONCLICK***************************************************
        live_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("live_music","live_music");
                loadfrag(new selectMovie(),bundle);
            }
        });
//
        rock_concert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("rock_concert","rock_concert");
                loadfrag(new selectMovie(),bundle);
            }
        });
//
        music_nagin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("music_nagin","music_nagin");
                loadfrag(new selectMovie(),bundle);
            }
        });
////
        jazz_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("jazz_music","jazz_music");
                loadfrag(new selectMovie(),bundle);
            }
        });
//
        red_rock_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("red_rock_music","red_rock_music");
                loadfrag(new selectMovie(),bundle);
            }
        });
////
        crystalyne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("crystalyne","crystalyne");
                loadfrag(new selectMovie(),bundle);
            }
        });
        return  view;
    }

    public void loadfrag(Fragment fragment,Bundle bundle){
        FragmentManager fm = getParentFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragment.setArguments(bundle);
        ft.replace(R.id.concert_container,fragment).addToBackStack(null).commit();
    }
}