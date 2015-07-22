/**
 * @author Nikhil V
 *
 * Jul 22, 2015
 */
package com.nikhil.scrollview;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.teamnikaml.scrollviewlib.model.MyScrollView;

/**
 * @author Nikhil V
 *
 */
public class ScrollviewFragment extends Fragment {


	private MyScrollView scrollView;
	
	public ScrollviewFragment(Context context)
	{
		scrollView = new MyScrollView(context);
	}
	
	public  MyScrollView getScrollView()
	{
		return scrollView;
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		return scrollView.getScrollView();
	}

}
