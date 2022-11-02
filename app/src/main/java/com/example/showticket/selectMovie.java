package com.example.showticket;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;


public class selectMovie extends Fragment {

    Button select;
    ImageView display;
    LinearLayout trailer;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =  inflater.inflate(R.layout.fragment_select_movie, container, false);
        VideoView videoView = view.findViewById(R.id.videoView);
        trailer = view.findViewById(R.id.trailer);
        select = view.findViewById(R.id.select);
        display = view.findViewById(R.id.imagekantara);

        String kantara = getArguments().getString("kantara");
        String attack = getArguments().getString("attack");
        String rrr = getArguments().getString("rrr");
        String prithviraj = getArguments().getString("prithviraj");
        String heropanthi = getArguments().getString("heropanthi");
        String anthim = getArguments().getString("anthim");

        //********concert************************************************
        String live_music = getArguments().getString("live_music");
        String rock_concert = getArguments().getString("rock_concert");
        String music_nagin = getArguments().getString("music_nagin");
        String jazz_music = getArguments().getString("jazz_music");
        String red_rock_music = getArguments().getString("red_rock_music");
        String crystalyne = getArguments().getString("crystalyne");

        //********DRAMA************************************************
        String remember = getArguments().getString("remember");
        String first_kill = getArguments().getString("first_kill");
        String table_for_two = getArguments().getString("table_for_two");
        String drama_ratu_drama = getArguments().getString("drama_ratu_drama");
        String family_drama = getArguments().getString("family_drama");
        String the_train_of_love = getArguments().getString("the_train_of_love");

