package com.example.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lab2bt1 extends AppCompatActivity {
    EditText editTextSoA, editTextSoB;
    Button buttonTong, buttonHieu, buttonTich, buttonThuong, buttonUCLN, buttonThoat;
    EditText ketqua1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2bt1);

        editTextSoA = (EditText) findViewById(R.id.edtSoA);
        editTextSoB = (EditText) findViewById(R.id.edtSoB);
        ketqua1 = (EditText) findViewById(R.id.ketqua);
        buttonTong = (Button) findViewById(R.id.btnTong);
        buttonHieu = (Button) findViewById(R.id.btnHieu);
        buttonTich = (Button) findViewById(R.id.btnTich);
        buttonThuong = (Button) findViewById(R.id.btnThuong);
        buttonUCLN = (Button) findViewById(R.id.btnUCLN);
        buttonThoat = (Button) findViewById(R.id.btnThoat);

        buttonTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = editTextSoA.getText().toString();
                int soA = Integer.parseInt(chuoi1);

                String chuoi2 = editTextSoB.getText().toString();
                int soB = Integer.parseInt(chuoi2);

                int tong = soA + soB;
                ketqua1.setText(String.valueOf(tong));

            }

        });

        buttonHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = editTextSoA.getText().toString();
                int soA = Integer.parseInt(chuoi1);

                String chuoi2 = editTextSoB.getText().toString();
                int soB = Integer.parseInt(chuoi2);

                int hieu = soA - soB;
                ketqua1.setText(String.valueOf(hieu));
            }
        });

        buttonTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = editTextSoA.getText().toString();
                int soA = Integer.parseInt(chuoi1);

                String chuoi2 = editTextSoB.getText().toString();
                int soB = Integer.parseInt(chuoi2);

                int tich = soA * soB;
                ketqua1.setText(String.valueOf(tich));
            }
        });

        buttonThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = editTextSoA.getText().toString();
                int soA = Integer.parseInt(chuoi1);

                String chuoi2 = editTextSoB.getText().toString();
                int soB = Integer.parseInt(chuoi2);

                int thuong = soA / soB;
                ketqua1.setText(String.valueOf(thuong));
            }
        });
        buttonUCLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = editTextSoA.getText().toString();
                int soA = Integer.parseInt(chuoi1);

                String chuoi2 = editTextSoB.getText().toString();
                int soB = Integer.parseInt(chuoi2);

                while (soA != soB) {
                    if (soA > soB)
                        soA = soA - soB;
                    else
                        soB = soB - soA;
                }
                ketqua1.setText(String.valueOf(soA));
            }
        });

    }
}

