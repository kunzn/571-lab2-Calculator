package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        EditText editNum1 = (EditText) findViewById(R.id.editNum1);
        EditText editNum2 = (EditText) findViewById(R.id.editNum2);

        int num1 = Integer.valueOf(String.valueOf(editNum1.getText()));
        int num2 = Integer.valueOf(String.valueOf(editNum2.getText()));

        int total = num1 + num2;
        goToActivity(String.valueOf(total));
    }

    public void subtract(View view){
        EditText editNum1 = (EditText) findViewById(R.id.editNum1);
        EditText editNum2 = (EditText) findViewById(R.id.editNum2);

        int num1 = Integer.valueOf(String.valueOf(editNum1.getText()));
        int num2 = Integer.valueOf(String.valueOf(editNum2.getText()));

        int total = num1 - num2;
        goToActivity(String.valueOf(total));
    }

    public void multiply(View view){
        EditText editNum1 = (EditText) findViewById(R.id.editNum1);
        EditText editNum2 = (EditText) findViewById(R.id.editNum2);

        int num1 = Integer.valueOf(String.valueOf(editNum1.getText()));
        int num2 = Integer.valueOf(String.valueOf(editNum2.getText()));

        int total = num1 * num2;
        goToActivity(String.valueOf(total));
    }

    public void divide(View view){
        EditText editNum1 = (EditText) findViewById(R.id.editNum1);
        EditText editNum2 = (EditText) findViewById(R.id.editNum2);

        int num1 = Integer.valueOf(String.valueOf(editNum1.getText()));
        int num2 = Integer.valueOf(String.valueOf(editNum2.getText()));

        if (num2 == 0) {
            goToActivity("Error: Division by 0");
            return;
        }
        int total = num1 / num2;
        goToActivity(String.valueOf(total));
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}