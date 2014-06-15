package com.oneroseapps.todoapp;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

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
       items.add("test");
       deleteItem();
    }
    
	public void addToDoItem(View v){
    	//on the add button click, this will happen
    	//initialize the edit text item
    	//add that text to the listview
    	EditText etItem = (EditText) findViewById(R.id.etItem);
    	itemsAdapter.add(etItem.getText().toString());   
    	etItem.setText("");
    }
	private void deleteItem() {
    	lvItems.setOnItemLongClickListener(new OnItemLongClickListener() {
    		public boolean onItemLongClick(AdapterView<?> aView, View item, int pos, long id){
    			items.remove(
    					pos);
    			itemsAdapter.notifyDataSetInvalidated();
    			return true;
    		}
    	});
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

 

}
