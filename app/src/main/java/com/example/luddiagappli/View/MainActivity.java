package com.example.luddiagappli.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;

import com.example.luddiagappli.Model.database;
import com.example.luddiagappli.R;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);

        }
        //Example de récupération de donnée
        database db = new database();
        try {
            Statement st = db.getExtraConnection().createStatement();
            String sql = "SELECT * FROM user_flip";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                String username = rs.getString("nom_user");
                Log.d("DB" , username);
            }
        } catch (SQLException e) {
            Log.d("DB", "Error getting querry");
            e.printStackTrace();
        }
    }


}