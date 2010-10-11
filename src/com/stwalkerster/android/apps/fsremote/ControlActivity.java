package com.stwalkerster.android.apps.fsremote;

import android.app.*;
import android.content.Context;
import android.os.*;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ControlActivity extends ListActivity {
	
	
	
	public ControlActivity() {
		
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String[] menuItems = getResources().getStringArray(R.array.mainMenu);
		
		ArrayAdapter<String> aA = new ArrayAdapter<String>(this, R.layout.list_item, menuItems) ;
		setListAdapter(aA);
		
		ListView lv = getListView();
		lv.setTextFilterEnabled(true);
		
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id){
				// switch activity
			}
		});
		
		lv.setOnItemLongClickListener(new OnItemLongClickListener() {
			public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id){
				String[] menuItems = getResources().getStringArray(R.array.mainMenu);
				String[] mainMenuDescriptors = getResources().getStringArray(R.array.mainMenuDescriptors);
				
				for(int i=0;i< menuItems.length;i++){
					if(((TextView)view).getText().equals(menuItems[i])){
						Toast.makeText(getApplicationContext(),mainMenuDescriptors[i] , Toast.LENGTH_LONG).show();
						return false;
					}
				}
				
				return false;
			}
		});
	}

}
