package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PageGrille extends AppCompatActivity {

    private Button boutonArriereConnexion;
    private Button buttonCreateur;
    private Button buttonEditeur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_grille);

        boutonArriereConnexion = (Button) findViewById(R.id.boutonArriereConnexion);
        boutonArriereConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openArriereConnexion();
            }
        });

        buttonCreateur = (Button) findViewById(R.id.buttonCreateur);
        buttonCreateur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                openGrilleCreateur();
            }
        });

        buttonEditeur = (Button) findViewById(R.id.buttonEditeur);
        buttonEditeur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGrilleEditeur();
            }
        });

    }

    public void openArriereConnexion() {
        Intent intent2 = new Intent(this, PageLogin.class);
        startActivity(intent2);
    }

    public void openGrilleEditeur() {
        Intent intent = new Intent(this, flip_editeur.class);
        startActivity(intent);
    }

    public void openGrilleCreateur() {
        Intent intent3 = new Intent(this, flip_createur.class);
        startActivity(intent3);
    }


}