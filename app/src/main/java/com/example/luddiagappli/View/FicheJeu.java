package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;

public class FicheJeu extends AppCompatActivity {

    private Button button;
    private Button buttonArriere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_jeu);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openActivity2();
            }
        });

        buttonArriere = (Button) findViewById(R.id.boutonArriere);
        buttonArriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openArriere();
            }
        });
    }


    public void openArriere() {
        Intent intent = new Intent(this, editeur_cat_enfant.class);
        startActivity(intent);
    }

    public void openActivity2() {
        Intent intent = new Intent(this, ValidationActivity.class);
        startActivity(intent);
    }
}