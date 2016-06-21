package com.giao.checklist;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * Created by Long on 2/13/2016.
 */
public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="CheckList";
    private static final String TABLE_CHECKLIST="CheckList";
    private static final String TABLE_CHECKLISTITEM="CheckListItem";
    private static final String TABLE_ITEMDATE="ItemDate";
    //CheckList Table columns
    public static final String CheckListName="CheckListName";
    //CheckListItem Table columns
    public static final String ckItemID="ckItemID";
    public static final String checkListName="checkListName";
    public static final String ckItemName="ckItemName";
    //ItemDate Table columns
    public static final String ckItem_DateID="ckItemID";
    public static final String ckDate="ckDate";
    public static final String itemNote="itemNote";

    private static final int DATABASE_VERSION=1;

    private static Context context;
    public DataHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
        this.context=context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String CreateTABLE_CHECKLIST="CREATE TABLE IF NOT EXISTS "+TABLE_CHECKLIST+" ("
                + CheckListName+ " TEXT PRIMARY KEY NOT NULL "
                +");";
        String CreateTABLE_CHECKLISTITEM="CREATE TABLE IF NOT EXISTS "+TABLE_CHECKLISTITEM+" ("
                + ckItemID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + checkListName+ " TEXT PRIMARY KEY NOT NULL, "
                + ckItemName+ " TEXT PRIMARY KEY NOT NULL "
                +");";
        String CreateTABLE_ITEMDATE=//"CREATE TABLE IF NOT EXISTS Orders(OrderID INTEGER PRIMARY KEY AUTOINCREMENT, TableName TEXT NOT NULL, OrderDate NUMERIC NOT NULL, NumberOfCustomer INTEGER, OrderNote TEXT, OrderPaid REAL)";
                "CREATE TABLE IF NOT EXISTS "+TABLE_ITEMDATE+ " ("
                        + ckItem_DateID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "
                        + ckDate+ " TEXT PRIMARY KEY NOT NULL, "
                        + itemNote+ " TEXT PRIMARY KEY NOT NULL "
                        +");";

        db.execSQL(CreateTABLE_CHECKLIST);
        db.execSQL(CreateTABLE_CHECKLISTITEM);
        db.execSQL(CreateTABLE_ITEMDATE);




    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
 //       Log.w(TableDAO.class.getName(), "Upgrading database from old to new version...");
        db.execSQL("DROP TABLE IF EXISTs " + TABLE_ITEMDATE);
        db.execSQL("DROP TABLE IF EXISTs " + TABLE_CHECKLISTITEM);
        db.execSQL("DROP TABLE IF EXISTs " + TABLE_CHECKLIST);
        onCreate(db);
    }

}