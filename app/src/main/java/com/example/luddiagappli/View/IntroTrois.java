package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;

public class IntroTrois extends AppCompatActivity {

    private Button boutonAvant;
    private Button boutonArriere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_trois);

        boutonAvant = (Button) findViewById(R.id.boutonAvant);
        boutonAvant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFicheJeu();
            }
        });

        boutonArriere = (Button) findViewById(R.id.boutonArriere);
        boutonArriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openIntroDeux();
            }
        });
    }

    public void openIntroDeux() {
        Intent intent2 = new Intent(this, IntroDeux.class);
        startActivity(intent2);
    }

    public void openFicheJeu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}