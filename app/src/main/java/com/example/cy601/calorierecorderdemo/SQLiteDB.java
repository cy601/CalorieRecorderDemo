package com.example.cy601.calorierecorderdemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteDB extends SQLiteOpenHelper {
    public static final String NAME = "Calorie";//数据库名
    public static final int VERSION = 1;//版本号
    /* content上下文对象 name数据库名称 factory数据库工厂 version版本      *
     * @param context
   */
public SQLiteDB(Context context) {
    super(context, NAME, null, VERSION);
    // TODO Auto-generated constructor stub
     }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String userSQL = "create table calorie" + "(id integer primary key autoincrement," + "name varchar(5),"                      + "age integer)";           db.execSQL(userSQL);
        db.execSQL(userSQL);
    }

    @Override
           public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    // TODO Auto-generated method stub
               }
}




