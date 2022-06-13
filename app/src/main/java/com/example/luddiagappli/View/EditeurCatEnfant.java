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

public class EditeurCatEnfant extends AppCompatActivity {

    private Button buttonPanel1;
    private Button boutonArriere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editeur_cat_enfant);

        buttonPanel1 = (Button) findViewById(R.id.buttonPanel1);
        buttonPanel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                openFicheJeu();
            }
        });

        boutonArriere = (Button) findViewById(R.id.boutonArriere);
        boutonArriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openRetour();
            }
        });

    }

    public void openFicheJeu() {
        Intent intent = new Intent(this, FicheJeu.class);
        startActivity(intent);
    }

    public void openRetour() {
        Intent intent = new Intent(this, PageGrille.class);
        startActivity(intent);
    }



}
