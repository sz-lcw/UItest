package com.example.uitest;


import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	//Button btnSubmit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViews();
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
	
	private void findViews(){
		Button btnSubmit1 = (Button)findViewById(R.id.bnFrameLayout);
		btnSubmit1.setOnClickListener(this);
		Button btnSubmit2 = (Button)findViewById(R.id.bnMenu);
		btnSubmit2.setOnClickListener(this);
		Button btnSubmit3 = (Button)findViewById(R.id.bnIntent);
		btnSubmit3.setOnClickListener(this);
		Button btnSubmit4 = (Button)findViewById(R.id.bnListView);
		btnSubmit4.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v){
		Intent intent;
		switch(v.getId()){
		case R.id.bnFrameLayout:
			Toast.makeText(MainActivity.this,"click into FrameLayoutActivity", Toast.LENGTH_SHORT).show();
			//into FrameLayoutActivity
			intent = new Intent(MainActivity.this,FrameLayoutActivity.class);
			startActivity(intent);
			break;
		case R.id.bnMenu:
			intent = new Intent(MainActivity.this,MenuActivity.class);
			startActivity(intent);			
			break;
		case R.id.bnIntent:
			intent = new Intent("com.example.uitest.ACTION_START");
			intent.addCategory("android.intent.category.MY_CATEGORY");
			startActivity(intent);			
			break;
		case R.id.bnListView:
			intent = new Intent(MainActivity.this,ListViewActivity.class);
			startActivity(intent);					
		default:
			break;
		}
	}
	
}
