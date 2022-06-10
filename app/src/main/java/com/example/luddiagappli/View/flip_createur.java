package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.luddiagappli.R;
import com.example.luddiagappli.View.MainActivity;
import com.example.luddiagappli.View.PageGrille;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class flip_createur extends AppCompatActivity {

    private FloatingActionButton boutonArriere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_createur);

        boutonArriere = (FloatingActionButton) findViewById(R.id.boutonArriere);
        boutonArriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openMain();
            }
        });
    }

    public void openMain() {
        Intent intent = new Intent(this, PageGrille.class);
        startActivity(intent);
    }
}