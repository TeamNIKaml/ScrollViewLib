/**
 * @author Nikhil V
 *
 * Jul 20, 2015
 */
package com.teamnikaml.scrollviewlib.view;

import android.content.Context;
import android.graphics.Point;
import android.opengl.Visibility;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @author Nikhil V
 *
 */
public class RecycleLayout extends LinearLayout{



	public RecycleLayout(Context context, AttributeSet attrs, int defStyleAttr,
			int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
		// TODO Auto-generated constructor stub
	}

	public RecycleLayout(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	public RecycleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public RecycleLayout(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void addView(View child) {
		// TODO Auto-generated method stub
		
	
		
				
		
		//View recycleView = (View) recycledView(child);		
	//	if(recycleView == null)		
		super.addView(child);
		//else
		//	recycleView = child;
		
		
		
			
	}

	@Override
	public void addView(View child, int index) {
		// TODO Auto-generated method stub
		
		
		
		//View recycleView = (View) recycledView(child);		
		//if(recycleView == null)		
			super.addView(child, index);
	//	else
		//	recycleView = child;
		
		
		
		
	}

	@Override
	public void addView(View child, int width, int height) {
		// TODO Auto-generated method stub
	
		
		//View recycleView = (View) recycledView(child);		
		//if(recycleView == null)		
			super.addView(child, width, height);
	//	else
		//	recycleView = child;
		
		
	}

	
	private Object recycledView(View child)
	{
	
		Log.e("child count :",String.valueOf(getChildCount()));
		
	
	
	
		
			if( child instanceof ImageView )
			{
				
				if(child!=null)
				{
						return getImageview();
				}
			}
			
			else if( child instanceof TextView )
			{
				
				if(child!=null)
				{
					return getTextView();
				}
			}
			
			else if( child instanceof Button )
			{
				
				if(child!=null)
				{
					return getButton() ;
				}
			}
			else
			{
			return null;
				
			}
			return null;
		
	}
	
	
	private Object getView(View child) {
		// TODO Auto-generated method stub
		
	
		for(int i=0;i<getChildCount();i++)
		{
			if(child.getClass().getName().equalsIgnoreCase(getChildAt(i).getClass().getName()))
			{
				child = (View) getChildAt(i);
				
				if(child.getVisibility() != View.VISIBLE)
				{
					Log.e("viewt :",String.valueOf(getChildCount()));
					return child;
				}
					
				
			}
		}
		
		
		return null;
	}

	
	private Object getButton() {
		// TODO Auto-generated method stub
		Button button;
		
		for(int i=0;i<getChildCount();i++)
		{
			if(getChildAt(i) instanceof Button)
			{
				button = (Button) getChildAt(i);
				Log.e("Button Visibility :",String.valueOf(button.getVisibility()));
				
				if(button.getVisibility() != View.VISIBLE)
				{
					Log.e("Button recycle :","true");
					return button;
				}
			}
		}
		
	//	Log.e("Button recycle :","false");
		return null;
	}


	private Object getTextView() {
		// TODO Auto-generated method stub
		
		
		TextView textView;
		
		
		for(int i=0;i<getChildCount();i++)
		{
			if(getChildAt(i) instanceof TextView)
			{
				textView = (TextView) getChildAt(i);
				Log.e("textView visibility :",String.valueOf(textView.getVisibility()));
				//Log.e("View visibility :",String.valueOf(View.VISIBLE));
			
				if(textView.getVisibility() != View.VISIBLE)
				{
					Log.e("textView recycle :","true");
					return textView;
				}
			}
			
		}
	//	Log.e("textView recycle :","false");
		return null;
	}

	
	private Object getImageview() {
		// TODO Auto-generated method stub
		
		ImageView imageView;
		
		for(int i=0;i<getChildCount();i++)
		{
			if(getChildAt(i) instanceof ImageView)
			{
				imageView = (ImageView) getChildAt(i);
				Log.e("imageView inside visibility :",String.valueOf(imageView.getVisibility()));
				if(imageView.getVisibility() != View.VISIBLE)
				{
					Log.e("imageView recycle :","true");
					return imageView;
				}
			}
		}
		//Log.e("imageView recycle :","false");
		
		return null;
	}
	
	


}
