package com.example.mlrit.form2display;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
EditText t1;
    EditText t2;
    RadioGroup rg;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText)findViewById(R.id.name);
        t2=(EditText)findViewById(R.id.age);
        rg=(RadioGroup)findViewById(R.id.Gender);

        b=(Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(), Display.class);

                Bundle b=new Bundle();
                b.putString("name",t1.getText().toString());
                b.putString("age",t2.getText().toString());
                int val=rg.getCheckedRadioButtonId();
                RadioButton rb=(RadioButton)findViewById(val);
                b.putString("Gender",rb.getText().toString());

                i.putExtras(b);
                startActivity(i);


            }
        });


    }
}
