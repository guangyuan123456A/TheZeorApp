package com.example.thezeorapp;

import android.app.Activity;
import android.os.Bundle;

public class dakaiactivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {	//0，不自动创建activity，自己写时，只需要写出关键部分，软件会自动到处其他内容，如：这行只需写onCreate，其他可导出。
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dakai);
	}

}
