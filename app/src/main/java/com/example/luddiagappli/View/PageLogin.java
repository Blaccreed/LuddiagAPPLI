package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.luddiagappli.Model.database;
import com.example.luddiagappli.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PageLogin extends AppCompatActivity {

    private Button boutonArriereMain;
    private Button connexionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_login);

        boutonArriereMain = (Button) findViewById(R.id.boutonArriereMain);
        boutonArriereMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openMain();
            }
        });

        connexionButton = (Button) findViewById(R.id.connexionButton);
        connexionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openPageGrille();
            }
        });

    }

    public boolean testCredentials(String username, String password)
    {
        Integer nbConnection = 0;
        database db = new database();
        try {
            Statement st = db.getExtraConnection().createStatement();
            String sql = "SELECT count(*) as nbConnection FROM user_flip where mail_user= '"+username+"' and mdp_user='"+password+"'";
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


    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openPageGrille() {

        EditText mailLogin = findViewById(R.id.mailLogin);
        EditText passwordLogin = findViewById(R.id.mailPassword);

        String mailLoginText = mailLogin.getText().toString();
        String passwordLoginText = passwordLogin.getText().toString();

        if (mailLoginText.isEmpty() || passwordLoginText.isEmpty()) {
            Toast.makeText(this,"Veuillez remplir tout les champs",Toast.LENGTH_SHORT).show();
            return;
        }
        if(testCredentials(mailLoginText, passwordLoginText)){
            Intent intent = new Intent(this, PageGrille.class);
            startActivity(intent);
        }else {
            Toast.makeText(this,"Mail ou mot de passe incorrect",Toast.LENGTH_SHORT).show();
        }
    }

}