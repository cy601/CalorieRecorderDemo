package com.example.cy601.calorierecorderdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class Edit_activity extends Activity {
    private Button plusBtn;
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_activity);

    }
    public void init(){
     plusBtn=(Button)findViewById(R.id.plusBtn);
    }

}
