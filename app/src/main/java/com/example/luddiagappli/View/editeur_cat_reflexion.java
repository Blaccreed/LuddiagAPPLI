package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;

public class editeur_cat_reflexion extends AppCompatActivity {

    private Button buttonvisite;
    private Button buttonTrek;
    private Button buttonCrime;
    private Button buttonLueu;
    private Button buttonGor;
    private Button boutonArriere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editeur_cat_reflexion);

        buttonvisite = (Button) findViewById(R.id.buttonvisite);
        buttonvisite.setOnClickListener(new View.OnClickListener() {
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

        buttonTrek = (Button) findViewById(R.id.buttonTrek);
        buttonTrek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                openFiche();
            }
        });

        buttonCrime = (Button) findViewById(R.id.buttonCrime);
        buttonCrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                openFiche();
            }
        });

        buttonLueu = (Button) findViewById(R.id.buttonLueu);
        buttonLueu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v5) {
                openFiche();
            }
        });

        buttonGor = (Button) findViewById(R.id.buttonGor);
        buttonGor.setOnClickListener(new View.OnClickListener() {
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