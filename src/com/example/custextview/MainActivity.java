package com.example.custextview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	
	private Button btn_change;
	private Button btn_edit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_main);
		
		btn_change = (Button) findViewById(R.id.btn_change);
		btn_change.setOnClickListener(this);
		
		btn_edit = (Button) findViewById(R.id.btn_edit);
		btn_edit.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_change:
			Intent intent_change = new Intent(MainActivity.this, ChangeMenuActivity.class);
			startActivity(intent_change);
			
			break;
			
		case R.id.btn_edit:
			Intent intent_edit = new Intent(MainActivity.this, ChangeEditActivity.class);
			startActivity(intent_edit);
			break;

		default:
			break;
		}
	}
	
}
