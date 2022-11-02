package com.example.showticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Signin extends AppCompatActivity {
    RadioGroup radioGroup;
    ImageView signInProfile;
    EditText username,phone_number,email,password,confirmpassword;
    Button signuBtn;
    showTicketDataBase showTicketDataBase;
    private static final String login_email = "login_email";
    private static final String profilename = "profilename";
    public void alsignin(View view){
        Intent intent = new Intent(Signin.this,Login.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        username = findViewById(R.id.signInname);
        phone_number = findViewById(R.id.signInPhone);
        email = findViewById(R.id.signInEmail);
        password = findViewById(R.id.signInPassword);
        confirmpassword = findViewById(R.id.signInConfirmPassword);
        radioGroup = findViewById(R.id.radioGroup);
        signInProfile = findViewById(R.id.sign_in_profile);
        signuBtn = findViewById(R.id.signuBtn);

        showTicketDataBase = new showTicketDataBase(this);//database object
        //*****radio button to change image************
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.male){
                    signInProfile.setImageResource(R.drawable.man);
                }
                if(checkedId==R.id.female){
                    signInProfile.setImageResource(R.drawable.woman);
                }
            }
        });

        //*****onclick sign up********
        signuBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = username.getText().toString();
                String phone = phone_number.getText().toString();
                String email_ = email.getText().toString();
                String password_ = password.getText().toString();
                String confirmpassword_ = confirmpassword.getText().toString();
                SharedPreferences pref = getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                String profileemail = email.getText().toString();
                String profileusername = username.getText().toString();
                editor.putString(login_email,profileemail);
                editor.putString(profilename,profileusername);
                editor.apply();
                editor.commit();
                if(name.equals("")||phone.equals("")||email_.equals("")||password_.equals("")||confirmpassword_.equals("")){
                    Toast.makeText(Signin.this, "Enter all the feald", Toast.LENGTH_SHORT).show();
                }
                else if(!password_.equals(confirmpassword_)){
                    Toast.makeText(Signin.this, "Your Password is not matching", Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean check = showTicketDataBase.insert_user_details(name,phone,email_,password_);
                    if(check==true){
                        Intent intent = new Intent(Signin.this,Login.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(Signin.this, "Your Email Id Is Already registered", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }

}