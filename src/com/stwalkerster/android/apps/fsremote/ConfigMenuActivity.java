package com.stwalkerster.android.apps.fsremote;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;

public class ConfigMenuActivity extends ListActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setTitle(getResources().getString(R.string.configTitle));
		
		String[] menuItems = getResources().getStringArray(R.array.configMenu);
		
		ArrayAdapter<String> aA = new ArrayAdapter<String>(this, R.layout.list_item, menuItems) ;
		setListAdapter(aA);
		
		ListView lv = getListView();
		lv.setTextFilterEnabled(true);
		
		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id){
				// switch activity
			}
		});
	}

}
