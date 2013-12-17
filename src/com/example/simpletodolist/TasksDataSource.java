package com.example.simpletodolist;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class TasksDataSource {
	private SQLiteDatabase database;
	private TaskDatabaseHelper dbHelper;

	public TasksDataSource(Context context) {
		dbHelper = new TaskDatabaseHelper(context);
	}
	
	public void open() throws SQLException {
		database = dbHelper.getWritableDatabase();
	}

	public void close() {
		dbHelper.close();
	}
	
	public Cursor getAllItems() {
		// TODO Auto-generated method stub
		return database.query(TaskDatabaseHelper.TASKS_TABLE_NAME, TaskDatabaseHelper.ALL_COLUMNS,
				null, null, null, null, TaskDatabaseHelper.TASKS_COLUMN_NAME);
	}

}
