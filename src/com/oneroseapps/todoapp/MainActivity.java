package com.oneroseapps.todoapp;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	ArrayList<String> items;
	ArrayAdapter<String> itemsAdapter;
	ListView lvItems;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //gets the view to show in this activity
        setContentView(R.layout.activity_main);
       lvItems = (ListView) findViewById(R.id.lvItem);
       items = new ArrayList<String>();
       itemsAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, items);
       lvItems.setAdapter(itemsAdapter);
       items.add("Item 1");
       items.add("Item 1");
       items.add("Item 1");
    }

  


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

 

}
