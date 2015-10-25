package com.example.thezeorapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button zeorButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {		//0,�£�����ɾ��ԭ������Ϊ�ڴ���app�ǣ����Զ�����activity��
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.d("MainActivity", "onCreate");
		zeorButton=(Button) findViewById(R.id.zeor_button);		//1, <string name="action_settings">Settings</string>����ɾ�����ᱨ��
		zeorButton.setOnClickListener(new OnClickListener() {	//2,������new onclicklistener����{}�����ױ�����֪ԭ����Ҫ�����ļ���
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent();
				intent.setClass(MainActivity.this, dakaiactivity.class);	//3��intent��setclass���÷���this���������⣿
				startActivity(intent);				//����context�ķ�����activity��context���Ӻ���������activity���Ե���startactivity������
			}
		});
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		Log.d("MainActivity", "onStart");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d("MainActivity", "onResume");
	}
	
	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d("MainActivity", "onRestart");
	}
	
	@Override
	protected void onPause() {
		super.onPause();
		Log.d("MainActivity", "onPause");
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		Log.d("MainActivity", "onStop");
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d("MainActivity", "onDstroy");
	}

}
