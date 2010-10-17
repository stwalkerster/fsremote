package com.stwalkerster.android.apps.fsremote;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

public class NetworkComms {
	public static void sendData(CharSequence data, Context ctx) {
		Socket sock;
		PrintWriter out;
		
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(ctx);
		
		String ip = sp.getString("configServerIp", "192.168.1.1");
		int port = Integer.parseInt(sp.getString("configServerPort", "3000")) ;
			
		try {
			sock = new Socket(ip,port);
			out = new PrintWriter(sock.getOutputStream());
			out.println(data);
			out.close();
			sock.close();
		} catch (UnknownHostException e) {
			Toast.makeText(ctx, e.getMessage(), Toast.LENGTH_SHORT).show();
		} catch (IOException e) {
			Toast.makeText(ctx, e.getMessage(), Toast.LENGTH_SHORT).show();
		}
	}
}
