package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;
import com.example.luddiagappli.View.MainActivity;
import com.example.luddiagappli.View.PageGrille;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class flip_createur extends AppCompatActivity {

    private Button buttonEnfant;
    private Button buttonArriere;
    private Button buttondivertissement;
    private Button buttonReflexion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_createur);


        buttonEnfant = (Button) findViewById(R.id.buttonEnfant);
        buttonEnfant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                openCreateurEnfant();
            }
        });

        buttonArriere = (Button) findViewById(R.id.boutonArriere);
        buttonArriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openArriere();
            }
        });

        buttondivertissement = (Button) findViewById(R.id.buttondivertissement);
        buttondivertissement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v4) {
                openDivertissement();
            }
        });

        buttonReflexion = (Button) findViewById(R.id.buttonReflexion);
        buttonReflexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v5) {
                openReflexion();
            }
        });



    }

    public void openCreateurEnfant() {
        Intent intent2 = new Intent(this, createur_cat_enfant.class);
        startActivity(intent2);
    }

    public void openArriere() {
        Intent intent = new Intent(this, PageGrille.class);
        startActivity(intent);
    }

    public void openDivertissement() {
        Intent intent3 = new Intent(this, createur_cat_divertissement.class);
        startActivity(intent3);
    }

    public void openReflexion() {
        Intent intent4 = new Intent(this, createur_cat_reflexion.class);
        startActivity(intent4);
    }

    //buttonEnfant



}