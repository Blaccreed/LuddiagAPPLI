package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;

public class VoteTermine extends AppCompatActivity {

    private Button buttonRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_termine);

        buttonRetour = (Button) findViewById(R.id.buttonRetour);
        buttonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openActivity2();
            }
        });
    }


    public void openActivity2() {
        Intent intent = new Intent(this, editeur_cat_enfant.class);
        startActivity(intent);
    }
}