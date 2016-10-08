package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one, two, add, enter;
    int sign;//0 for add, 1 for subtract, 2 for multiply, 3 for divide,
    private TextView test;
    private String[] numbers; //this is where all the numbers are stored
    int holder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wire();
        calculate();
    }

    private void calculate() {
         holder = 0;

        test.setText("0");
        numbers = new String[2];
        numbers[holder]="0";
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numbers[holder]+=1;
                numbers[holder ]+="";
                test.setText(numbers[holder]);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers[holder]+=2;
                test.setText(numbers[holder]);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                holder++;
                sign =1;
                test.setText("0");
                numbers[holder] = "0";

            }

        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(numbers[0]);
                int second = Integer.parseInt(numbers[1]);
                if(sign ==1)
                {
                    int third = first + second;
                    test.setText(third+"");
                }
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
