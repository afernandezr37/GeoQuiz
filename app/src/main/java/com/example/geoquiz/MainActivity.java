package com.example.geoquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mTrueButton = (Button) findViewById(R.id.buttonTrue);
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Correct!",

                        Toast.LENGTH_SHORT).show();
            }
        });
        Button mFalseButton = (Button) findViewById(R.id.buttonFalse);
        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Incorrect!",

                        Toast.LENGTH_SHORT).show();
            }
            }
        );
    }
}