package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText nameInput;
    Button pressMeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = findViewById(R.id.name_input);
        pressMeBtn = findViewById(R.id.press_me);
        Intent i = new Intent(this, NameDisplay.class);


        pressMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get name from nameInput
                String name = nameInput.getText().toString();
                // Put value of name into extra
                i.putExtra(NameDisplay.NAME, name);

                // Start NameDisplay activity
                startActivity(i);

            }
        });
    }
}