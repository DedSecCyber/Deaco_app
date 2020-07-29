package com.my.newproject4;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class MainActivity extends Activity {
	
	
	private LinearLayout linear1;
	private TextView textview1;
	private Button talk_button;
	private Button group_talk_button;
	private Button etc_language;
	private Button about_us;
	
	private Intent Talk_Page_Intent = new Intent();
	private Intent Talk_Group_Intent = new Intent();
	private Intent Etc_Language_Intent = new Intent();
	private Intent About_Us_Intent = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		textview1 = (TextView) findViewById(R.id.textview1);
		talk_button = (Button) findViewById(R.id.talk_button);
		group_talk_button = (Button) findViewById(R.id.group_talk_button);
		etc_language = (Button) findViewById(R.id.etc_language);
		
		talk_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Talk_Page_Intent.setClass(getApplicationContext(), TalkPageActivity.class);
				startActivity(Talk_Page_Intent);
			}
		});
		
		group_talk_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Talk_Group_Intent.setClass(getApplicationContext(), TalkGroupPageActivity.class);
				startActivity(Talk_Group_Intent);
			}
		});
		
		etc_language.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Etc_Language_Intent.setClass(getApplicationContext(), EtcLanguagePageActivity.class);
				startActivity(Etc_Language_Intent);
			}
		});

		about_us.setOnClickListener(new View.OnClickListener() {

			public void onClickListener(View _view) {
				About_Us_Intent.setClass(getApplicationContext(), About_Us)
			}
		});
	}
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
