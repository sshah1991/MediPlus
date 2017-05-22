package com.example.sumeet.mediplustry1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Sumeet on 20-05-2017.
 */

public class dbHelper extends SQLiteOpenHelper {
    //Db Version
    private static final int database_VERSIONS = 7;
    //Db Name
    public static final String DATABASE_NAMES = "contents1.db";
    //Db name
    public static final String TABLE_NAMES = "MediplusDatabases";
    //rows
    public static final String Col_Drug_ID = "id";
    public static final String Col_Drug_Name = "name";
    public static final String Col_Drug_Description = "description";
    public static final String Col_Drug_Price = "price";


    //  SQL Querry tocreate table
    private static final String CREATE_TABLES =
            "CREATE TABLE " + TABLE_NAMES + " (" +
                    Col_Drug_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + Col_Drug_Name + " TEXT,"
                    + Col_Drug_Description + "TEXT,"
                    + Col_Drug_Price + " TEXT );";

    //Execute CreateTable onCreate


    public dbHelper(Context context) {

        super(context, DATABASE_NAMES, null, database_VERSIONS);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Log.i("Tag", "Oncreate of dataase");
        sqLiteDatabase.execSQL(CREATE_TABLES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAMES);
        onCreate(sqLiteDatabase);
    }

    public Boolean insertData(String name, String description, String price) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name", name);
        //Log.i("Tag","entered Name");
        values.put("description", description);
        // Log.i("Tag","entered Name");
        values.put("price", price);
        //Log.i("Tag","entered Name");
        long result = sqLiteDatabase.insert(TABLE_NAMES, null, values);
        if (result == -1) {
            return false;
        } else
            return true;
    }
}
