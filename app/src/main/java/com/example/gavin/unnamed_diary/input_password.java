package com.example.gavin.unnamed_diary;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class input_password extends AppCompatActivity implements View.OnClickListener{
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,B_del;
    TextView text;
    String st = "";
    String nowInsert;
    String passwordGotFromSetting;
    Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_password);

        callingObjects2();
        settingListners();

        SharedPreferences getPassword = getSharedPreferences("PASSWORD",MODE_PRIVATE);
        passwordGotFromSetting = getPassword.getString("Passwords","Data not found");
        //text.setText(passwordGotFromSetting);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.one:
                st = st+"1";
                text.setText(st);
                if(st.length()==4){
                    whenLengthEqual4();
                }
                break;

            case R.id.two:
                st = st+"2";
                text.setText(st);
                if(st.length()==4){
                    whenLengthEqual4();
                }
                break;

            case R.id.three:
                st = st+"3";
                text.setText(st);
                if(st.length()==4){
                    whenLengthEqual4();
                }
                break;

            case R.id.four:
                st = st+"4";
                text.setText(st);
                if(st.length()==4){
                    whenLengthEqual4();
                }
                break;

            case R.id.five:
                st = st+"5";
                text.setText(st);
                if(st.length()==4){
                    whenLengthEqual4();
                }
                break;

            case R.id.six:
                st = st+"6";
                text.setText(st);
                if(st.length()==4){
                    whenLengthEqual4();
                }
                break;

            case R.id.seven:
                st = st+"7";
                text.setText(st);
                if(st.length()==4){
                    whenLengthEqual4();
                }
                break;

            case R.id.eight:
                st = st+"8";
                text.setText(st);
                if(st.length()==4){
                    whenLengthEqual4();
                }
                break;

            case R.id.nine:
                st = st+"9";
                text.setText(st);
                if(st.length()==4){
                    whenLengthEqual4();
                }
                break;

            case R.id.zero:
                st = st+"0";
                text.setText(st);
                if(st.length()==4){
                    whenLengthEqual4();
                }
                break;

            case R.id.delete:
                st="";
                text.setText(st);

                break;

        }
    }

    private void whenLengthEqual4(){
        nowInsert = text.getText().toString();
        if (nowInsert.equals(passwordGotFromSetting)){
            //Toast.makeText(this,"YESSSS",Toast.LENGTH_SHORT).show();
            intent.setClass(input_password.this,main_diaryPage.class);
            startActivity(intent);
        }else{
            st="";
            text.setText(st);
            Toast.makeText(this,"Password wrong!",Toast.LENGTH_SHORT).show();
        }
    }

//    void reset(){
//        AlertDialog.Builder ab=new AlertDialog.Builder(input_password.this)
//                .setTitle("注意")
//                .setMessage("您已經輸入密碼錯誤10次以上了，請問要重設密碼嗎")
//                .setPositiveButton("是", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        startActivity(out);
//                    }
//                })
//                .setPositiveButton("否", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//
//                    }
//                });
//        ab.show();
//    }

    private void callingObjects2(){

        text= findViewById(R.id.editText);
        b1= findViewById(R.id.one);
        b2= findViewById(R.id.two);
        b3= findViewById(R.id.three);
        b4= findViewById(R.id.four);
        b5= findViewById(R.id.five);
        b6= findViewById(R.id.six);
        b7= findViewById(R.id.seven);
        b8= findViewById(R.id.eight);
        b9= findViewById(R.id.nine);
        b0= findViewById(R.id.zero);
        B_del= findViewById(R.id.delete);

    }

    private void settingListners(){

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        B_del.setOnClickListener(this);

    }

}
