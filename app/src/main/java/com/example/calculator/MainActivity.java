package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one, two, add, enter;
    int number;//0 for add, 1 for subtract, 2 for multiply, 3 for divide, 
    private TextView test;
    private String[] numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wire();
        calculate();
    }

    private void calculate() {
        final int x = 0;

        test.setText("0");
        numbers = new String[3];
        numbers[x]="0";
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numbers[x]+=1;
                numbers[x]+="";
                test.setText(numbers[x]);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers[x]+=2;
                test.setText(numbers[x]);
            }
        });
    }

    private void wire() {
        one = (Button) findViewById(R.id.button_one);
        two = (Button) findViewById(R.id.button_two);
        add = (Button) findViewById(R.id.button_add);
        enter = (Button) findViewById(R.id.button_enter);
        test = (TextView) findViewById(R.id.textView);

    }
}
