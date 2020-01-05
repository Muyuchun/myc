package com.example.e_learning;


import com.dream.myqiyi.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class StarActivity extends Activity {
	TextView mTitleView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.star_activity);
		prepareView();
		mTitleView.setText(R.string.category_channel);
	}

	private void prepareView() {
		mTitleView = (TextView) findViewById(R.id.title_text);
	}
}
