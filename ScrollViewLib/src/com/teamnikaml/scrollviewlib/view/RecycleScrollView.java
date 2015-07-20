/**
 * @author Nikhil V
 *
 * Jul 20, 2015
 */
package com.teamnikaml.scrollviewlib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

/**
 * @author Nikhil V
 *
 */
public class RecycleScrollView extends ScrollView{
	
	
	private  int viewCount = 0;

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
		viewCount++;
		System.out.println("view count"+viewCount);
		super.addView(child);
	}

	@Override
	public void addView(View child, int index) {
		// TODO Auto-generated method stub
		viewCount++;
		System.out.println("view count"+viewCount);
		super.addView(child, index);
	}

	@Override
	public void addView(View child, android.view.ViewGroup.LayoutParams params) {
		// TODO Auto-generated method stub
		viewCount++;
		System.out.println("view count"+viewCount);
		super.addView(child, params);
	}

	@Override
	public void addView(View child, int index,
			android.view.ViewGroup.LayoutParams params) {
		// TODO Auto-generated method stub
		viewCount++;
		System.out.println("view count"+viewCount);
		super.addView(child, index, params);
	}

	@Override
	public void addView(View child, int width, int height) {
		// TODO Auto-generated method stub
		viewCount++;
		System.out.println("view count"+viewCount);
		super.addView(child, width, height);
	}

	
	
	
	
	

}
