package com.example.gavin.unnamed_diary;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class theDataBase extends SQLiteOpenHelper{

    private final static String DATABASE_NAME = "diary_database";
    private final static int DATABASE_VER = 1;
    private final static String TABLE_NAME = "diary_table";
    private final static String FELID_ID = "_id";
    private final static String FELID_TEXT = "diary_text";
    private String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "("
            + FELID_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + FELID_TEXT
            + " TEXT);";
    public SQLiteDatabase database;


    public theDataBase(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VER);
        database = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        onCreate(db);
    }

    public Cursor selecter(){
        Cursor c = database.query(TABLE_NAME,null,null,null,null,null,null);
        return c;
    }

    public void insert(String itemText){
        ContentValues values = new ContentValues();
        values.put(FELID_TEXT,itemText);
        database.insert(TABLE_NAME,null,values);
    }

    public void delete(int id){
        database.delete(TABLE_NAME,FELID_ID + "=" + Integer.toString(id),null);
    }

    public void update(int id,String itemText){
        ContentValues values = new ContentValues();
        values.put(FELID_TEXT,itemText);
        database.update(TABLE_NAME,values,FELID_ID + "=" + Integer.toString(id),null);
    }

    public void close(){
        database.close();
    }
}
