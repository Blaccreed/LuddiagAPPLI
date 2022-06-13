package com.example.luddiagappli.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.luddiagappli.R;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PageRegister extends AppCompatActivity {

    private Button boutonArriereMain;
    private Button BoutonEnregistrer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_register);

        BoutonEnregistrer = (Button) findViewById(R.id.BoutonEnregistrer);
        BoutonEnregistrer.setOnClickListener(v1 -> {
            new AlertDialog.Builder(v1.getContext())
                    .setTitle("Enregistrement terminé ")
                    .setMessage("Amusez vous bien :-) ! ")

                    .setPositiveButton("OKAY !", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            openGrille();
                        }
                    }).show();

        });

        boutonArriereMain = (Button) findViewById(R.id.boutonArriereMain);
        boutonArriereMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                openMain();
            }
        });
    }


    public void openGrille() {
        Intent intent = new Intent(this, PageGrille.class);
        startActivity(intent);
    }

    public void openMain() {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }

}
