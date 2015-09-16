package com.example.custextview;

import android.app.Activity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class ChangeMenuActivity extends Activity {

	private TextView custom;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_change);

		custom = (TextView) findViewById(R.id.txt_custom);
		custom.setTextIsSelectable(true);
		custom.setCustomSelectionActionModeCallback(new StyleCallback());
	}

	class StyleCallback implements ActionMode.Callback {

		@Override
		public boolean onCreateActionMode(ActionMode mode, Menu menu) {
			MenuInflater inflater = mode.getMenuInflater();
			// 可以在系统actionBar 添加自己的功能，比如分享
			inflater.inflate(R.menu.stylecallback, menu);
			return true;
		}

		@Override
		public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
			return false;
		}

		@Override
		public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
			// 自定义添加功能点击监听操作
			String text = custom.getText().toString();
			int start = custom.getSelectionStart();
	        int end = custom.getSelectionEnd();
			
			switch (item.getItemId()) {
			case R.id.italic:
				Toast.makeText(getApplicationContext(), text.substring(start, end), Toast.LENGTH_SHORT).show();
				mode.finish();
				return true;
			}
			
			return false;
		}

		@Override
		public void onDestroyActionMode(ActionMode mode) {
		}

	}

}
