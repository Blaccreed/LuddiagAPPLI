package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;

public class editeur_cat_enfant extends AppCompatActivity {

    private Button buttonBouh;
    private Button buttonEsc;
    private Button buttonDrag;
    private Button buttonFrouss;
    private Button buttonPata;
    private Button boutonArriere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editeur_cat_enfant);

        buttonBouh = (Button) findViewById(R.id.buttonBouh);
        buttonBouh.setOnClickListener(new View.OnClickListener() {
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

        buttonEsc = (Button) findViewById(R.id.buttonEsc);
        buttonEsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                openFiche();
            }
        });

        buttonDrag = (Button) findViewById(R.id.buttonDrag);
        buttonDrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                openFiche();
            }
        });

        buttonFrouss = (Button) findViewById(R.id.buttonFrouss);
        buttonFrouss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v5) {
                openFiche();
            }
        });

        buttonPata = (Button) findViewById(R.id.buttonPata);
        buttonPata.setOnClickListener(new View.OnClickListener() {
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