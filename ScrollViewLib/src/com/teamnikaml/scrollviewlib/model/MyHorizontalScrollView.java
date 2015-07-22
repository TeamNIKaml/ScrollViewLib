/**
 * @author Nikhil V
 *
 * Jun 25, 2015
 */
package com.teamnikaml.scrollviewlib.model;

import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nikhil.bitmaploading.displayingbitmaps.ui.RecyclingImageView;
import com.nikhil.bitmaploading.displayingbitmaps.util.ImageFetcher;
import com.nikhil.bitmaploading.displayingbitmaps.util.ImageResizer;

/**
 * @author Nikhil V
 *
 */
public class MyHorizontalScrollView {

	
	private HorizontalScrollView horizontalScrollView;
	private LinearLayout layout;
	private Context context;
	private int width;
	private int height;

	public HorizontalScrollView getHorizontalScrollView() {
		return horizontalScrollView;
	}
/*	public void setHorizontalScrollView(HorizontalScrollView horizontalScrollView) {
		this.horizontalScrollView = horizontalScrollView;
	}*/
	public MyHorizontalScrollView(Context context) {
		super();
		this.context = context;
		init();
	}
	/**
	@author Nikhil V
	Jun 25, 2015
	 */
	public void init() {
		// TODO Auto-generated method stub
	//	if(horizontalScrollView == null)
		horizontalScrollView = new HorizontalScrollView(context);
		layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.HORIZONTAL);
		layout.setMinimumWidth(LayoutParams.WRAP_CONTENT);
		layout.setMinimumHeight(LayoutParams.WRAP_CONTENT);
		horizontalScrollView.addView(layout);
		
		getScreenDimension();
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

		RecyclingImageView imageView = new RecyclingImageView(context);
		imageView.setId(id);
		ImageFetcher mImageFetcher = new ImageFetcher(context, width, height);
		mImageFetcher.loadImage(url, imageView);
		layout.addView(imageView);

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
