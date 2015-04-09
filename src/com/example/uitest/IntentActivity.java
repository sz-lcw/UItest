package com.example.uitest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
//import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class IntentActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.e("IntentActivity","in IntentActivity");
		//requestWindowFeature(Window.FEATURE_SWIPE_TO_DISMISS);//title;
		setContentView(R.layout.intent_main);
		Button button = (Button)findViewById(R.id.bnIntent1);
		button.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));
				Toast.makeText(IntentActivity.this, "´ò¿ªBaiDu", Toast.LENGTH_SHORT).show();
				startActivity(intent);
			}
		});
	}
}
