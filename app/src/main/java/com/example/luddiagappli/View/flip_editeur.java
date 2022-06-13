package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class flip_editeur extends AppCompatActivity {

    private Button buttonEnfant;
    private Button buttonRef;
    private Button buttonDiv;
    private Button buttonEco;
    private Button boutonArriere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_editeur);

        buttonEnfant = (Button) findViewById(R.id.buttonEnfant);
        buttonEnfant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                openCreateurEnfant();
            }
        });

        boutonArriere = (Button) findViewById(R.id.boutonArriere);
        boutonArriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openArriere();
            }
        });

        buttonRef = (Button) findViewById(R.id.buttonRef);
        buttonRef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) { openRef();
            }
        });

        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v5) {
                openDiv();
            }
        });

        buttonEco = (Button) findViewById(R.id.buttonEco);
        buttonEco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v6) {
                openEco();
            }
        });


    }

    public void openCreateurEnfant() {
        Intent intent2 = new Intent(this, editeur_cat_enfant.class);
        startActivity(intent2);
    }

    public void openArriere() {
        Intent intent = new Intent(this, PageGrille.class);
        startActivity(intent);
    }

    public void openDiv() {
        Intent intent3 = new Intent(this, editeur_cat_divertissement.class);
        startActivity(intent3);
    }

    public void openRef() {
        Intent intent4 = new Intent(this, editeur_cat_reflexion.class);
        startActivity(intent4);
    }

    public void openEco() {
        Intent intent5 = new Intent(this, editeur_cat_ecoludique.class);
        startActivity(intent5);
    }

}