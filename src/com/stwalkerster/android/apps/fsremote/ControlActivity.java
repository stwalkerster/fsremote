package com.stwalkerster.android.apps.fsremote;

import android.app.*;
import android.content.Context;
import android.os.*;
import android.widget.ArrayAdapter;

public class ControlActivity extends ListActivity {
	
	String[] menuItems = { "mainMenu1", "mainMenu2", "mainMenu3" };
	
	public ControlActivity() {
		
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.main);
		
		ArrayAdapter<String> aA = new ArrayAdapter<String>(this, 0, menuItems) ;
		setListAdapter(aA);
	}
	
}
