package com.stwalkerster.android.apps.fsremote;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ConsoleActivity extends Activity {

	Editable last;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle(getResources().getString(R.string.consoleTitle));

		setContentView(R.layout.console);

		((Button) findViewById(R.id.ConsoleOne))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleTwo))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleThree))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleFour))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleFive))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleSix))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleSeven))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleEight))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleNine))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleZero))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsolePlus))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleMinus))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleSlash))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);
		((Button) findViewById(R.id.ConsoleAll))
				.setOnClickListener(mOnButtonConsoleSimpleClickListener);

		((Button) findViewById(R.id.ConsoleAt))
				.setOnClickListener(mOnButtonConsoleAtClickListener);

		((Button) findViewById(R.id.ConsoleCh))
				.setOnClickListener(mOnButtonConsoleChClickListener);

		((Button) findViewById(R.id.ConsoleSend))
				.setOnClickListener(mOnButtonConsoleSendClickListener);
		((Button) findViewById(R.id.ConsoleClear))
				.setOnClickListener(mOnButtonConsoleClearClickListener);
		((Button) findViewById(R.id.ConsoleRepeat))
		.setOnClickListener(mOnButtonConsoleRepeatClickListener);
	}

	private OnClickListener mOnButtonConsoleSimpleClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText) findViewById(R.id.ConsoleCommandLine);
			t.append(((Button) v).getText());
		}
	};

	private OnClickListener mOnButtonConsoleAtClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText) findViewById(R.id.ConsoleCommandLine);
			t.append(" @ ");
		}
	};
	private OnClickListener mOnButtonConsoleChClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText) findViewById(R.id.ConsoleCommandLine);
			t.append("ch ");
		}
	};
	private OnClickListener mOnButtonConsoleSendClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText) findViewById(R.id.ConsoleCommandLine);
			NetworkComms.sendData(t.getText(), getBaseContext());
			last = t.getText();
			t.setText("");
		}
	};
	private OnClickListener mOnButtonConsoleRepeatClickListener = new OnClickListener() {
		public void onClick(View v) {
			NetworkComms.sendData(last, getBaseContext());
		}
	};
	private OnClickListener mOnButtonConsoleClearClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText) findViewById(R.id.ConsoleCommandLine);
			t.setText("");
		}
	};


}
