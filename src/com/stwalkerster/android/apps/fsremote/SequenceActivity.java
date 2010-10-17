package com.stwalkerster.android.apps.fsremote;

import android.app.ListActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class SequenceActivity extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setTitle(getResources().getString(R.string.prefSequenceSettings));

		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());

		String[] menuItems = { 
				sp.getString("sequence1", "sequence"),
				sp.getString("sequence2", "sequence"),
				sp.getString("sequence3", "sequence"),
				sp.getString("sequence4", "sequence") ,
				sp.getString("sequence5", "sequence"),
				sp.getString("sequence6", "sequence"),
				sp.getString("sequence7", "sequence"),
				sp.getString("sequence8", "sequence") ,
				sp.getString("sequence9", "sequence"),
				sp.getString("sequence10", "sequence"),
				sp.getString("sequence11", "sequence"),
				sp.getString("sequence12", "sequence"),
				sp.getString("sequence13", "sequence"),
				sp.getString("sequence14", "sequence") ,
				sp.getString("sequence15", "sequence"),
				sp.getString("sequence16", "sequence"),
				sp.getString("sequence17", "sequence"),
				sp.getString("sequence18", "sequence") ,
				sp.getString("sequence19", "sequence"),
				sp.getString("sequence20", "sequence")
				};

		ArrayAdapter<String> aA = new ArrayAdapter<String>(this,
				R.layout.list_item, menuItems);
		setListAdapter(aA);

		ListView lv = getListView();
		lv.setTextFilterEnabled(true);

		lv.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
			NetworkComms.sendData( "seq"+(position+1),getBaseContext());
			}
		});
	}
}
