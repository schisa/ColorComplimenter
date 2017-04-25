package com.stephenchisa.colorcomplimenter.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.stephenchisa.colorcomplimenter.R;
import com.stephenchisa.colorcomplimenter.model.Color;

public class MainActivity extends AppCompatActivity {

    private EditText colorEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorEditText = (EditText)findViewById(R.id.colorEditText);
        submitButton = (Button)findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = colorEditText.getText().toString();
                Toast.makeText(MainActivity.this,name, Toast.LENGTH_LONG).show();
                showColor(name);

            }
        });
        
    }

    @Override
    protected void onResume() {
        super.onResume();
        colorEditText.setText("");
    }

    private void showColor(String name) {
        Intent intent = new Intent(this, ColorActivity.class);
        Resources resources = getResources();
        String key = resources.getString(R.string.key_name);
        intent.putExtra(key, name);
        startActivity(intent);

    }

}
