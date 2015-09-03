package com.example.textviewjustifiedexample;

import com.vmoksha.justifiedtextview.JustifiedTextView;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint.Align;
import android.os.Bundle;
import android.util.TypedValue;

public class MainActivity extends Activity {
	private JustifiedTextView mJTv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mJTv=(JustifiedTextView) findViewById(R.id.textview);
        mJTv.setText(getResources().getString(R.string.hello_world));
        mJTv.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
        mJTv.setLineSpacing(15);
        mJTv.setBackgroundColor(Color.RED);
        mJTv.setAlignment(Align.LEFT);
	}

}
