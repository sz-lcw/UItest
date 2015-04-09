package com.array_adapter;

import java.util.List;

import com.data.User;
import com.example.uitest.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class UserAdaptor extends ArrayAdapter<User> {

	private int resourceId; 
	public UserAdaptor(Context context, int textViewResourceId, List<User> objects){
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
		
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		User user = getItem(position);//获取当前先的User实例
		View view;
		ViewHolder viewHolder;
		if(convertView == null){
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder = new ViewHolder();
			viewHolder.userName = (TextView) view.findViewById(R.id.user_name);
			viewHolder.email = (TextView) view.findViewById(R.id.email);
			viewHolder.school = (TextView) view.findViewById(R.id.school);
			viewHolder.type = (TextView) view.findViewById(R.id.type);
			view.setTag(viewHolder);	//将ViewHolder存储在View中
		}else {
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();	//重新获取ViewHolder
		}
		viewHolder.userName.setText(user.getName());
		viewHolder.email.setText(user.getEmail());
		viewHolder.school.setText(user.getSchool());
		switch (user.getType()){
		case User.TYPE_ADMIN:
			viewHolder.type.setText("admin");
			break;
		case User.TYPE_COMMON:
			viewHolder.type.setText("common user");
			break;
		case User.TYPE_PUBLISH:
			viewHolder.type.setText("publisher");
			break;
		default:
			break;
		}
		
		
		return view;
	}
}


class ViewHolder{
	TextView userName;
	TextView email;
	TextView school;
	TextView type;
}
