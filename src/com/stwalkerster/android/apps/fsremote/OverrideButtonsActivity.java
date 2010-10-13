package com.stwalkerster.android.apps.fsremote;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;


public class OverrideButtonsActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setTitle(getResources().getString(R.string.overrideButtonsTitle));
		
		String[] menuItems = getResources().getStringArray(R.array.mainMenu);
		
		ArrayAdapter<String> aA = new ArrayAdapter<String>(this, R.layout.list_item, menuItems) ;
		setListAdapter(aA);
		
		ListView lv = getListView();
		lv.setTextFilterEnabled(true);
		
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id){

			}
		});
	}
}
