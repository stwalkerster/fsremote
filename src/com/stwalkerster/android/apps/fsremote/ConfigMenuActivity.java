package com.stwalkerster.android.apps.fsremote;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class ConfigMenuActivity extends PreferenceActivity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setTitle(getResources().getString(R.string.configTitle));	
		addPreferencesFromResource(R.xml.prefs);
	}

}
