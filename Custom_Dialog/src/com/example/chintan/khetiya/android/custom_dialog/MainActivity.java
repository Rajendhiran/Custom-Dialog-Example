package com.example.chintan.khetiya.android.custom_dialog;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button call_ws;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);

    }

    public void Call_My_Blog(View v) {
	Intent intent = new Intent(MainActivity.this, My_Blog.class);
	startActivity(intent);

    }

    public void Show_Dialog(View v) {
	CustomDialogClass cdd = new CustomDialogClass(MainActivity.this);
	cdd.show();
    }

    public boolean isNetworkAvailable() {
	ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
	NetworkInfo networkInfo = cm.getActiveNetworkInfo();
	// if no network is available networkInfo will be null
	// otherwise check if we are connected
	if (networkInfo != null && networkInfo.isConnected()) {
	    return true;
	}
	return false;
    }

}
