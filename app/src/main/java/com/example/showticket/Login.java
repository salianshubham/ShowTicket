package com.example.showticket;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    showTicketDataBase showTicketDataBase;
   // private static final String login_email = "login_email";
    public void logIn(View view){
        EditText editText = (EditText) findViewById(R.id.email);
        EditText editText_P = (EditText) findViewById(R.id.password);
        String email = editText.getText().toString();
        String password = editText_P.getText().toString();
        showTicketDataBase = new showTicketDataBase(this);
        if(email.equals("") || password.equals("")){
            Toast.makeText(this, "Enter all the feald", Toast.LENGTH_SHORT).show();

        }
        else {
            Boolean checkUserPass = showTicketDataBase.checkusernamepassword(email,password);
            if(checkUserPass == true){
                //***Shared preferences****
                SharedPreferences pref = getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();
                editor.putBoolean("flag",true);
                editor.apply();
                editor.commit();
                Toast.makeText(this, "log in successfull", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Login.this,navigation.class);
                startActivity(intent);
            }
            else{
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setMessage("Check your Email or Password").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }

                });
                AlertDialog alert = builder.create();
                alert.setTitle("ALERT MESSAGE");
                alert.show();
            }

        }
    }


    public void signIn(View view){
        Intent intent = new Intent(Login.this,Signin.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
}