        //********COMEDY************************************************
        String kenny_sebastian = getArguments().getString("kenny_sebastian");
        String abhishek_upmanyu = getArguments().getString("abhishek_upmanyu");
        String anubhav_singh_bassi = getArguments().getString("anubhav_singh_bassi");
        String zakir_khan = getArguments().getString("zakir_khan");
        String vir_das = getArguments().getString("vir_das");
        String kapil_sharma = getArguments().getString("kapil_sharma");
        //video
        if(getArguments()!=null) {
            if (kantara == "kantara") {
                videoView.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.kantara);
                MediaController mediaController = new MediaController(getActivity());
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);
                videoView.pause();
                display.setImageResource(R.drawable.kantara);
                display.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.setVisibility(View.INVISIBLE);
                        trailer.setVisibility(View.INVISIBLE);
                        videoView.start();
                    }
                });
            }

            if (attack == "attack") {
                videoView.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.kantara);
                MediaController mediaController = new MediaController(getActivity());
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);
                videoView.pause();
                display.setImageResource(R.drawable.attack);
                display.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.setVisibility(View.INVISIBLE);
                        trailer.setVisibility(View.INVISIBLE);
                        videoView.start();
                    }
                });
            }

            if (rrr=="rrr") {
                videoView.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.kantara);
                MediaController mediaController = new MediaController(getActivity());
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);
                videoView.pause();
                display.setImageResource(R.drawable.rrr);
                display.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.setVisibility(View.INVISIBLE);
                        trailer.setVisibility(View.INVISIBLE);
                        videoView.start();
                    }
                });
            }

            if (prithviraj=="prithviraj") {
                videoView.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.kantara);
                MediaController mediaController = new MediaController(getActivity());
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);
                videoView.pause();
                display.setImageResource(R.drawable.prithviraj);
                display.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.setVisibility(View.INVISIBLE);
                        trailer.setVisibility(View.INVISIBLE);
                        videoView.start();
                    }
                });
            }

            if (heropanthi=="heropanthi") {
                videoView.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.kantara);
                MediaController mediaController = new MediaController(getActivity());
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);
                videoView.pause();
                display.setImageResource(R.drawable.heropanthi);
                display.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.setVisibility(View.INVISIBLE);
                        trailer.setVisibility(View.INVISIBLE);
                        videoView.start();
                    }
                });
            }

            if (anthim=="anthim") {
                videoView.setVideoPath("android.resource://" + getActivity().getPackageName() + "/" + R.raw.kantara);
                MediaController mediaController = new MediaController(getActivity());
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);
                videoView.pause();
                display.setImageResource(R.drawable.bhediya);
                display.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.setVisibility(View.INVISIBLE);
                        trailer.setVisibility(View.INVISIBLE);
                        videoView.start();
                    }
                });
            }
            //*************CONCERT CLICK************************************************************
            if (live_music=="live_music") {
                display.setImageResource(R.drawable.live_music);
                trailer.setVisibility(View.INVISIBLE);
            }

            if (rock_concert=="rock_concert") {
                display.setImageResource(R.drawable.rock_concert);
                trailer.setVisibility(View.INVISIBLE);
            }

            if (music_nagin=="music_nagin") {
                display.setImageResource(R.drawable.music_nagin);
                trailer.setVisibility(View.INVISIBLE);
            }

            if (jazz_music=="jazz_music") {
                display.setImageResource(R.drawable.jazz_music);
                trailer.setVisibility(View.INVISIBLE);
            }

            if (red_rock_music=="red_rock_music") {
                display.setImageResource(R.drawable.red_rock_music);
                trailer.setVisibility(View.INVISIBLE);
            }

            if (crystalyne=="crystalyne") {
                display.setImageResource(R.drawable.crystalyne);
                trailer.setVisibility(View.INVISIBLE);
            }

            //*************DRAMA CLICK************************************************************
            if (remember=="remember") {
                display.setImageResource(R.drawable.remember);
                trailer.setVisibility(View.INVISIBLE);
            }

            if (first_kill=="first_kill") {
                display.setImageResource(R.drawable.first_kill);
                trailer.setVisibility(View.INVISIBLE);
            }

            if (table_for_two=="table_for_two") {
                display.setImageResource(R.drawable.table_for_two);
                trailer.setVisibility(View.INVISIBLE);
            }

            if (drama_ratu_drama=="drama_ratu_drama") {
                display.setImageResource(R.drawable.drama_ratu_drama);
                trailer.setVisibility(View.INVISIBLE);
            }

            if (family_drama=="family_drama") {
                display.setImageResource(R.drawable.family_drama);
                trailer.setVisibility(View.INVISIBLE);
            }

            if (the_train_of_love=="the_train_of_love") {
                display.setImageResource(R.drawable.the_train_of_love);
                trailer.setVisibility(View.INVISIBLE);
            }
            //*************COMEDY CLICK************************************************************
            if (kenny_sebastian=="kenny_sebastian") {
                display.setImageResource(R.drawable.kenny_sebastian);
                trailer.setVisibility(View.INVISIBLE);
            }
            if (abhishek_upmanyu=="abhishek_upmanyu") {
                display.setImageResource(R.drawable.abhishek_upmanyu);
                trailer.setVisibility(View.INVISIBLE);
            }
            if (anubhav_singh_bassi=="anubhav_singh_bassi") {
                display.setImageResource(R.drawable.anubhav_singh_bassi);
                trailer.setVisibility(View.INVISIBLE);
            }
            if (zakir_khan=="zakir_khan") {
                display.setImageResource(R.drawable.zakir_khan);
                trailer.setVisibility(View.INVISIBLE);
            }
            if (vir_das=="vir_das") {
                display.setImageResource(R.drawable.vir_das);
                trailer.setVisibility(View.INVISIBLE);
            }
            if (kapil_sharma=="kapil_sharma") {
                display.setImageResource(R.drawable.kapil_sharma);
                trailer.setVisibility(View.INVISIBLE);
            }

            select.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    videoView.pause();
                    Fragment DateOfShowFragment = new DateOfShowFragment();
                    FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                    fm.replace(R.id.selectMovie, DateOfShowFragment).addToBackStack(null).commit();
                }
            });
        }
        return view;

    }

}