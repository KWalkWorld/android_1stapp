package com.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
    private TextView mtv4, mtv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mtv4 = (TextView) findViewById(R.id.tv_4);
        mtv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mtv4.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
        mtv4.getPaint().setAntiAlias(true);//去除锯齿

        mtv5 = (TextView) findViewById(R.id.tv_5);
        mtv5.setText(Html.fromHtml("<u>HELLO</u>"));
    }
}
