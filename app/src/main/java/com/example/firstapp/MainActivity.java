package com.example.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello World");

    }
    public void mybtnclick(View btn)
    {

        Button btn1 = (Button)btn;
        btn1.setText("myButton");
       TextView name=(TextView)findViewById(R.id.name);
        RadioGroup radioGroup=(RadioGroup)findViewById(R.id.radio);
        int radioBtnId=radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton=(RadioButton)findViewById(radioBtnId);
        name.setText(radioButton.getText());
    }



}
