package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;

public class editeur_cat_ecoludique extends AppCompatActivity {

    private Button buttonFeel;
    private Button buttonMar;
    private Button buttonRat;
    private Button buttonTur;
    private Button buttonVel;
    private Button boutonArriere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editeur_cat_ecoludique);


        buttonFeel = (Button) findViewById(R.id.buttonFeel);
        buttonFeel.setOnClickListener(new View.OnClickListener() {
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

        buttonMar = (Button) findViewById(R.id.buttonMar);
        buttonMar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                openFiche();
            }
        });

        buttonRat = (Button) findViewById(R.id.buttonRat);
        buttonRat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                openFiche();
            }
        });

        buttonTur = (Button) findViewById(R.id.buttonTur);
        buttonTur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v5) {
                openFiche();
            }
        });

        buttonVel = (Button) findViewById(R.id.buttonVel);
        buttonVel.setOnClickListener(new View.OnClickListener() {
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
        Intent intent2 = new Intent(this, flip_editeur.class);
        startActivity(intent2);
    }
}