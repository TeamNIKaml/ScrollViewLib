/**
 * @author Nikhil V
 *
 * Jun 25, 2015
 */
package com.teamNikaml.scrollviewlib.model;

import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * @author Nikhil V
 * 
 */
public class MyScrollView {

	private ScrollView scrollView;

	private Context context;

	private LinearLayout layout;

	public MyScrollView(Context context) {
		super();
		this.context = context;

		init();
	}

	public ScrollView getScrollView() {
		return scrollView;
	}

	public void setScrollView(ScrollView scrollView) {
		this.scrollView = scrollView;
	}

	/**
	 * @author Nikhil V Jun 25, 2015
	 */
	private void init() {
		// TODO Auto-generated method stub
		scrollView = new ScrollView(context);
		layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.setMinimumWidth(LayoutParams.WRAP_CONTENT);
		layout.setMinimumHeight(LayoutParams.WRAP_CONTENT);
		scrollView.addView(layout);
	}

	/**
	 * @author Nikhil V Jun 25, 2015
	 * @param text
	 * @param id 
	 */
	public void addTextView(String text, int id) {
		// TODO Auto-generated method stub

		TextView view = new TextView(context);
		view.setId(id);
		view.setText(text);
		view.setTextColor(Color.BLACK);
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

}
