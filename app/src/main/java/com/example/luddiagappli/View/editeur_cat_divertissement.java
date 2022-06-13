package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;

public class editeur_cat_divertissement extends AppCompatActivity {

    private Button buttonRest;
    private Button boutonArriere;
    private Button buttonrico;
    private Button buttonsky;
    private Button buttonTop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editeur_cat_divertissement);

        buttonRest = (Button) findViewById(R.id.buttonRest);
        buttonRest.setOnClickListener(new View.OnClickListener() {
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

        buttonrico = (Button) findViewById(R.id.buttonrico);
        buttonrico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                openFiche();
            }
        });

        buttonsky = (Button) findViewById(R.id.buttonsky);
        buttonsky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                openFiche();
            }
        });

        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonTop.setOnClickListener(new View.OnClickListener() {
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
