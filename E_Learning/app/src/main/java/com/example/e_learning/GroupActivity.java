package com.example.e_learning;

import com.dream.myqiyi.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseExpandableListAdapter;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

public class GroupActivity extends Activity {
	private TextView mTitleView;
	private EditText mInputSection;
	private ImageView mDeleteButton;
	private ExpandableListView elv_group;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.group_activity);
		prepareView();
		//mTitleView.setText(R.string.category_account);
		elv_group = (ExpandableListView) findViewById(R.id.elv_group);
		mInputSection = (EditText) findViewById(R.id.input_section);
		mDeleteButton = (ImageView) findViewById(R.id.btn_delete);
		elv_group.setGroupIndicator(getResources().getDrawable(
				R.drawable.expandablelist_bg));
		MyExpandableListAdapter adapter = new MyExpandableListAdapter();
		elv_group.setAdapter(adapter);
		 mDeleteButton.setOnClickListener(new OnClickListener() {

	            @Override
	            public void onClick(View v) {
	                // TODO Auto-generated method stub
	                mInputSection.setText("");
	            }
	        });
		mInputSection.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub
				if (count > 0) {
					mDeleteButton.setVisibility(View.VISIBLE);
				} else {
					mDeleteButton.setVisibility(View.GONE);
				}
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub

			}
		});
	}

	private void prepareView() {
		mTitleView = (TextView) findViewById(R.id.title_text);
	}

	class MyExpandableListAdapter extends BaseExpandableListAdapter {

		@Override
		public Object getChild(int groupPosition, int childPosition) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getChildId(int groupPosition, int childPosition) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getChildView(int groupPosition, int childPosition,
				boolean isLastChild, View convertView, ViewGroup parent) {
			TextView tv = new TextView(BaseApp.context);
			tv.setPadding(80, 10, 20, 10);
			tv.setText("wohao" + groupPosition);

			return tv;
		}

		@Override
		public int getChildrenCount(int groupPosition) {
			// TODO Auto-generated method stub
			return 5;
		}

		@Override
		public Object getGroup(int groupPosition) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int getGroupCount() {
			// TODO Auto-generated method stub
			return 10;
		}

		@Override
		public long getGroupId(int groupPosition) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getGroupView(int groupPosition, boolean isExpanded,
				View convertView, ViewGroup parent) {
			TextView tv = new TextView(BaseApp.context);
			tv.setPadding(60, 10, 20, 10);
			tv.setText("nihao" + groupPosition);
			return tv;
		}

		@Override
		public boolean hasStableIds() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isChildSelectable(int groupPosition, int childPosition) {
			// TODO Auto-generated method stub
			return false;
		}

	}

}
