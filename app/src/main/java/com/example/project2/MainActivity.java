package com.example.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    public static final String TAG ="MyMessage";
//    private EditText editTextTextPersonName;
//    private EditText editTextTextPersonName2;
//    private Button button;

    private CheckBox checkBoxAll;
    private CheckBox checkBoxDau;
    private CheckBox checkBoxSua;
    private CheckBox checkBoxDua;

    private Button buttonShowKetqua;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.checkBoxAll = (CheckBox) this.findViewById(R.id.checkBoxAll);
        this.checkBoxDau = (CheckBox) this.findViewById(R.id.checkBoxDau);
        this.checkBoxSua = (CheckBox) this.findViewById(R.id.checkBoxSua);
        this.checkBoxDua = (CheckBox) this.findViewById(R.id.checkBoxDua);

        this.buttonShowKetqua = (Button) this.findViewById(R.id.buttonKetqua;

        this.buttonShowKetqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showResult();
            }
        });


        this.checkBoxAll.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                checkAllCheckedChange(isChecked);
            }
        });
    }

    private void showResult()  {
        String message = null;
        if(this.checkBoxDau.isChecked()) {
            message =  this.checkBoxDau.getText().toString();
        }
        if(this.checkBoxSua.isChecked()) {
            if(message== null)  {
                message =  this.checkBoxSua.getText().toString();
            } else {
                message += ", " + this.checkBoxSua.getText().toString();
            }
        }
        if(this.checkBoxDua.isChecked()) {
            if(message== null)  {
                message =  this.checkBoxDua.getText().toString();
            } else {
                message += ", " + this.checkBoxDua.getText().toString();
            }
        }
        message = message == null? "You select nothing": "You select: " + message;
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    // When "Check All" change state.
    private void checkAllCheckedChange(boolean isChecked)  {
        this.checkBoxDau.setChecked(isChecked);
        this.checkBoxSua.setChecked(isChecked);
        this.checkBoxDua.setChecked(isChecked);
    }

//        this.editTextTextPersonName = (EditText)this.findViewById(R.id.editTextTextPersonName);
//        this.editTextTextPersonName2 = (EditText)this.findViewById(R.id.editTextTextPersonName2);
//
//        this.button = (Button)this.findViewById(R.id.button);
//        this.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                add2Number();
//            }
//        });
//    }
//    private void add2Number() {
//        String str = this.editTextTextPersonName.getText().toString();
//        String str2 = this.editTextTextPersonName2.getText().toString();
//        try {
//            double value = Double.parseDouble(str);
//            double value2 = Double.parseDouble(str2);
//
//            double result = value + value2;
//
//            Toast.makeText(this,"Result:" +result, Toast.LENGTH_SHORT).show();
//        }catch (Exception e){
//            Toast.makeText(this,"Error"+e,Toast.LENGTH_SHORT).show();
//        }
//    }
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
}