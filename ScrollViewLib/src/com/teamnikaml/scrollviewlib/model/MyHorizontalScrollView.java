/**
 * @author Nikhil V
 *
 * Jun 25, 2015
 */
package com.teamnikaml.scrollviewlib.model;

import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author Nikhil V
 *
 */
public class MyHorizontalScrollView {

	private  Context context;
	private HorizontalScrollView horizontalScrollView;
	private LinearLayout layout;
	
	private static MyHorizontalScrollView myHorizontalScrollView;
	
	public static MyHorizontalScrollView getMyHorizontalScrollView()
	{
		if(myHorizontalScrollView == null)
			myHorizontalScrollView =new MyHorizontalScrollView();
		return myHorizontalScrollView;
	}
	
	private MyHorizontalScrollView()
	{
		
	}
	
	
	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	public HorizontalScrollView getHorizontalScrollView() {
		return horizontalScrollView;
	}
	public void setHorizontalScrollView(HorizontalScrollView horizontalScrollView) {
		this.horizontalScrollView = horizontalScrollView;
	}
	public MyHorizontalScrollView(Context context) {
		super();
		this.context = context;
		init();
	}
	/**
	@author Nikhil V
	Jun 25, 2015
	 */
	private void init() {
		// TODO Auto-generated method stub
		horizontalScrollView = new HorizontalScrollView(context);
		layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.HORIZONTAL);
		layout.setMinimumWidth(LayoutParams.WRAP_CONTENT);
		layout.setMinimumHeight(LayoutParams.WRAP_CONTENT);
		horizontalScrollView.addView(layout);
		
		
	}
	
	
	public void addTextView(String text, int id) {
		// TODO Auto-generated method stub

		TextView view = new TextView(context);
		view.setId(id);
		view.setText(text);
		view.setTextColor(Color.BLACK);
		layout.addView(view);

	}
	
	public void addTextView(String text, int id,float textsize,int textColor,int padding) {
		// TODO Auto-generated method stub

		TextView view = new TextView(context);
		view.setId(id);
		view.setText(text);
		view.setTextColor(textColor);
		view.setTextSize(textsize);
		view.setPadding(padding,padding,padding,padding);
		layout.addView(view);

	}
	
	
	
	
	
	
	
	
	public void addImageView(Bitmap bitmap, int id) {
		// TODO Auto-generated method stub

		ImageView view = new ImageView(context);
		view.setId(id);
		view.setImageBitmap(bitmap);
		layout.addView(view);

	}
	
	public void addButton(String text, int id) {
		// TODO Auto-generated method stub

		Button view = new Button(context);
		view.setId(id);
		view.setText(text);
		layout.addView(view);

	}
	
	public void addView(View view, int id)
	{
		view.setId(id);
		layout.addView(view);
	}
	
	
	
	
}
