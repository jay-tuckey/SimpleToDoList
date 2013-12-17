package com.example.simpletodolist;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;

public class TaskList extends Activity {

	private TasksDataSource db;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        
        db = new TasksDataSource(getApplicationContext());
        db.open();
        
        Cursor cursor = db.getAllItems();
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.task_list, menu);
        return true;
    }
    
    protected void onDestroy() {
    	db.close();
    }
    
}
