package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;

public class createur_cat_enfant extends AppCompatActivity {

    private Button buttonMonster;
    private Button boutonArriere;
    private Button buttonCampagnol;
    private Button buttonLune;
    private Button buttonOni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createur_cat_enfant);


        buttonMonster = (Button) findViewById(R.id.buttonMonster);
        buttonMonster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFiche();
            }
        });

        boutonArriere = (Button) findViewById(R.id.boutonArriere);
        boutonArriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openFlipC();
            }
        });

        buttonCampagnol = (Button) findViewById(R.id.buttonCampagnol);
        buttonCampagnol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                openFiche();
            }
        });

        buttonLune = (Button) findViewById(R.id.buttonLune);
        buttonLune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                openFiche();
            }
        });

        buttonOni = (Button) findViewById(R.id.buttonOni);
        buttonOni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v5) {
                openFiche();
            }
        });
    }

    public void openFiche() {
        Intent intent = new Intent(this, FicheJeu.class);
        startActivity(intent);
    }

    public void openFlipC() {
        Intent intent2 = new Intent(this, flip_createur.class);
        startActivity(intent2);
    }
}