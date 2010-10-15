package com.stwalkerster.android.apps.fsremote;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.*;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainMenuActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setTitle(getResources().getString(R.string.mainMenuTitle));
		
		String[] menuItems = getResources().getStringArray(R.array.mainMenu);
		
		ArrayAdapter<String> aA = new ArrayAdapter<String>(this, R.layout.list_item, menuItems) ;
		setListAdapter(aA);
		
		ListView lv = getListView();
		lv.setTextFilterEnabled(true);
		
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id){
				// override buttons
				if(((TextView)view).getText().equals(getResources().getString(R.string.overrideButtons)))
				{
					startActivity(new Intent(MainMenuActivity.this, OverrideButtonsActivity.class));
				}
				// sequences
				if(((TextView)view).getText().equals(getResources().getString(R.string.sequences)))
				{
					startActivity(new Intent(MainMenuActivity.this, SequenceActivity.class));
				}
				//fixture control
				// Console
				if(((TextView)view).getText().equals(getResources().getString(R.string.console)))
				{
					startActivity(new Intent(MainMenuActivity.this, ConsoleActivity.class));
				}
				//config
				if(((TextView)view).getText().equals( getResources().getString(R.string.configuration)))
				{
					startActivity(new Intent(MainMenuActivity.this, ConfigMenuActivity.class));
				}
				//connect

				if(((TextView)view).getText().equals(getResources().getString(R.string.connect)))
				{
					SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
					String ip = sp.getString("configServerIp", "192.168.1.1");
					String prt = sp.getString("configServerPort", "3000");
					
					Toast.makeText(getBaseContext(), "Connecting to " + ip + ":" + prt, Toast.LENGTH_SHORT).show();
					
				}
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
