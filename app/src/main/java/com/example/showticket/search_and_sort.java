package com.example.showticket;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class search_and_sort extends Fragment {



    public search_and_sort() {
        // Required empty public constructor
    }
    ListView listView;
    SearchView searchView;
    ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;
    Bundle bundle = new Bundle();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_search_and_sort, container, false);

        searchView = view.findViewById(R.id.search);
        listView = view.findViewById(R.id.listview);
        arrayList = new ArrayList<>();
        //***MOVIE*****
        arrayList.add("Kantara");
        arrayList.add("Attack");
        arrayList.add("RRR");
        arrayList.add("Prithviraj");
        arrayList.add("Heropanthi");
        arrayList.add("Anthim");
        //***Music*****
        arrayList.add("Live_music");
        arrayList.add("Rock_concert");
        arrayList.add("Music_nagin");
        arrayList.add("Jazz_music");
        arrayList.add("Red_rock_music");
        arrayList.add("Crystalyne");

        //***DRAMA*****
        arrayList.add("Remember");
        arrayList.add("First_kill");
        arrayList.add("Table_for_two");
        arrayList.add("Drama_ratu_drama");
        arrayList.add("Family_drama");
        arrayList.add("The_train_of_love");

        //***standup*****
        arrayList.add("Kenny_sebastian");
        arrayList.add("Abhishek_upmanyu");
        arrayList.add("Anubhav_singh_bassi");
        arrayList.add("Zakir_khan");
        arrayList.add("Vir_das");
        arrayList.add("Kapil_sharma");



        arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if(arrayAdapter.getItem(position)=="Kantara"){
                            bundle.putString("kantara","kantara");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Attack"){
                            bundle.putString("attack","attack");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="RRR"){
                            bundle.putString("rrr","rrr");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Prithviraj"){
                            bundle.putString("prithviraj","prithviraj");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Heropanthi"){
                            bundle.putString("heropanthi","heropanthi");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Anthim"){
                            bundle.putString("anthim","anthim");
                            loadfrag(new selectMovie(),bundle);
                        }
                        //***concert****
                        else if(arrayAdapter.getItem(position)=="Live_music"){
                            bundle.putString("live_music","live_music");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Rock_concert"){
                            bundle.putString("rock_concert","rock_concert");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Music_nagin"){
                            bundle.putString("music_nagin","music_nagin");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Jazz_music"){
                            bundle.putString("jazz_music","jazz_music");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Red_rock_music"){
                            bundle.putString("red_rock_music","red_rock_music");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Crystalyne"){
                            bundle.putString("crystalyne","crystalyne");
                            loadfrag(new selectMovie(),bundle);
                        }
                        //***Drama***
                        else if(arrayAdapter.getItem(position)=="Remember"){
                            bundle.putString("remember","remember");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="First_kill"){
                            bundle.putString("first_kill","first_kill");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Table_for_two"){
                            bundle.putString("table_for_two","table_for_two");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Drama_ratu_drama"){
                            bundle.putString("drama_ratu_drama","drama_ratu_drama");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Family_drama"){
                            bundle.putString("family_drama","family_drama");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="The_train_of_love"){
                            bundle.putString("the_train_of_love","the_train_of_love");
                            loadfrag(new selectMovie(),bundle);
                        }
                        //***Standup ***
                        else if(arrayAdapter.getItem(position)=="Kenny_sebastian"){
                            bundle.putString("kenny_sebastian","kenny_sebastian");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Abhishek_upmanyu"){
                            bundle.putString("abhishek_upmanyu","abhishek_upmanyu");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Anubhav_singh_bassi"){
                            bundle.putString("anubhav_singh_bassi","anubhav_singh_bassi");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Zakir_khan"){
                            bundle.putString("zakir_khan","zakir_khan");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Vir_das"){
                            bundle.putString("vir_das","vir_das");
                            loadfrag(new selectMovie(),bundle);
                        }
                        else if(arrayAdapter.getItem(position)=="Kapil_sharma"){
                            bundle.putString("kapil_sharma","kapil_sharma");
                            loadfrag(new selectMovie(),bundle);
                        }
                        Toast.makeText(getActivity(), ""+arrayAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                    }
                });
                return false;
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