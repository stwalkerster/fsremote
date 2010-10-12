package com.stwalkerster.android.apps.fsremote;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ConsoleActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.console);

		Button b;

		b = (Button) findViewById(R.id.ConsoleOne);
		b.setOnClickListener(mOnButtonConsoleOneClickListener);
		b = (Button) findViewById(R.id.ConsoleTwo);
		b.setOnClickListener(mOnButtonConsoleTwoClickListener);
		b = (Button) findViewById(R.id.ConsoleThree);
		b.setOnClickListener(mOnButtonConsoleThreeClickListener);
		b = (Button) findViewById(R.id.ConsoleFour);
		b.setOnClickListener(mOnButtonConsoleFourClickListener);
		b = (Button) findViewById(R.id.ConsoleFive);
		b.setOnClickListener(mOnButtonConsoleFiveClickListener);
		b = (Button) findViewById(R.id.ConsoleSix);
		b.setOnClickListener(mOnButtonConsoleSixClickListener);
		b = (Button) findViewById(R.id.ConsoleSeven);
		b.setOnClickListener(mOnButtonConsoleSevenClickListener);
		b = (Button) findViewById(R.id.ConsoleEight);
		b.setOnClickListener(mOnButtonConsoleEightClickListener);
		b = (Button) findViewById(R.id.ConsoleNine);
		b.setOnClickListener(mOnButtonConsoleNineClickListener);
		b = (Button) findViewById(R.id.ConsoleZero);
		b.setOnClickListener(mOnButtonConsoleZeroClickListener);
		b = (Button) findViewById(R.id.ConsolePlus);
		b.setOnClickListener(mOnButtonConsolePlusClickListener);
		b = (Button) findViewById(R.id.ConsoleMinus);
		b.setOnClickListener(mOnButtonConsoleMinusClickListener);
		b = (Button) findViewById(R.id.ConsoleSlash);
		b.setOnClickListener(mOnButtonConsoleSlashClickListener);
		b = (Button) findViewById(R.id.ConsoleAt);
		b.setOnClickListener(mOnButtonConsoleAtClickListener);
		b = (Button) findViewById(R.id.ConsoleCh);
		b.setOnClickListener(mOnButtonConsoleChClickListener);
		b = (Button) findViewById(R.id.ConsoleAll);
		b.setOnClickListener(mOnButtonConsoleAllClickListener);
		b = (Button) findViewById(R.id.ConsoleSend);
		b.setOnClickListener(mOnButtonConsoleSendClickListener);
		b = (Button) findViewById(R.id.ConsoleClear);
		b.setOnClickListener(mOnButtonConsoleClearClickListener);
	}

	private OnClickListener mOnButtonConsoleOneClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("1");
		}
	};
	private OnClickListener mOnButtonConsoleTwoClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("2");
		}
	};
	private OnClickListener mOnButtonConsoleThreeClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("3");
		}
	};
	private OnClickListener mOnButtonConsoleFourClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("4");
		}
	};
	private OnClickListener mOnButtonConsoleFiveClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("5");
		}
	};
	private OnClickListener mOnButtonConsoleSixClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("6");
		}
	};
	private OnClickListener mOnButtonConsoleSevenClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("7");
		}
	};
	private OnClickListener mOnButtonConsoleEightClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("8");
		}
	};
	private OnClickListener mOnButtonConsoleNineClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("9");
		}
	};
	private OnClickListener mOnButtonConsoleZeroClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("0");
		}
	};
	private OnClickListener mOnButtonConsolePlusClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("+");
		}
	};
	private OnClickListener mOnButtonConsoleMinusClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("-");
		}
	};
	private OnClickListener mOnButtonConsoleSlashClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("/");
		}
	};
	private OnClickListener mOnButtonConsoleAtClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append(" @ ");
		}
	};
	private OnClickListener mOnButtonConsoleChClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("ch ");
		}
	};
	private OnClickListener mOnButtonConsoleAllClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.append("all");
		}
	};
	private OnClickListener mOnButtonConsoleSendClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			sendData(t.getText());
			t.setText("");
		}
	};
	private OnClickListener mOnButtonConsoleClearClickListener = new OnClickListener() {
		public void onClick(View v) {
			EditText t = (EditText)findViewById(R.id.ConsoleCommandLine);
			t.setText("");
		}
	};

	private void sendData(CharSequence data) 
	{
		Socket sock;
		PrintWriter out;
		try {
			sock = new Socket("192.168.1.7", 3000);
			out = new PrintWriter(sock.getOutputStream());
			out.println(data);
//			Thread.sleep(1000);
			out.close();
			sock.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("Unknown host", e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("IO error", e);
		}
	}
}
