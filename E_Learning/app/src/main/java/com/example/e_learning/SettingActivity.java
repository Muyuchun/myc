package com.example.e_learning;


import com.dream.myqiyi.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SettingActivity extends Activity {
	TextView mTitleView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setting_activity);
	
		prepareView();
		mTitleView.setText(R.string.category_more);
	}

	private void prepareView() {
		mTitleView = (TextView) findViewById(R.id.title_text);
	}
}
