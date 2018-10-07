package com.example.cy601.calorierecorderdemo;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

//https://blog.csdn.net/zhaozhuzi/article/details/70598382
public class MainActivity extends AppCompatActivity {
    private Button editBtn,queryBtn;
    private EditText beginData,endData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        editBtn=(Button)findViewById(R.id.editBtn);
        queryBtn=(Button)findViewById(R.id.queryBtn);
        beginData=(EditText)findViewById(R.id.beginData);
        endData=(EditText)findViewById(R.id.endData);
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Edit_activity.class);
                startActivity(intent);
            }
        });
        queryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        beginData.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {



               }
        });

    }




}
