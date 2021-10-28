package com.example.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lab2bt2_Activity extends AppCompatActivity {

    EditText edtFah, edtCel;
    Button btnFah, btnCel, btnE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2bt2_layout);

        edtFah = (EditText) findViewById(R.id.txtFahreheit);
        edtCel = (EditText) findViewById(R.id.txtCelcius);
        btnCel = (Button) findViewById(R.id.buttonCel);
        btnFah = (Button) findViewById(R.id.buttonFah);
        btnE   = (Button) findViewById(R.id.buttonExit);

        btnFah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = edtFah.getText().toString();
                int txtFahreheit = Integer.parseInt(chuoi1);

                int kq1 = (int)((txtFahreheit - 32) * (5 / 9));
                edtCel.setText(String.valueOf(kq1));
            }
        });

        btnCel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi2 = edtCel.getText().toString();
                int txtCelcius = Integer.parseInt(chuoi2);

                int kq2 = (int) ((txtCelcius *9.5) +32);
                edtFah.setText(String.valueOf(kq2));
            }
        });
    }
}