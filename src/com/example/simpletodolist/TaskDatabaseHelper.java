package com.example.simpletodolist;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDatabaseHelper extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION = 1;
    public static final String TASKS_TABLE_NAME = "tasks";
    private static final String TASKS_COLUMN_ID = "_id";
    public static final String TASKS_COLUMN_NAME = "name";
    private static final String TASKS_TABLE_CREATE =
                "CREATE TABLE " + TASKS_TABLE_NAME + " (" +
                TASKS_COLUMN_ID + " integer primary key autoincrement, " +
                TASKS_COLUMN_NAME + " TEXT);";
    public static final String[] ALL_COLUMNS = {TASKS_COLUMN_NAME};
	
    public TaskDatabaseHelper(Context context) {
    	super(context, TASKS_TABLE_NAME, null, DATABASE_VERSION);
    }

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(TASKS_TABLE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
		// TODO Auto-generated method stub

	}

}
