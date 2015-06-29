package com.melayer.intentfilter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button btnStart;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnStart = (Button) findViewById(R.id.btnStart);
		btnStart.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				Intent intent = new Intent();
				intent.setAction("com.melayer.action.news");
				intent.setData(Uri.parse("gttp://google"));
				startActivity(intent);
				
				/*Intent intent = new Intent();
				intent.setAction(Intent.ACTION_DIAL);
				startActivity(intent);*/
				
/*				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_CALL);
				intent.setData(Uri.parse("tel://9762548833"));
				startActivity(intent);*/
			}
		});
	}
}
