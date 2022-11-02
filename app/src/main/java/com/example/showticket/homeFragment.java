package com.example.showticket;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


public class homeFragment extends Fragment {


    public homeFragment() {
        // Required empty public constructor
    }

    ImageView kantara,attack,rrr,prithviraj,heropanthi,anthim;
    ImageView live_music,rock_concert,music_nagin,jazz_music,red_rock_music,crystalyne;
    ImageView remember,first_kill,table_for_two,drama_ratu_drama,family_drama,the_train_of_love;
    ImageView kenny_sebastian,abhishek_upmanyu,anubhav_singh_bassi,zakir_khan,vir_das,kapil_sharma;
    ImageView movie,concert,standupComedy,drama;
    ImageView exit,searchIcon;

    Bundle bundle = new Bundle();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        movie = view.findViewById(R.id.movie);
        concert = view.findViewById(R.id.concert);
        standupComedy = view.findViewById(R.id.standupComedy);
        drama = view.findViewById(R.id.drama);
        //*********MOVIE****************************************************************
        kantara = view.findViewById(R.id.kantara);
        attack = view.findViewById(R.id.attack);
        rrr = view.findViewById(R.id.rrr);
        prithviraj = view.findViewById(R.id.prithviraj);
        heropanthi = view.findViewById(R.id.heropanthi);
        anthim = view.findViewById(R.id.anthim);
        //*********CONCERT***************************************************************
        live_music = view.findViewById(R.id.live_music);
        rock_concert = view.findViewById(R.id.rock_concert);
        music_nagin = view.findViewById(R.id.music_nagin);
        jazz_music = view.findViewById(R.id.jazz_music);
        red_rock_music = view.findViewById(R.id.red_rock_music);
        crystalyne = view.findViewById(R.id.crystalyne);
        //*********DRAMA***************************************************************
        remember = view.findViewById(R.id.remember);
        first_kill = view.findViewById(R.id.first_kill);
        table_for_two = view.findViewById(R.id.table_for_two);
        drama_ratu_drama = view.findViewById(R.id.drama_ratu_drama);
        family_drama = view.findViewById(R.id.family_drama);
        the_train_of_love = view.findViewById(R.id.the_train_of_love);
        //*********COMEDY***************************************************************
        kenny_sebastian = view.findViewById(R.id.kenny_sebastian);
        abhishek_upmanyu = view.findViewById(R.id.abhishek_upmanyu);
        anubhav_singh_bassi = view.findViewById(R.id.anubhav_singh_bassi);
        zakir_khan = view.findViewById(R.id.zakir_khan);
        vir_das = view.findViewById(R.id.vir_das);
        kapil_sharma = view.findViewById(R.id.kapil_sharma);
        //******exit**********************************************
        exit = view.findViewById(R.id.exit);
        searchIcon = view.findViewById(R.id.searchIcon);

        FragmentManager fm = getParentFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft.replace(R.id.homecontainer,new movieFragment());
                ft.commit();
            }
        });

        concert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft.replace(R.id.homecontainer,new concert_fragment());
                ft.commit();
            }
        });

        standupComedy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft.replace(R.id.homecontainer,new comedyFragment());
                ft.commit();
            }
        });

        drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ft.replace(R.id.homecontainer,new dramafragment());
                ft.commit();
            }
        });

        //***********MOVIE ONCLICK***************************************************
        kantara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("kantara","kantara");
                loadfrag(new selectMovie(),bundle);
            }
        });

        attack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("attack","attack");
                loadfrag(new selectMovie(),bundle);
            }
        });

        rrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("rrr","rrr");
                loadfrag(new selectMovie(),bundle);
            }
        });

        heropanthi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("heropanthi","heropanthi");
                loadfrag(new selectMovie(),bundle);
            }
        });

        anthim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("anthim","anthim");
                loadfrag(new selectMovie(),bundle);
            }
        });

        prithviraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("prithviraj","prithviraj");
                loadfrag(new selectMovie(),bundle);
            }
        });

        //***********CONCERT ONCLICK***************************************************
        live_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("live_music","live_music");
                loadfrag(new selectMovie(),bundle);
            }
        });

        rock_concert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("rock_concert","rock_concert");
                loadfrag(new selectMovie(),bundle);
            }
        });

        music_nagin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("music_nagin","music_nagin");
                loadfrag(new selectMovie(),bundle);
            }
        });

        jazz_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("jazz_music","jazz_music");
                loadfrag(new selectMovie(),bundle);
            }
        });

        red_rock_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("red_rock_music","red_rock_music");
                loadfrag(new selectMovie(),bundle);
            }
        });

        crystalyne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("crystalyne","crystalyne");
                loadfrag(new selectMovie(),bundle);
            }
        });

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

        drama_ratu_drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("drama_ratu_drama","drama_ratu_drama");
                loadfrag(new selectMovie(),bundle);
            }
        });

        family_drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("family_drama","family_drama");
                loadfrag(new selectMovie(),bundle);
            }
        });

        the_train_of_love.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("the_train_of_love","the_train_of_love");
                loadfrag(new selectMovie(),bundle);
            }
        });

        //***********COMEDY ONCLICK***************************************************
        kenny_sebastian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("kenny_sebastian","kenny_sebastian");
                loadfrag(new selectMovie(),bundle);
            }
        });

        abhishek_upmanyu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("abhishek_upmanyu","abhishek_upmanyu");
                loadfrag(new selectMovie(),bundle);
            }
        });

        anubhav_singh_bassi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("anubhav_singh_bassi","anubhav_singh_bassi");
                loadfrag(new selectMovie(),bundle);
            }
        });

        zakir_khan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("zakir_khan","zakir_khan");
                loadfrag(new selectMovie(),bundle);
            }
        });

        vir_das.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("vir_das","vir_das");
                loadfrag(new selectMovie(),bundle);
            }
        });

        kapil_sharma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("kapil_sharma","kapil_sharma");
                loadfrag(new selectMovie(),bundle);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setMessage("Do you want to exit?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //dialogInterface.cancel();
                        getActivity().finish();
                        System.exit(0);
                    }

                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alert = builder.create();
                alert.setTitle("Exit App");
                alert.show();
            }
        });

        searchIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getParentFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.homecontainer,new search_and_sort()).commit();
            }
        });
        return view;
    }

    public void loadfrag(Fragment fragment,Bundle bundle){
        FragmentManager fm = getParentFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragment.setArguments(bundle);
        ft.replace(R.id.homecontainer,fragment).addToBackStack(null).commit();
    }


}