package com.stephenchisa.colorcomplimenter.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.stephenchisa.colorcomplimenter.R;

public class ColorActivity extends AppCompatActivity {
    private TextView colorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));
        if (name == null || name.isEmpty()){
            name = "blue";

        }
        TextView colorTextView = (TextView) findViewById(R.id.colorTextView);
        colorTextView.setText(name);

    }



}
