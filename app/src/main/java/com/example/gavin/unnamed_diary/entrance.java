package com.example.gavin.unnamed_diary;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

public class entrance extends AppCompatActivity {

    Intent intent = new Intent();
    private SharedPreferences rememberInformation;
    // storing the information about if first time or not
    int FirstOrNot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrance_page);

        rememberInformation = getSharedPreferences("information",MODE_PRIVATE);
        FirstOrNot = rememberInformation.getInt("DETERMINE",0);


    }

    public boolean onTouchEvent(MotionEvent event) {

       if (FirstOrNot == 0){
            intent.setClass(entrance.this,set_password.class);;
            rememberInformation.edit()
                    .putInt("DETERMINE",FirstOrNot+1)
                    .apply();
       } else{
            //while FirstOrNot > 0
            intent.setClass(entrance.this,input_password.class);
        }

        startActivity(intent);

        return true;

    }
}
