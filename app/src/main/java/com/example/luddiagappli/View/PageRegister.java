package com.example.luddiagappli.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.luddiagappli.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PageRegister extends AppCompatActivity {

    private FloatingActionButton boutonArriereMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_register);

        boutonArriereMain = (FloatingActionButton) findViewById(R.id.boutonArriereMain);
        boutonArriereMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openMain();
            }
        });
    }

    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}