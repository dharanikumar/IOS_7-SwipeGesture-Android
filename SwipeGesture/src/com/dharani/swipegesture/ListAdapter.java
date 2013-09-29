package com.dharani.swipegesture;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter{
	private Activity activity;
	private ArrayList<dumpclass> data;
	public ListAdapter(Activity a, ArrayList<dumpclass> basicList){
		activity	=	a;
		data		=	basicList;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder;
        if(convertView == null)
        {holder				=	new ViewHolder();
		 convertView		=	LayoutInflater.from(activity).inflate(R.layout.test_layout, null);
		 holder.text		=	(TextView) convertView.findViewById(R.id.mem_info_txt_id);
		 holder.image		=	(ImageView) convertView.findViewById(R.id.mem_photo_img_id);
		 convertView.setTag(holder);
        }else
        	holder			=	(ViewHolder) convertView.getTag();
        
        holder.text.setText(data.get(position).sampletext);
        
        
        return convertView;
	}

	
	public static class ViewHolder{
		TextView text;
		ImageView image;
		
	}
}
