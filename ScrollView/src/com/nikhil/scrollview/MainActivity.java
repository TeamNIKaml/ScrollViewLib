package com.nikhil.scrollview;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.LinearLayout.LayoutParams;

import com.nikhil.bitmaploading.displayingbitmaps.ui.RecyclingImageView;
import com.teamnikaml.scrollviewlib.model.MyHorizontalScrollView;
import com.teamnikaml.scrollviewlib.model.MyScrollView;

public class MainActivity extends Activity {

	private MyScrollView view;
	private int id = 0;
	private MyHorizontalScrollView horizontalScrollView ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_main);
		init();
		setContentView(view.getScrollView());

		// setContentView(R.layout.activity_main);

	}

	/**
	 * @author Nikhil V Jun 25, 2015
	 */
	private void init() {
		// TODO Auto-generated method stub
		/*
		 * view = new MyScrollView(getApplicationContext());
		 * 
		 * setData(); setData(); setHorizontalData();
		 */
		view = new MyScrollView(getApplicationContext());
		// setFragment();
		setData();

		/*
		 * MyHorizontalScrollView horizontalScrollView = new
		 * MyHorizontalScrollView(getApplicationContext());
		 * horizontalScrollView.addButton("Test Button",1);
		 * horizontalScrollView.addTextView("test", 2);
		 * horizontalScrollView.addTextView("test", 3); bmp =
		 * BitmapFactory.decodeResource(getResources(), R.drawable.bmw);
		 * 
		 * horizontalScrollView.addImageView(bmp, 4);
		 * 
		 * bmp = BitmapFactory.decodeResource(getResources(),
		 * R.drawable.rabbit);
		 * 
		 * horizontalScrollView.addImageView(bmp, 5);
		 * 
		 * 
		 * view.addView(horizontalScrollView.getHorizontalScrollView(), 6);
		 */

	}

	/**
	 * @author Nikhil V Jul 22, 2015
	 */
	/*private void setFragment() {
		// TODO Auto-generated method stub
		ScrollviewFragment fragment = new ScrollviewFragment(this);
		view = fragment.getScrollView();
		getFragmentManager().beginTransaction()
				.replace(R.id.frame_container, fragment).commit();

	}*/

	/**
	 * @author Nikhil V Jul 21, 2015
	 */
	private void setData() {
		// TODO Auto-generated method stub

		// setverticalData();
		setHorizontalData();
		addFrameLayout();

	}

	/*private void setverticalData() {
		view.addTextView("test", id++);
		view.addTextView("test1", id++);

		TextView textView = (TextView) view.getScrollView().findViewById(1);

		textView.setText("ola");

		view.addImageView(R.drawable.bmw, id++);
		view.addImageView(R.drawable.flat, id++);
		view.addImageView(R.drawable.rabbit, id++);
	}
*/
	private void addFrameLayout() {
		
		
		
		View tempview = LayoutInflater.from(getApplicationContext()).inflate(
				R.layout.fragment_container, null);

		//tempview.setId(++id);

		view.addView(tempview, R.id.container);
		
	
		
	
		
	
		
		//Fragment fragment = new Bmwfragment();
		
		
		
		

	}

	
	
		
	

	private void setHorizontalData() {
		int hid = 1;

		int[] drawable = { R.drawable.bmw, R.drawable.rabbit, R.drawable.flat };

	

		horizontalScrollView = new MyHorizontalScrollView(
				getApplicationContext());
		// horizontalScrollView.addButton("Test Button",id++);
		 //horizontalScrollView.addTextView("test", id++);
		 //horizontalScrollView.addTextView("test", id++);
		 ImageView imageView;
			ImageClickListner clickListner = new ImageClickListner();
		 
		for (int i = 0; i < drawable.length; i++,hid++) {
			horizontalScrollView.addImageView(drawable[i], hid);
			imageView = (ImageView) horizontalScrollView
					.getHorizontalScrollView().findViewById(hid);
			imageView.setOnClickListener(clickListner);
		}

		// horizontalScrollView.addImageView(R.drawable.rabbit, hid++);

		// horizontalScrollView.addImageView(R.drawable.flat, hid++);

		view.addView(horizontalScrollView.getHorizontalScrollView(), ++id);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	private class ImageClickListner implements OnClickListener {

		/*
		 * @author Nikhil V Jul 27, 2015 (non-Javadoc)
		 * 
		 * @see android.view.View.OnClickListener#onClick(android.view.View)
		 */

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int id = v.getId();
			Fragment fragment = null;
			switch (id) {
			case 1:
				fragment = new Bmwfragment();
				break;
			case 2:
				fragment = new RabbitFragment();
				break;
			case 3:
				fragment = new FlatFragment();
				break;

			}
		View	tempview = view.getScrollView().findViewById( R.id.container);
		
		getFragmentManager().beginTransaction().replace(tempview.getId(), fragment).commit();
		

		}

		

	}

	private class Bmwfragment extends Fragment {
		private View bmwView;
		private ImageView imageView;

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			bmwView = inflater.inflate(R.layout.fragment_view, null);
			init();
			return bmwView;
		}

		/**
		 * @author Nikhil V Jul 27, 2015
		 * @param view2
		 */
		private void init() {
			// TODO Auto-generated method stub
			imageView = (ImageView) bmwView.findViewById(R.id.imageView1);

			Bitmap bmp = BitmapFactory.decodeResource(getResources(),
					R.drawable.bmw);

			imageView.setImageBitmap(bmp);

			//bmp.recycle();
		}

	}

	private class RabbitFragment extends Fragment {
		private View view;
		private ImageView imageView;

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			view = inflater.inflate(R.layout.fragment_view, null);
			init(view);
			return view;
		}

		/**
		 * @author Nikhil V Jul 27, 2015
		 * @param view2
		 */
		private void init(View view2) {
			// TODO Auto-generated method stub
			imageView = (ImageView) view.findViewById(R.id.imageView1);

			Bitmap bmp = BitmapFactory.decodeResource(getResources(),
					R.drawable.rabbit);

			imageView.setImageBitmap(bmp);

			//bmp.recycle();
		}
	}

	private class FlatFragment extends Fragment {
		private View view;
		private ImageView imageView;

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stubview.
			view = inflater.inflate(R.layout.fragment_view, null);
			init(view);
			return view;
		}

		/**
		 * @author Nikhil V Jul 27, 2015
		 * @param view2
		 */
		private void init(View view2) {
			// TODO Auto-generated method stub
			imageView = (ImageView) view.findViewById(R.id.imageView1);

			Bitmap bmp = BitmapFactory.decodeResource(getResources(),
					R.drawable.flat);

			imageView.setImageBitmap(bmp);

			//bmp.recycle();
		}

	}

}
