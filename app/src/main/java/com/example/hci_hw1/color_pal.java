package com.example.hci_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class color_pal extends AppCompatActivity {

    private View view;
    int mouseCounter = 0;
    int rC = 0;
    int oC = 0;
    int yC = 0;
    int gC = 0;
    int bC = 0;
    int iC = 0;
    int vC = 0;

    TextView showView, rView, oView, yView, gView, bView, iView, vView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_pal);

        view = this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.sea_shell);

        // Counters views
        showView = (TextView) findViewById(R.id.colorsCounter);
        rView = (TextView) findViewById(R.id.redCounter);
        oView = (TextView) findViewById(R.id.orangeCounter);
        yView = (TextView) findViewById(R.id.yellowCounter);
        gView = (TextView) findViewById(R.id.greenCounter);
        bView = (TextView) findViewById(R.id.blueCounter);
        iView = (TextView) findViewById(R.id.indigoCounter);
        vView = (TextView) findViewById(R.id.violetCounter);
    }


    @SuppressLint("SetTextI18n")
    public void RedColor(View v){
        // set the view to red
        view.setBackgroundResource(R.color.red);
        // increment the clicks mouse counter by one every time the button is clicked
        rC++;
        rView.setText(Integer.toString(rC));
        mouseCounter++;
        showView.setText(Integer.toString(mouseCounter));
    }

    @SuppressLint("SetTextI18n")
    public void OrangeColor(View v){
        // set the view to orange
        view.setBackgroundResource(R.color.orange);
        // increment the clicks mouse counter by one every time the button is clicked
        oC++;
        oView.setText(Integer.toString(oC));
        mouseCounter++;
        showView.setText(Integer.toString(mouseCounter));
    }

    @SuppressLint("SetTextI18n")
    public void YellowColor(View v){
        // set the view to yellow
        view.setBackgroundResource(R.color.yellow);
        // increment the clicks mouse counter by one every time the button is clicked
        yC++;
        yView.setText(Integer.toString(yC));
        mouseCounter++;
        showView.setText(Integer.toString(mouseCounter));
    }

    @SuppressLint("SetTextI18n")
    public void GreenColor(View v){
        // set the view to green
        view.setBackgroundResource(R.color.green);
        // increment the clicks mouse counter by one every time the button is clicked
        gC++;
        gView.setText(Integer.toString(gC));
        mouseCounter++;
        showView.setText(Integer.toString(mouseCounter));
    }

    @SuppressLint("SetTextI18n")
    public void BlueColor(View v){
        // set the view to blue
        view.setBackgroundResource(R.color.blue);
        // increment the clicks mouse counter by one every time the button is clicked
        bC++;
        bView.setText(Integer.toString(bC));
        mouseCounter++;
        showView.setText(Integer.toString(mouseCounter));
    }

    @SuppressLint("SetTextI18n")
    public void IndigoColor(View v){
        // set the view to indigo
        view.setBackgroundResource(R.color.indigo);
        // increment the clicks mouse counter by one every time the button is clicked
        iC++;
        iView.setText(Integer.toString(iC));
        mouseCounter++;
        showView.setText(Integer.toString(mouseCounter));
    }

    @SuppressLint("SetTextI18n")
    public void VioletColor(View v){
        // set the view to violet
        view.setBackgroundResource(R.color.violet);
        // increment the clicks mouse counter by one every time the button is clicked
        vC++;
        vView.setText(Integer.toString(vC));
        mouseCounter++;
        showView.setText(Integer.toString(mouseCounter));
    }

}