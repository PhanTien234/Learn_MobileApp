package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get a reference to the GUI
        TextView helloWorld = (TextView) findViewById(R.id.helloWorldText);

        //Generate a random number from 0 - 100
        int mark = 0;
        Random r = new Random();
        mark = r.nextInt(100);
        mark++;

        //Output the result
        helloWorld.setTextSize(30);
        helloWorld.setTextColor(Color.BLUE);
        helloWorld.setText("Hello World !\n");
        helloWorld.append("Your mark is: " + mark);

        // If-else statement
        if (mark < 50) {
            helloWorld.setTextColor(Color.RED);
            helloWorld.append("\nYou Lose !!!");
            return;
        }
        helloWorld.setTextColor(Color.GREEN);
        helloWorld.append("\nYou Win !!!");
    }
}