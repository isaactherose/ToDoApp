package com.oneroseapps.todoapp;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	//initializes the array
	private ArrayList<String> todoItems;
	
	
	//initializes the adapter
	private ArrayAdapter<String> todoAdapter;
	
	//initalizes the listview
	private ListView lvItems;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //gets the view to show in this activity
        setContentView(R.layout.activity_main);
        //populates array
        populateArrayListItems();
        //uses the adapter to map data to a view
          todoAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, todoItems);
        lvItems.setAdapter(todoAdapter);
    }

    //function to put an item in the array
    private void populateArrayListItems() {
    	todoItems = new ArrayList<String>();
    	todoItems.add("Item 1");
    	todoItems.add("Item 1");
    	todoItems.add("Item 1");
    }


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

 

}
