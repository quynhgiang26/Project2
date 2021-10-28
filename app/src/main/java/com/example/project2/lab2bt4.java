package com.example.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class lab2bt4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2bt4_activity);
    }
    public void btntinhBMI (View arg0){
        Button btnChuandoan = (Button) findViewById(R.id.btntinhBMI);
        EditText editTen, editChieucao, editCannang, editBMI, editChuandoan;
        editChieucao = (EditText) findViewById(R.id.editten);
        editCannang  = (EditText) findViewById(R.id.editcannang);
        editBMI      = (EditText) findViewById(R.id.edittinhBMI);
        editChuandoan= (EditText) findViewById(R.id.editChuanDoan);
        double H=Double.parseDouble(editChieucao.getText()+"");
        double W=Double.parseDouble(editCannang.getText()+"");
        double BMI=W/Math.pov(H, 2);
        String chuandoan="";
        
        if(BMI<18)
        {
            chuandoan="Bạn gầy";
        }
        else if(BMI<=24.9){
            chuandoan="Bạn bình thường";
        }
        else if(BMI<=29.9){
            chuandoan="Bạn béo phì độ 1 ";
        }
        else if(BMI<=34.9){
            chuandoan="Bạn béo phì độ 2";
        }
        else{
            chuandoan="Bạn béo phì độ 3";
        }
        DecimalFormat dcf = new DecimalFormat("#.0");
        editBMI.setText(dcf.format(BMI));
        editChuandoan.setText(chuandoan);
    }
}