package com.nikhil.scrollview;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.teamnikaml.scrollviewlib.model.MyHorizontalScrollView;
import com.teamnikaml.scrollviewlib.model.MyScrollView;

public class MainActivity extends Activity {

	private MyScrollView view;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);
		init();

		setContentView(view.getScrollView());

	}

	/**
	 * @author Nikhil V Jun 25, 2015
	 */
	private void init() {
		// TODO Auto-generated method stub

		view = new MyScrollView(getApplicationContext());

		view.addTextView("test", 1);
		view.addTextView("test1", 2);

		TextView textView = (TextView) view.getScrollView().findViewById(1);

		textView.setText("ola");

		Bitmap bmp = BitmapFactory.decodeResource(getResources(),
				R.drawable.bmw);

		view.addImageView(bmp, 3);

		bmp = BitmapFactory.decodeResource(getResources(), R.drawable.flat);

		view.addImageView(bmp, 4);
		bmp = BitmapFactory.decodeResource(getResources(), R.drawable.rabbit);

		view.addImageView(bmp, 5);
		
	/*	MyHorizontalScrollView horizontalScrollView = new MyHorizontalScrollView(getApplicationContext());
		horizontalScrollView.addButton("Test Button",1);
		horizontalScrollView.addTextView("test", 2);
		horizontalScrollView.addTextView("test", 3);
		 bmp = BitmapFactory.decodeResource(getResources(),
				R.drawable.bmw);

		horizontalScrollView.addImageView(bmp, 4);
		
		bmp = BitmapFactory.decodeResource(getResources(), R.drawable.rabbit);

		horizontalScrollView.addImageView(bmp, 5);
		
		
		view.addView(horizontalScrollView.getHorizontalScrollView(), 6);*/
		

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
