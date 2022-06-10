package com.example.luddiagappli.View;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.Model.Animateur;
import com.example.luddiagappli.Model.User;
import com.example.luddiagappli.Model.database;
import com.example.luddiagappli.R;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainActivity extends AppCompatActivity {

    private Button buttonconnexion;
    private Button buttoninscription;


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





        //PARTIE BOUTON

        buttonconnexion = (Button) findViewById(R.id.buttonconnexion);
        buttonconnexion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openConnexion();
                }
            });

        buttoninscription = (Button) findViewById(R.id.buttoninscription);
        buttoninscription.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v2) {
                    openInscription();
                }
            });
        }

        public void openConnexion() {
            Intent intent2 = new Intent(this, PageLogin.class);
            startActivity(intent2);
        }

        public void openInscription() {
            Intent intent = new Intent(this, PageRegister.class);
            startActivity(intent);
        }



}