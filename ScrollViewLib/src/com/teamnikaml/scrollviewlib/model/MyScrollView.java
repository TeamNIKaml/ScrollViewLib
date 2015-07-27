/**
 * @author Nikhil V
 *
 * Jun 25, 2015
 */
package com.teamnikaml.scrollviewlib.model;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import android.widget.TextView;

import com.nikhil.bitmaploading.displayingbitmaps.ui.RecyclingImageView;
import com.nikhil.bitmaploading.displayingbitmaps.util.ImageFetcher;
import com.nikhil.bitmaploading.displayingbitmaps.util.ImageResizer;

/**
 * @author Nikhil V
 * 
 */
public class MyScrollView {

	private ScrollView scrollView;

	private Context context;

	private LinearLayout layout;

	private int width;

	private int height;

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
		
			scrollView = new ScrollView(context);

		
		layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.setMinimumWidth(LayoutParams.WRAP_CONTENT);
		layout.setMinimumHeight(LayoutParams.WRAP_CONTENT);
		scrollView.setFillViewport(true);
		scrollView.addView(layout);
		getScreenDimension();

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

	public void addImageView(int resource, int id) {
		// TODO Auto-generated method stub

		RecyclingImageView imageView = new RecyclingImageView(context);
		imageView.setId(id);
		ImageResizer mImageFetcher = new ImageResizer(context, width, height);
		mImageFetcher.loadImage(resource, imageView);
		layout.addView(imageView);

	}

	public void addImageView(String url, int id) {
		// TODO Auto-generated method stub

		/*
		 * ImageView imageView = new ImageView(context); imageView.setId(id);
		 * imageView.setImageBitmap(bitmap);
		 */

		RecyclingImageView imageView = new RecyclingImageView(context);
		imageView.setId(id);
		ImageFetcher mImageFetcher = new ImageFetcher(context, width, height);
		mImageFetcher.loadImage(url, imageView);

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

	public FrameLayout getFrameLayout() {
		FrameLayout frameLayout = new FrameLayout(context);
		frameLayout.setMinimumWidth(LayoutParams.WRAP_CONTENT);
		frameLayout.setMinimumHeight(LayoutParams.WRAP_CONTENT);
		return frameLayout;
	}

	private int getScreenDimension() {

		WindowManager wm = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE);
		Display display = wm.getDefaultDisplay();
		Point size = new Point();
		display.getSize(size);
		width = size.x;
		height = size.y;

		return 0;
	}

}
