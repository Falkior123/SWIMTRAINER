package com.example.swimtrainer;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.StrictMode;

import java.sql.Connection;

public class Polaczenie  {

    Connection con;
    String uname, pass, ip, port, database;

    public Connection connectionclass() {
        ip = "172.1.1.0";
        database = "swimtrainer";
        uname = "login";
        pass = "haslo";


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionURL = null;


        return connection;
    }
}

