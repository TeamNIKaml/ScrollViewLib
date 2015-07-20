/**
 * @author Nikhil V
 *
 * Jun 25, 2015
 */
package com.teamnikaml.scrollviewlib.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
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

	private ScrollView scrollView;

	private Context context;
	
	private LinearLayout layout ;

	private TextView textView;
	

	
	
	


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
	public void init() {
		// TODO Auto-generated method stub
		if(scrollView == null)
		{
		scrollView = new ScrollView(context);
			
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

		TextViewHolder holder = new TextViewHolder();
			holder.textView = new TextView(context);
		
		//TextView view = new TextView(context);
		holder.textView.setId(id);
		holder.textView.setText(text);
		holder.textView.setTextColor(Color.BLACK);
		
	//	LinearLayout textlinearLayout = getLinearLayoutVertical();
	//	textlinearLayout.addView(holder.textView);
		
		layout.addView(holder.textView);

	}

	public void addTextView(String text, int id, float textsize, int textColor,
			int padding) {
		// TODO Auto-generated method stub

		TextViewHolder holder = new TextViewHolder();
			holder.textView = new TextView(context);
		holder.textView .setId(id);
		holder.textView .setText(text);
		holder.textView .setTextColor(textColor);
		holder.textView .setTextSize(textsize);
		holder.textView .setPadding(padding, padding, padding, padding);
		
		//LinearLayout textlinearLayout = getLinearLayoutVertical();
		//textlinearLayout.addView(holder.textView);
		layout.addView(holder.textView);

	}


	
	public void addImageView(Bitmap bitmap, int id) {
		// TODO Auto-generated method stub

	ImageViewHolder	holder = new ImageViewHolder();
			holder.imageView = new ImageView(context);
		holder.imageView.setId(id);
		holder.imageView.setImageBitmap(bitmap);
	//	LinearLayout imageLayout = getLinearLayoutVertical();
	//	imageLayout.addView(holder.imageView);
		layout.addView(holder.imageView);

	}

	public void addButton(String text, int id) {
		// TODO Auto-generated method stub

		ButtonViewHolder holder = new ButtonViewHolder();
		holder.button = new Button(context);
		holder.button.setId(id);
		holder.button.setText(text);
		layout.addView(holder.button);

	}

	public void addView(View view, int id) {
		view.setId(id);
		layout.addView(view);
	}
	
	public void addViewTop(View view, int id)
	{
		view.setId(id);
		layout.addView(view, 0);
	}
	
	
	public LinearLayout getLinearLayoutVertical()
	{
		LinearLayout layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.VERTICAL);
		layout.setMinimumWidth(LayoutParams.WRAP_CONTENT);
		layout.setMinimumHeight(LayoutParams.WRAP_CONTENT);
		
		return layout;
	}
	public LinearLayout getLinearLayoutHorizontal()
	{
		LinearLayout layout = new LinearLayout(context);
		layout.setOrientation(LinearLayout.HORIZONTAL);
		layout.setMinimumWidth(LayoutParams.WRAP_CONTENT);
		layout.setMinimumHeight(LayoutParams.WRAP_CONTENT);		
		return layout;
	}
	
	
	
	public void removeAllView()
	{
		if(scrollView!=null)
		scrollView.removeAllViews();
		layout = null;
		
		
		
	}
	
	private class TextViewHolder {
		private TextView textView;
		
		
	}
	
	private class ImageViewHolder {
		private ImageView imageView;
		
		
	}
	
	private class ButtonViewHolder {
		private Button button;
		
		
	}
	
	private int getTextViewId()
	{
		int count = scrollView.getChildCount();
		
		
		for(int i=0;i<0;i++)
		{
			Object o = scrollView.getChildAt(i);
			if(o instanceof TextView)
			{
				textView =(TextView) o;
				if(textView.getVisibility() == View.GONE)
				{
					
				}
			}
		}
		
		return 0;
	}

}
