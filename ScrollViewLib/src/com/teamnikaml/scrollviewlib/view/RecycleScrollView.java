/**
 * @author Nikhil V
 *
 * Jul 20, 2015
 */
package com.teamnikaml.scrollviewlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * @author Nikhil V
 *
 */
public class RecycleScrollView extends ScrollView{
	
	
	

	public RecycleScrollView(Context context, AttributeSet attrs, int defStyleAttr,
			int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
		// TODO Auto-generated constructor stub
	}

	public RecycleScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		// TODO Auto-generated constructor stub
	}

	public RecycleScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public RecycleScrollView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addView(View child) {
		// TODO Auto-generated method stub
		/*View recycledView = (View) getRecycledchild(child);
		if(recycledView==null)*/
		super.addView(child);
		
			
	}

	@Override
	public void addView(View child, int index) {
		// TODO Auto-generated method stub
		/*View recycledView = (View) getRecycledchild(child);
		if(recycledView==null)*/
		super.addView(child, index);
	}

	@Override
	public void addView(View child, android.view.ViewGroup.LayoutParams params) {
		// TODO Auto-generated method stub
	/*	View recycledView = (View) getRecycledchild(child);
		if(recycledView==null)*/
		super.addView(child, params);
	}

	@Override
	public void addView(View child, int index,
			android.view.ViewGroup.LayoutParams params) {
		// TODO Auto-generated method stub
		/*View recycledView = (View) getRecycledchild(child);
		if(recycledView==null)*/
		super.addView(child, index, params);
	}

	@Override
	public void addView(View child, int width, int height) {
		// TODO Auto-generated method stub
		/*View recycledView = (View) getRecycledchild(child);
		if(recycledView==null)*/
		super.addView(child, width, height);
	}

	
	/*private Object getRecycledchild(View parent)
	{
		int count = getChildCount();
		Object object = ((ViewGroup) parent).getChildAt(0) ;
		if(parent instanceof FrameLayout)
		{
			if( object instanceof ImageView )
			{
				object = getImageview();
				if(object!=null)
				{
					return object;
				}
			}
			
			else if( object instanceof TextView )
			{
				object = getTextView();
				if(object!=null)
				{
					return object;
				}
			}
			
			else if( object instanceof Button )
			{
				object = getButton();
				if(object!=null)
				{
					return object;
				}
			}
			else
			{
				object = getView(((ViewGroup) parent).getChildAt(0));
				if(object!=null)
				{
					return object;
				}
			}
			
			
			
			
			
			
		}		
		return null;
	}

	*//**
	@author Nikhil V
	Jul 20, 2015
	 * @param object
	 * @return
	 *//*
	private Object getView(View child) {
		// TODO Auto-generated method stub
		
	
		for(int i=0;i<getChildCount();i++)
		{
			if(child.getClass().getName().equalsIgnoreCase(getChildAt(i).getClass().getName()))
			{
				child = (View) getChildAt(i);
				if(child.getVisibility() != View.VISIBLE)
				return child;
			}
		}
		
		
		return null;
	}

	*//**
	@author Nikhil V
	Jul 20, 2015
	 * @return
	 *//*
	private Object getButton() {
		// TODO Auto-generated method stub
		Button button;
		
		for(int i=0;i<getChildCount();i++)
		{
			if(getChildAt(i) instanceof Button)
			{
				button = (Button) getChildAt(i);
				if(button.getVisibility() != View.VISIBLE)
				return button;
			}
		}
		
		
		return null;
	}

	*//**
	@author Nikhil V
	Jul 20, 2015
	 * @return
	 *//*
	private Object getTextView() {
		// TODO Auto-generated method stub
		
		
		TextView textView;
		
		for(int i=0;i<getChildCount();i++)
		{
			if(getChildAt(i) instanceof TextView)
			{
				textView = (TextView) getChildAt(i);
				if(textView.getVisibility() != View.VISIBLE)
				return textView;
			}
		}
		
		return null;
	}

	*//**
	@author Nikhil V
	Jul 20, 2015
	 * @return
	 *//*
	private Object getImageview() {
		// TODO Auto-generated method stub
		
		ImageView imageView;
		
		for(int i=0;i<getChildCount();i++)
		{
			if(getChildAt(i) instanceof ImageView)
			{
				imageView = (ImageView) getChildAt(i);
				if(imageView.getVisibility() != View.VISIBLE)
				return imageView;
			}
		}
		
		return null;
	}*/
	
	
	

}
