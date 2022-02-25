package com.example.luddiagappli.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.luddiagappli.Model.database;
import com.example.luddiagappli.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //code a inclure
        database db = new database();
    }
}