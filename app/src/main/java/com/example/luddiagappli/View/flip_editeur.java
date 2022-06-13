package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class flip_editeur extends AppCompatActivity {

    private Button boutonArriere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_editeur);

        boutonArriere = (Button) findViewById(R.id.boutonArriere);
        boutonArriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGrille();
            }
        });
    }

    public void openGrille() {
        Intent intent = new Intent(this, PageGrille.class);
        startActivity(intent);
    }


}