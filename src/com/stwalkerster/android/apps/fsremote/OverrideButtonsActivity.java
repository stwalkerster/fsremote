package com.stwalkerster.android.apps.fsremote;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class OverrideButtonsActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setTitle(getResources().getString(R.string.overrideButtonsTitle));

		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());

		String[] menuItems = { 
				sp.getString("button1", "Button"),
				sp.getString("button2", "Button"),
				sp.getString("button3", "Button"),
				sp.getString("button4", "Button") ,
				sp.getString("button5", "Button"),
				sp.getString("button6", "Button"),
				sp.getString("button7", "Button"),
				sp.getString("button8", "Button") ,
				sp.getString("button9", "Button"),
				sp.getString("button10", "Button"),
				sp.getString("button11", "Button"),
				sp.getString("button12", "Button"),
				sp.getString("button13", "Button"),
				sp.getString("button14", "Button") ,
				sp.getString("button15", "Button"),
				sp.getString("button16", "Button"),
				sp.getString("button17", "Button"),
				sp.getString("button18", "Button") ,
				sp.getString("button19", "Button"),
				sp.getString("button20", "Button"),
				sp.getString("button21", "Button"),
				sp.getString("button22", "Button"),
				sp.getString("button23", "Button"),
				sp.getString("button24", "Button") ,
				sp.getString("button25", "Button"),
				sp.getString("button26", "Button"),
				sp.getString("button27", "Button"),
				sp.getString("button28", "Button") ,
				sp.getString("button29", "Button"),
				sp.getString("button30", "Button"),
				sp.getString("button31", "Button"),
				sp.getString("button32", "Button")
				};

		ArrayAdapter<String> aA = new ArrayAdapter<String>(this,
				R.layout.list_item, menuItems);
		setListAdapter(aA);

		ListView lv = getListView();
		lv.setTextFilterEnabled(true);

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(getBaseContext(), "overide"+(position+1), Toast.LENGTH_SHORT).show();
			}
		});
	}
}
