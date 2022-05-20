package com.example.luddiagappli.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;

import com.example.luddiagappli.Model.Animateur;
import com.example.luddiagappli.Model.User;
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
        //Animateur.ValiderNote(1,33);
        User.InscriptionJoueur("'tezaet'", "'tezaetz'", "'Taeztzte'", "'teafaea'", "'tEZAZE'", "'EZZAZt'", "'tZEREZA'");
        //Example de récupération de donnée
        database db = new database();
        try {
            Statement st = db.getExtraConnection().createStatement();
            //User.SeConnecter("admin@flip.fr","admin");
            String sql = "SELECT * FROM user_flip";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                String username = rs.getString("nom_user");
                Log.d("DB" , username);
            }
        } catch (SQLException e) {
            Log.d("DB", "Erreur pour insert !");
            e.printStackTrace();
        }
      //User.SeConnecter("dylan.hacquart@flip.fr", "dylan");

        //Grille.GetJeuxGrille(1);
    }


}