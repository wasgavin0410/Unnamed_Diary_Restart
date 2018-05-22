package com.example.gavin.unnamed_diary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class writingPage extends AppCompatActivity {
    theDataBase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.activity_writing_page);
        db = new theDataBase(this);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText printing = findViewById(R.id.printing);
                String input = printing.getText().toString();
                db.insert(input);
                Intent i = new Intent(writingPage.this,main_diaryPage.class);
                startActivity(i);
                writingPage.this.finish();//結束目前Activity

            }
        });
    }
}
