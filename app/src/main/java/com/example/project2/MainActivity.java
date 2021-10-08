package com.example.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    public static final String TAG ="MyMessage";
    private EditText editTextTextPersonName;
    private EditText editTextTextPersonName2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editTextTextPersonName = (EditText)this.findViewById(R.id.editTextTextPersonName);
        this.editTextTextPersonName2 = (EditText)this.findViewById(R.id.editTextTextPersonName2);

        this.button = (Button)this.findViewById(R.id.button);
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                add2Number();
            }
        });
    }
    private void add2Number( {
        String str = this.editTextTextPersonName.getText().toString();
        String str2 = this.editTextTextPersonName2.getText().toString();
        try {
            double value = Double.parseDouble(str);
            double value2 = Double.parseDouble(str2);

            double result = value + value2;

            Toast.makeText(this,"Result:" +result, Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this,"Error"+e,Toast.LENGTH_SHORT).show();
        }
    }
//    @Override
//    protected void onStop() {
//        super.onStop();
//        // Print Log
//        Log.i(TAG,"onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        // Print Log
//        Log.i(TAG,"onDestroy");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        // Print Log
//        Log.i(TAG,"onPause");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        // Print Log
//        Log.i(TAG,"onResume");      }
//
//    @Override
//    protected void onStart() {
//        super.onStart();
//        // Print Log
//        Log.i(TAG,"onStart");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        // Print Log
//        Log.i(TAG,"onRestart");
//    }



}