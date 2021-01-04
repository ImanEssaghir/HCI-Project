package com.example.hci_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mouseCounter = 0;
    int count = 0;
    TextView showView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.sea_shell);

        showView = (TextView) findViewById(R.id.mainCounter);

        /* Button to navigate to the different screens and their respective views
         Each button is associated to on click listener that keeps track of how many times
         the user clicked on a button */

        Button button = (Button) findViewById(R.id.days_button);
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, days.class);
                startActivity(intent);
                mouseCounter++;
                showView.setText(Integer.toString(mouseCounter));
            }
        });

        Button button2 = (Button) findViewById(R.id.numbers_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, numbers.class);
                startActivity(intent);
                mouseCounter++;
                showView.setText(Integer.toString(mouseCounter));
            }
        });

        Button button3 = (Button) findViewById(R.id.colors_button);
        button3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, color_pal.class);
                startActivity(intent);
                mouseCounter++;
                showView.setText(Integer.toString(mouseCounter));
            }
        });

        // Create a thread and start it in order to count the time elapsed on the app
        final TextView textView = (TextView) findViewById(R.id.timeElapsed);
        Thread t = new Thread(){
            @Override
            public void run(){
                while(!isInterrupted()){

                    try {
                        Thread.sleep(1000); // i.e. 1 s
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                count++;
                                textView.setText(String.valueOf(count));
                            }
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // Start the thread
        t.start();
    }

}