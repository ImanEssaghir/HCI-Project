package com.example.hci_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class numbers extends AppCompatActivity {

    int l1_counter = 0;
    int l2_counter = 0;
    int l3_counter = 0;
    int l4_counter = 0;
    int l5_counter = 0;
    int mouseCounter = 0;

    TextView showView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        View view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.sea_shell);

        showView = (TextView) findViewById(R.id.counterValue);

        Button button = (Button) findViewById(R.id.l1_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(numbers.this, l1_numbers.class);
                startActivity(intent);
                l1_counter++;
                System.out.println("l1 numbers counter is:  " + l1_counter);
                mouseCounter++;
                showView.setText(Integer.toString(mouseCounter));
            }
        });

        Button button2 = (Button) findViewById(R.id.l2_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(numbers.this, l2_numbers.class);
                startActivity(intent);
                 l2_counter++;
                 System.out.println("l2 numbers counter is:  " + l2_counter);
                 mouseCounter++;
                 showView.setText(Integer.toString(mouseCounter));
            }
        });

        Button button3 = (Button) findViewById(R.id.l3_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(numbers.this, l3_numbers.class);
                startActivity(intent);
                l3_counter++;
                System.out.println("l3 numbers counter is:  " + l3_counter);
                mouseCounter++;
                showView.setText(Integer.toString(mouseCounter));
            }
        });

        Button button4 = (Button) findViewById(R.id.l4_button);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(numbers.this, l4_numbers.class);
                startActivity(intent);
                l4_counter++;
                System.out.println("l4 numbers counter is:  " + l4_counter);
                mouseCounter++;
                showView.setText(Integer.toString(mouseCounter));
            }
        });

        Button button5 = (Button) findViewById(R.id.l5_button);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(numbers.this, l5_numbers.class);
                startActivity(intent);
                l5_counter++;
                System.out.println("l5 numbers counter is:  " + l5_counter);
                mouseCounter++;
                showView.setText(Integer.toString(mouseCounter));
            }
        });

    }

}