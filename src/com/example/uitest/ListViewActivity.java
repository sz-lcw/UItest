package com.example.uitest;
 
import java.util.ArrayList;
import java.util.List;

import com.array_adapter.UserAdaptor;
import com.data.User;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class ListViewActivity extends Activity {
	
	private List<User> userList = new ArrayList<User>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e("ListViewActivity", "you are in ListViewActivity");
		setContentView(R.layout.listview_main);
		Log.e("ListViewActivity", "you are in setContentView");
		//ArrayAdapter
/*		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				ListViewActivity.this,android.R.layout.simple_list_item_1,data);
		ListView listView = (ListView) findViewById(R.id.listview_1);
		listView.setAdapter(adapter);*/
		
		User tmpUser = new User(1,"Vincent","123","szlcw@sina.com","SCUT",User.TYPE_ADMIN);
		userList.add(tmpUser);
		
		UserAdaptor adapter = new UserAdaptor(ListViewActivity.this, R.layout.user_item, userList);
		ListView listView = (ListView) findViewById(R.id.listview_1);
		listView.setAdapter(adapter);
		Log.e("ListViewActivity", "you are in setAdapter");
		
	}
	
}
