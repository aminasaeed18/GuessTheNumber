package com.example.guessthenumber;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;
    LinearLayout screen;
    public  void  makeTost(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();

    }
    public void guess(View view) {
        EditText guessNumber = (EditText) findViewById(R.id.guessNumber);
        Button buttonGuess = (Button) findViewById(R.id.guess);
        int guesInt = Integer.parseInt(guessNumber.getText().toString());
        if (guesInt > randomNumber) {
            makeTost("Lower!");
           // Toast.makeText(MainActivity.this, "Lower!", Toast.LENGTH_SHORT).show();
            buttonGuess.setBackgroundResource(R.drawable.redbtn);
        } else if (guesInt < randomNumber) {
            makeTost("Higher!");

           // Toast.makeText(MainActivity.this, "Higher!", Toast.LENGTH_SHORT).show();
            buttonGuess.setBackgroundResource(R.drawable.redbtn);

        } else {
            makeTost("Hurrayyy.. That's right! Try again...");
          //  Toast.makeText(MainActivity.this, "Hurrayyy.. That's right! Try again...", Toast.LENGTH_SHORT).show();
            buttonGuess.setBackgroundResource(R.drawable.yellowbtn);
            Random random = new Random();
            randomNumber = random.nextInt(20) + 1;


        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (LinearLayout) findViewById(R.id.screen);


            Random random = new Random();
            randomNumber = random.nextInt(20) + 1;
        }
    }
