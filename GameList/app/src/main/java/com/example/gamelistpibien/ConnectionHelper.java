package com.example.gamelistpibien;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {

    Connection con;
    String username, password, ip, port, database;
    @SuppressLint("New Api")
    public Connection connectionclass() {
        ip = "172.1.1.0";
        database = "GameListDB";
        username = "angel";
        password = "angel";
        port = "1433";

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionURL = null;

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectionURL = "jdbc:jtds:sqlserver://"+ ip + ":"+ port+";"+ "databasename="+ database+";user="+username+";password="+password+";";
            connection = DriverManager.getConnection("ConnectionURL");
        } catch (Exception ex) {
            Log.e("Error ", ex.getMessage());
        }

        return connection;
    }
}
