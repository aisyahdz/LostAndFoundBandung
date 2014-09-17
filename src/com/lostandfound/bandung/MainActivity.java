package com.lostandfound.bandung;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
	private ScrollView scrollView;
	private LinearLayout scrollViewChild;
	private ArrayList<TextView> listText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		scrollView = (ScrollView) findViewById(R.id.scrollView1);
		scrollViewChild = (LinearLayout) findViewById(R.id.scrollViewChild);
		listText = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			TextView text = new TextView(this);
			text.setText("Test Textview No."+i);
			listText.add(text);
			scrollViewChild.addView(text);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
