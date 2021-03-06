package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ValidationActivity extends AppCompatActivity {

    private Button boutonAvant;
    private Button boutonArriere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validation);

        boutonAvant = (Button) findViewById(R.id.boutonAvant);
        boutonAvant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFin();
            }
        });

        boutonArriere = (Button) findViewById(R.id.boutonArriere);
        boutonArriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openFiche();
            }
        });
    }

    public void openFin() {
        Intent intent = new Intent(this, VoteTermine.class);
        startActivity(intent);
    }

    public void openFiche() {
        Intent intent2 = new Intent(this, FicheJeu.class);
        startActivity(intent2);
    }
}