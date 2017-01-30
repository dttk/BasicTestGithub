package com.dthaitrungking.basicscoveredapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setHelloText();
    }

    protected void setHelloText() {
        TextView helloText = (TextView)findViewById(R.id.textviewid1);
        helloText.setText("Hello World Again Master Test Github");
        helloText.setTextSize(20);

    }
}
