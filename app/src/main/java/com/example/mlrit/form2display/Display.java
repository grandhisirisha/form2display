package com.example.mlrit.form2display;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Bundle b = getIntent().getExtras();

        TextView name = (TextView) findViewById(R.id.textView1);
        TextView age = (TextView) findViewById(R.id.textView2);
        TextView gender = (TextView) findViewById(R.id.textView3);

        name.setText(b.getCharSequence("name"));
        age.setText(b.getCharSequence("age"));
        gender.setText(b.getCharSequence("Gender"));
    }
}

