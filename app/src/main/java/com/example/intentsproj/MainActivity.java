package com.example.intentsproj;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NUMBER1 ="com.example.intentsproj.EXTRA_NUMBER1";
    public static final String EXTRA_NUMBER2 ="com.example.intentsproj.EXTRA_NUMBER2";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.customtoast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);
        toast.show();

        button = (Button) findViewById(R.id.button7);
    }

    @Override
    protected void onResume() {
        super.onResume();
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                displayToast();
                openSecondActivity();

            }
        });
    }





    public void openSecondActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        EditText num1 =  (EditText) findViewById(R.id.editTextNumber9);
        String number1 = num1.getText().toString();
        EditText num2 = (EditText) findViewById(R.id.editTextNumber10);
        String number2 = num2.getText().toString();
        intent.putExtra(EXTRA_NUMBER1,number1);
        intent.putExtra(EXTRA_NUMBER2,number2);
        startActivity(intent);

    }

    public void displayToast(){
        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, message, duration); toast.show();
    }


}