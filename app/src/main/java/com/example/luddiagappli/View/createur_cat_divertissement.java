package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;

public class createur_cat_divertissement extends AppCompatActivity {

    private Button buttonTokyo;
    private Button boutonArriere;
    private Button buttonPlace;
    private Button buttonBla;
    private Button buttonBrigant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createur_cat_divertissement);

        buttonTokyo = (Button) findViewById(R.id.buttonTokyo);
        buttonTokyo.setOnClickListener(new View.OnClickListener() {
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

        buttonPlace = (Button) findViewById(R.id.buttonPlace);
        buttonPlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                openFiche();
            }
        });

        buttonBla = (Button) findViewById(R.id.buttonBla);
        buttonBla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                openFiche();
            }
        });

        buttonBrigant = (Button) findViewById(R.id.buttonBrigant);
        buttonBrigant.setOnClickListener(new View.OnClickListener() {
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