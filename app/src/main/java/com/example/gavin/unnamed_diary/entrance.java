package com.example.gavin.unnamed_diary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

public class entrance extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrance_page);

        intent = new Intent(this,main_diaryPage.class);

    }

    public boolean onTouchEvent(MotionEvent event){

        startActivity(intent);

        return true;

    }
}
