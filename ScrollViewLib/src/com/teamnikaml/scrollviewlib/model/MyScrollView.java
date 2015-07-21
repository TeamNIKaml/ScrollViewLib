/**
 * @author Nikhil V
 *
 * Jun 25, 2015
 */
package com.teamnikaml.scrollviewlib.model;

import com.teamnikaml.scrollviewlib.view.RecycleScrollView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * @author Nikhil V
 * 
 */
public class MyScrollView {

	private RecycleScrollView scrollView;

	private Context context;

	private LinearLayout layout;

	private TextView textView;

	public MyScrollView(Context context) {
		super();
		this.context = context;

		init();
	}

	public ScrollView getScrollView() {
		return scrollView;
	}

	/**
	 * @author Nikhil V Jun 25, 2015
	 */
	public void init() {
		// TODO Auto-generated method stub
		if (scrollView == null) {
			scrollView = new RecycleScrollView(context);

		}

		layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.setMinimumWidth(LayoutParams.WRAP_CONTENT);
		layout.setMinimumHeight(LayoutParams.WRAP_CONTENT);
		scrollView.setFillViewport(true);
		scrollView.addView(layout);

	}

	/**
	 * @author Nikhil V Jun 25, 2015
	 * @param text
	 * @param id
	 */
	public void addTextView(String text, int id) {
		// TODO Auto-generated method stub

		
		TextView textView = new TextView(context);

		
		textView.setId(id);
		textView.setText(text);
		textView.setTextColor(Color.BLACK);
		
		
		layout.addView(textView);

	}

	public void addTextView(String text, int id, float textsize, int textColor,
			int padding) {
		// TODO Auto-generated method stub

		
		TextView textView = new TextView(context);
		textView.setId(id);
		textView.setText(text);
		textView.setTextColor(textColor);
		textView.setTextSize(textsize);
		textView.setPadding(padding, padding, padding, padding);

		
		layout.addView(textView);

	}

	public void addImageView(Bitmap bitmap, int id) {
		// TODO Auto-generated method stub

		
		ImageView imageView = new ImageView(context);
		imageView.setId(id);
		imageView.setImageBitmap(bitmap);
		
		
		layout.addView(imageView);

	}

	public void addButton(String text, int id) {
		// TODO Auto-generated method stub

		
		Button button = new Button(context);
		button.setId(id);
		button.setText(text);
		
		layout.addView(button);
		
	}

	public void addView(View view, int id) {
		view.setId(id);
		
		layout.addView(view);
	
	}

	public void addViewTop(View view, int id) {
		view.setId(id);
	
		layout.addView(view, 0);
		
	}

	public LinearLayout getLinearLayoutVertical() {
		LinearLayout layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.setMinimumWidth(LayoutParams.WRAP_CONTENT);
		layout.setMinimumHeight(LayoutParams.WRAP_CONTENT);

		return layout;
	}

	public LinearLayout getLinearLayoutHorizontal() {
		LinearLayout layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.HORIZONTAL);
		layout.setMinimumWidth(LayoutParams.WRAP_CONTENT);
		layout.setMinimumHeight(LayoutParams.WRAP_CONTENT);
		return layout;
	}

	

	private FrameLayout getFrameLayout()
	{
		FrameLayout frameLayout = new FrameLayout(context);		
		frameLayout.setMinimumWidth(LayoutParams.WRAP_CONTENT);
		frameLayout.setMinimumHeight(LayoutParams.WRAP_CONTENT);
		return frameLayout;
	}
	

	private int getTextViewId() {
		int count = scrollView.getChildCount();

		for (int i = 0; i < 0; i++) {
			Object o = scrollView.getChildAt(i);
			if (o instanceof TextView) {
				textView = (TextView) o;
				if (textView.getVisibility() == View.GONE) {

				}
			}
		}

		return 0;
	}

}
