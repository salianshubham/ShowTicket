package com.example.showticket;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class showTicketDataBase extends SQLiteOpenHelper {
    public static final String showTicketDataBase = "showTicketDataBase.db";
    public showTicketDataBase(Context context) {
        super(context, showTicketDataBase, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String q = "create table showTicketDetails(id integer primary key autoincrement,username text,phone_number text,email text unique,password text )";
        db.execSQL(q);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists showTicketDetails");
        onCreate(db);
    }

    public boolean insert_user_details(String username,String phone_number,String email,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues c = new ContentValues();
        c.put("username",username);
        c.put("phone_number",phone_number);
        c.put("email",email);
        c.put("password",password);
        long r = db.insert("showTicketDetails",null,c);
        if(r==-1)
            return false;
        else
            return true;
    }

    public Boolean checkusernamepassword(String email,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from showTicketDetails where email = ? and password = ?",new String[]{email,password});
        if(cursor.getCount()>0){
            return true;
        }
        else
            return false;
    }
}
