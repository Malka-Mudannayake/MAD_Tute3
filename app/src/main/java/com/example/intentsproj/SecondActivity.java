package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText num1,num2;
    Button add,sub,mul,div;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String number1 = intent.getStringExtra(MainActivity.EXTRA_NUMBER1);
        final String number2 = intent.getStringExtra(MainActivity.EXTRA_NUMBER2);

        TextView textView1 = (TextView) findViewById(R.id.editTextNumber3);
        TextView textView2 = (TextView) findViewById(R.id.editTextNumber4);

        textView1.setText(number1);
        textView2.setText(number2);
        num1 = (EditText)findViewById(R.id.editTextNumber3);
        num2 = (EditText)findViewById(R.id.editTextNumber4);
        add = (Button) findViewById(R.id.button2);
        sub = (Button)findViewById(R.id.button3);
        mul = (Button) findViewById(R.id.button5);
        div = (Button) findViewById(R.id.button4);
        answer = (TextView)findViewById(R.id.textView6);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int result;
              int number1 = Integer.parseInt(num1.getText().toString());
              int number2 = Integer.parseInt(num2.getText().toString());
              result = number1 + number2;
              answer.setText(String.valueOf(result));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result;
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                result = number1 - number2;
                answer.setText(String.valueOf(result));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result;
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                result = number1 * number2;
                answer.setText(String.valueOf(result));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int result;
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                result = number1 / number2;
                answer.setText(String.valueOf(result));
            }
        });

    }
}