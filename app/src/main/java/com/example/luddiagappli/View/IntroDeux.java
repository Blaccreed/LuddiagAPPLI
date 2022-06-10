package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;

public class IntroDeux extends AppCompatActivity {

    private Button boutonAvant;
    private Button boutonArriere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_deux);

        boutonAvant = (Button) findViewById(R.id.boutonAvant);
        boutonAvant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIntroTrois();
            }
        });

        boutonArriere = (Button) findViewById(R.id.boutonArriere);
        boutonArriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openIntroUn();
            }
        });
    }

    public void openIntroUn() {
        Intent intent2 = new Intent(this, IntroUn.class);
        startActivity(intent2);
    }

    public void openIntroTrois() {
        Intent intent = new Intent(this, IntroTrois.class);
        startActivity(intent);
    }
}