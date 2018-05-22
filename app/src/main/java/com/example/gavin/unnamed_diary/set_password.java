package com.example.gavin.unnamed_diary;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class set_password extends AppCompatActivity implements View.OnClickListener{

    String str="";
    ImageButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,Bt_del;
    TextView text;

    private SharedPreferences rememberPassword;
    // literally storing the password

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_password);

        callingObjects();
        settingListeners();

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.one:
                str = str+"1";
                text.setText(str);
                if(changePage(str)){
                    setPassword();
                }
                break;

            case R.id.two:
                str = str+"2";
                text.setText(str);
                if(changePage(str)){
                    setPassword();
                }
                break;

            case R.id.three:
                str = str+"3";
                text.setText(str);
                if(changePage(str)){
                    setPassword();
                }
                break;

            case R.id.four:
                str = str+"4";
                text.setText(str);
                if(changePage(str)){
                    setPassword();
                }
                break;

            case R.id.five:
                str = str+"5";
                text.setText(str);
                if(changePage(str)){
                    setPassword();
                }
                break;

            case R.id.six:
                str = str+"6";
                text.setText(str);
                if(changePage(str)){
                    setPassword();
                }
                break;

            case R.id.seven:
                str = str+"7";
                text.setText(str);
                if(changePage(str)){
                    setPassword();
                }
                break;

            case R.id.eight:
                str = str+"8";
                text.setText(str);
                if(changePage(str)){
                    setPassword();
                }
                break;

            case R.id.nine:
                str = str+"9";
                text.setText(str);
                if(changePage(str)){
                    setPassword();
                }
                break;

            case R.id.zero:
                str = str+"0";
                text.setText(str);
                if(changePage(str)){
                    setPassword();
                }
                break;

            case R.id.delete:
                str="";
                text.setText(str);

                break;

        }
    }

    public boolean changePage(String s){
        return s.length() == 4;
    }

    private void setPassword(){
        AlertDialog.Builder ab=new AlertDialog.Builder(set_password.this)
                .setTitle("注意").setMessage("確定要設為密碼嗎")
                .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        rememberPassword = getSharedPreferences("PASSWORD", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = rememberPassword.edit();
                        editor.putString("Passwords",text.getText().toString());
                        editor.apply();

                        Intent toMain = new Intent();
                        toMain.setClass(set_password.this,main_diaryPage.class);
                        startActivity(toMain);

                    }
                })
                .setNegativeButton("重設", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        str="";
                    }
                });
        ab.show();
    }


    private void callingObjects(){

        text = findViewById(R.id.editText);
        bt1 = findViewById(R.id.one);
        bt2 = findViewById(R.id.two);
        bt3 = findViewById(R.id.three);
        bt4 = findViewById(R.id.four);
        bt5 = findViewById(R.id.five);
        bt6 = findViewById(R.id.six);
        bt7 = findViewById(R.id.seven);
        bt8 = findViewById(R.id.eight);
        bt9 = findViewById(R.id.nine);
        bt0 = findViewById(R.id.zero);
        Bt_del = findViewById(R.id.delete);

    }

    private void settingListeners(){

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        bt0.setOnClickListener(this);
        Bt_del.setOnClickListener(this);

    }



}
