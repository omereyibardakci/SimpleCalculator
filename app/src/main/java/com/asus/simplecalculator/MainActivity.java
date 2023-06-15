package com.asus.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText number1Text;
    EditText number2Text;
    TextView resultText;
    int number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1Text=findViewById(R.id.number1Text);
        number2Text=findViewById(R.id.number2Text);
        resultText=findViewById(R.id.resultText);

    }

    public void getNumber(){
        if(number1Text.getText().toString().matches("")||number2Text.getText().toString().matches("")){
            resultText.setText("Please enter a number!");
        }
        else{
            number1= Integer.parseInt(number1Text.getText().toString());
            number2= Integer.parseInt(number2Text.getText().toString());
        }
    }



    public void sum(View view){
        getNumber();
        int result= number1+number2;
        //resultText.setText(result.toString());     Not converted like this.
        resultText.setText("Result: "+result);
    }

    public void subtract(View view){
        getNumber();
        int result= number1-number2;
        resultText.setText("Result: "+result);

    }

    public void multiply(View view){
        getNumber();
        int result= number1*number2;
        resultText.setText("Result: "+result);

    }

    public void divide(View view){
        getNumber();
        if(number2==0){
            Toast.makeText(MainActivity.this,"The denominator cannot be zero.",Toast.LENGTH_LONG).show();
        }
        else{
            double result= (double)number1/(double)number2;
            resultText.setText("Result: "+String.format("%.2f",result));
        }
    }



}