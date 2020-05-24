package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Link ball image to the layout code
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);
        // Linking the 'ask' button to the layout code
        Button myButton = (Button) findViewById(R.id.askButton);

        // Initialise array to store ball references
        final int[] ballArray = new int[] {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creates an instance of the Random class
                Random randomNumberGenerator = new Random();
                // Generates a random number between 0 and 5 for one dice
                int number = randomNumberGenerator.nextInt(5);
                // Sets to another random dice image from ballArray
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }
}
