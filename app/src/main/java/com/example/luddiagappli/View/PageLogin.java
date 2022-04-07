package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.luddiagappli.Model.database;
import com.example.luddiagappli.R;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PageLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_login);
    }




    public boolean testCredentials(String username, String password)
    {
        Integer nbConnection = 0;
        database db = new database();
        try {
            Statement st = db.getExtraConnection().createStatement();
            String sql = "SELECT count(*) as nbConnection FROM user_flip where nom_user= '"+username+"' and mdp_user'"+password+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                nbConnection = rs.getInt("nbConnection");
            }
        } catch (SQLException e) {
            Log.d("DB", "Error getting querry");
            e.printStackTrace();
        }

        if(nbConnection == 1)
        {
            return true;
        }
        else{
            return false;
        }
    }
}