package com.example.showticket;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class DateOfShowFragment extends Fragment {

    Button _01_11_2022,_02_11_2022,_03_11_2022,_04_11_2022,_05_11_2022,_06_11_2022,_07_11_2022,_08_11_2022,_09_11_2022;
    Button selectSeats,increment,decrement;
    TextView seatscount;
    ImageView seatImage;
    Bundle bundle = new Bundle();
    Boolean checkDate = false;
    int num = 0;//for increment seats

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_date_of_show, container, false);
        //seat button
        selectSeats = view.findViewById(R.id.selectseats);
        //date object
        _01_11_2022 = view.findViewById(R.id._01_11_2022);
        _02_11_2022 = view.findViewById(R.id._02_11_2022);
        _03_11_2022 = view.findViewById(R.id._03_11_2022);
        _04_11_2022 = view.findViewById(R.id._04_11_2022);
        _05_11_2022 = view.findViewById(R.id._05_11_2022);
        _06_11_2022 = view.findViewById(R.id._06_11_2022);
        _07_11_2022 = view.findViewById(R.id._07_11_2022);
        _08_11_2022 = view.findViewById(R.id._08_11_2022);
        _09_11_2022 = view.findViewById(R.id._09_11_2022);
        //seats increment decrement object
        increment = view.findViewById(R.id.increment);
        decrement = view.findViewById(R.id.decrement);

        //text view object
        seatscount = view.findViewById(R.id.seatscount);

        //image view object
        seatImage = view.findViewById(R.id.seatImage);

        //on click to date
        _01_11_2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _01_11_2022.setBackgroundColor(Color.argb(255,15, 68, 220));
                _02_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _03_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _04_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _05_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _06_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _07_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _08_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _09_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                checkDate = true;

                bundle.putString("date","01-11-22");
            }
        });

        _02_11_2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _01_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _02_11_2022.setBackgroundColor(Color.argb(255,15, 68, 220));
                _03_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _04_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _05_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _06_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _07_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _08_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _09_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                checkDate = true;
                bundle.putString("date","02-11-22");
            }
        });

        _03_11_2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _01_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _02_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _03_11_2022.setBackgroundColor(Color.argb(255,15, 68, 220));
                _04_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _05_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _06_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _07_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _08_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _09_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                checkDate = true;
                bundle.putString("date","03-11-22");
            }
        });

        _04_11_2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _01_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _02_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _03_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _04_11_2022.setBackgroundColor(Color.argb(255,15, 68, 220));
                _05_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _06_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _07_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _08_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _09_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                checkDate = true;
                bundle.putString("date","04-11-22");
            }
        });

        _05_11_2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _01_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _02_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _03_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _04_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _05_11_2022.setBackgroundColor(Color.argb(255,15, 68, 220));
                _06_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _07_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _08_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _09_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                checkDate = true;
                bundle.putString("date","05-11-22");
            }
        });

        _06_11_2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _01_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _02_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _03_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _04_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _05_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _06_11_2022.setBackgroundColor(Color.argb(255,15, 68, 220));
                _07_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _08_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _09_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                checkDate = true;
                bundle.putString("date","06-11-22");
            }
        });

        _07_11_2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _01_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _02_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _03_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _04_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _05_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _06_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _07_11_2022.setBackgroundColor(Color.argb(255,15, 68, 220));
                _08_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _09_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                checkDate = true;
                bundle.putString("date","07-11-22");
            }
        });

        _08_11_2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _01_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _02_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _03_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _04_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _05_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _06_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _07_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _08_11_2022.setBackgroundColor(Color.argb(255,15, 68, 220));
                _09_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                checkDate = true;
                bundle.putString("date","08-11-22");
            }
        });

        _09_11_2022.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _01_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _02_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _03_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _04_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _05_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _06_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _07_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _08_11_2022.setBackgroundColor(Color.argb(255,85, 66, 197));
                _09_11_2022.setBackgroundColor(Color.argb(255,15, 68, 220));
                checkDate = true;
                bundle.putString("date","09-11-22");
            }
        });

        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = num + 1;
                seatscount.setText(Integer.toString(num));
                bundle.putInt("totalSeat",num);

                bundle.putInt("numOfSeat",num);
                if(num==1){
                    seatImage.setImageResource(R.drawable.cycle);
                }
                else if(num==2){
                    seatImage.setImageResource(R.drawable.bike);
                }
                else if(num==3){
                    seatImage.setImageResource(R.drawable.auto);
                }
                else if(num==4){
                    seatImage.setImageResource(R.drawable.car);
                }
                else if(num==5){
                    seatImage.setImageResource(R.drawable.car5seat);
                }
                else if(num==6){
                    seatImage.setImageResource(R.drawable.minivan);
                }
                else if(num==7){
                    seatImage.setImageResource(R.drawable.vancar);
                }
                else if(num==8){
                    seatImage.setImageResource(R.drawable.bus);
                }
                else if(num==9){
                    seatImage.setImageResource(R.drawable.train);
                }
            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num>1){
                    num = num - 1;
                    seatscount.setText(Integer.toString(num));

                    if(num==1){
                        seatImage.setImageResource(R.drawable.cycle);
                    }
                    else if(num==2){
                        seatImage.setImageResource(R.drawable.bike);
                    }
                    else if(num==3){
                        seatImage.setImageResource(R.drawable.auto);
                    }
                    else if(num==4){
                        seatImage.setImageResource(R.drawable.car);
                    }
                    else if(num==5){
                        seatImage.setImageResource(R.drawable.car5seat);
                    }
                    else if(num==6){
                        seatImage.setImageResource(R.drawable.minivan);
                    }
                    else if(num==7){
                        seatImage.setImageResource(R.drawable.vancar);
                    }
                    else if(num==8){
                        seatImage.setImageResource(R.drawable.bus);
                    }
                    else if(num==9){
                        seatImage.setImageResource(R.drawable.train);
                    }
                }

            }
        });




        // move to moviePriceFragment
        selectSeats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkDate == false){
                    Toast.makeText(getActivity(), "Please Select The Date", Toast.LENGTH_SHORT).show();
                }
                else if(num==0){
                    Toast.makeText(getActivity(), "Please Select The Number of Seats", Toast.LENGTH_SHORT).show();
                }
                else{
                    loadfrag(new movie_price_fragment(),bundle);
                }

            }
        });
        return view;
    }
    public void loadfrag(Fragment fragment,Bundle bundle){
        FragmentManager fm = getParentFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragment.setArguments(bundle);
        ft.replace(R.id.date_of_show,fragment).addToBackStack(null).commit();
    }
}