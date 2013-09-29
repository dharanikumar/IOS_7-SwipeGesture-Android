package com.dharani.swipegesture;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class SwipeActivity extends Activity  {

	private ListView cmn_list_view;
	private ListAdapter listAdapter;
	private ArrayList<dumpclass> listdata;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_swipe);
		cmn_list_view	=	(ListView) findViewById(R.id.cmn_list_view);
		listdata		=	new ArrayList<dumpclass>();
		InitializeValues();
		final ListViewSwipeGesture touchListener = new ListViewSwipeGesture(
				cmn_list_view, swipeListener, this);
		touchListener.SwipeType	=	ListViewSwipeGesture.Double;    //Set two options at background of list item
		
		cmn_list_view.setOnTouchListener(touchListener);
		
		
	}

	private void InitializeValues() {
		// TODO Auto-generated method stub
		listdata.add(new dumpclass("one"));
		listdata.add(new dumpclass("two"));
		listdata.add(new dumpclass("three"));
		listdata.add(new dumpclass("four"));
		listdata.add(new dumpclass("five"));
		listdata.add(new dumpclass("six"));
		listdata.add(new dumpclass("seven"));
		listdata.add(new dumpclass("Eight"));
		listAdapter		=	new ListAdapter(this, listdata);
		cmn_list_view.setAdapter(listAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.swipe, menu);
		return true;
	}
	
	ListViewSwipeGesture.TouchCallbacks swipeListener = new ListViewSwipeGesture.TouchCallbacks() {

		@Override
		public void FullSwipeListView(int position) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(),"Action_2", Toast.LENGTH_SHORT).show();
		}

		@Override
		public void HalfSwipeListView(int position) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(),"Action_1", Toast.LENGTH_SHORT).show();
		}

		@Override
		public void LoadDataForScroll(int count) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onDismiss(ListView listView, int[] reverseSortedPositions) {
			// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(),"Delete", Toast.LENGTH_SHORT).show();
			for(int i:reverseSortedPositions){
				listdata.remove(i);
				listAdapter.notifyDataSetChanged();
			}
		}

		@Override
		public void OnClickListView(int position) {
			// TODO Auto-generated method stub
			startActivity(new Intent(getApplicationContext(),TestActivity.class));
		}
		
	};
	
}
