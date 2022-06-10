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
    private FloatingActionButton buttonArriere;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_createur);


        buttonEnfant = (Button) findViewById(R.id.buttonEnfant);
        buttonEnfant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                openEditeurEnfant();
            }
        });

        buttonArriere = (FloatingActionButton) findViewById(R.id.boutonArriere);
        buttonArriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openArriere();
            }
        });

    }

    public void openEditeurEnfant() {
        Intent intent2 = new Intent(this, EditeurCatEnfant.class);
        startActivity(intent2);
    }

    public void openArriere() {
        Intent intent = new Intent(this, PageGrille.class);
        startActivity(intent);
    }

    //buttonEnfant



}