

package com.example.showticket;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class movieFragment extends Fragment {

    ImageView kantara,anthim,attack,rrr,prithviraj,heropanthi;
    Bundle bundle = new Bundle();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_movie, container, false);
        kantara = view.findViewById(R.id.kantara);
        anthim = view.findViewById(R.id.anthim);
        attack = view.findViewById(R.id.attack);
        rrr = view.findViewById(R.id.rrr);
        prithviraj = view.findViewById(R.id.prithviraj);
        heropanthi = view.findViewById(R.id.heropanthi);
        //select movie
        kantara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("kantara","kantara");
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

        prithviraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bundle.putString("prithviraj","prithviraj");
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


        return view;
    }

    public void loadfrag(Fragment fragment,Bundle bundle){
        FragmentManager fm = getParentFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragment.setArguments(bundle);
        ft.replace(R.id.movie_container,fragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}