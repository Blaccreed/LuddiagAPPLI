package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;

public class createur_cat_reflexion extends AppCompatActivity {

    private Button buttonTune;
    private Button buttonHer;
    private Button buttonFra;
    private Button buttonArt;
    private Button boutonArriere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createur_cat_reflexion);

        buttonTune = (Button) findViewById(R.id.buttonTune);
        buttonTune.setOnClickListener(new View.OnClickListener() {
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

        buttonHer = (Button) findViewById(R.id.buttonHer);
        buttonHer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                openFiche();
            }
        });

        buttonFra = (Button) findViewById(R.id.buttonFra);
        buttonFra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                openFiche();
            }
        });

        buttonArt = (Button) findViewById(R.id.buttonArt);
        buttonArt.setOnClickListener(new View.OnClickListener() {
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