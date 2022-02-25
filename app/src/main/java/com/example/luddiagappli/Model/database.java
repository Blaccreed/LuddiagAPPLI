package com.example.luddiagappli.Model;

import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {

    private Connection connection;

    private final String host = "ec2-79-125-93-182.eu-west-1.compute.amazonaws.com";
    private final String database = "d1fed40j8f36go";
    private final int port = 5432;
    private final String user = "hkyuvxishugyfr";
    private final String password = "c31891e28d73419204922937201ff7ef899e30ad7dcbe50767b67a10a75565c1";
    private String url = "jdbc:postgresql://%s:%d/%s";
    private boolean status;

    public database()
    {
        this.url = String.format(this.url, this.host, this.port, this.database);
        connect();
        //this.disconnect();
        System.out.println("connection status:" + status);
    }

    private void connect()
    {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run()
            {
                try
                {
                    Class.forName("org.postgresql.Driver");
                    connection = DriverManager.getConnection(url, user, password);
                    status = true;
                    Log.d("DB", "connected : " + status);
                    System.out.println("connected:" + status);
                }
                catch (Exception e)
                {
                    status = false;
                    System.out.print(e.getMessage());
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        try
        {
            thread.join();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            this.status = false;
        }
    }

    public Connection getExtraConnection()
    {
        Connection c = null;
        try
        {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url, user, password);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return c;
    }

}
