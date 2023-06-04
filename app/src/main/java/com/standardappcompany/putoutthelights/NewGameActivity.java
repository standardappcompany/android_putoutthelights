package com.standardappcompany.putoutthelights;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewGameActivity extends AppCompatActivity {

    int gameSize;
    Button btnStartGame;
    Button btnStatistics;
    Button btn3x3;
    Button btn5x5;
    Button btn7x7;
    Button btn9x9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_new_game);

        //Variables
        gameSize = 9;

        //Buttons
        btnStartGame = findViewById(R.id.btn_startGame);
        btnStatistics = findViewById(R.id.btn_statistics);
        btn3x3 = findViewById(R.id.btn_3x3);
        btn5x5 = findViewById(R.id.btn_5x5);
        btn7x7 = findViewById(R.id.btn_7x7);
        btn9x9 = findViewById(R.id.btn_9x9);

        //Set Button Colors
        setButtonColor();


        btnStartGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                System.out.println("Button Press: btnStartGame pressed");
            }
        });

        btnStatistics.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent statisticsIntent = new Intent(NewGameActivity.this, StatisticsActivity.class);
                NewGameActivity.this.startActivity(statisticsIntent);
            }
        });

        btn3x3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                gameSize = 9;
                setButtonColor();
                System.out.println("Game Size: " + Integer.toString(gameSize));
            }
        });

        btn5x5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                gameSize = 25;
                setButtonColor();
                System.out.println("Game Size: " + Integer.toString(gameSize));
            }
        });

        btn7x7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                gameSize = 49;
                setButtonColor();
                System.out.println("Game Size: " + Integer.toString(gameSize));
            }
        });

        btn9x9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                gameSize = 81;
                setButtonColor();
                System.out.println("Game Size: " + Integer.toString(gameSize));
            }
        });
    }

    public void setButtonColor() {
        if (gameSize == 9) {
            btn3x3.setBackgroundColor(Color.BLUE);
            btn5x5.setBackgroundColor(Color.WHITE);
            btn7x7.setBackgroundColor(Color.WHITE);
            btn9x9.setBackgroundColor(Color.WHITE);
            btn3x3.setTextColor(Color.WHITE);
            btn5x5.setTextColor(Color.BLACK);
            btn7x7.setTextColor(Color.BLACK);
            btn9x9.setTextColor(Color.BLACK);
        } else if (gameSize == 25) {
            btn3x3.setBackgroundColor(Color.WHITE);
            btn5x5.setBackgroundColor(Color.BLUE);
            btn7x7.setBackgroundColor(Color.WHITE);
            btn9x9.setBackgroundColor(Color.WHITE);
            btn3x3.setTextColor(Color.BLACK);
            btn5x5.setTextColor(Color.WHITE);
            btn7x7.setTextColor(Color.BLACK);
            btn9x9.setTextColor(Color.BLACK);
        } else if (gameSize == 49) {
            btn3x3.setBackgroundColor(Color.WHITE);
            btn5x5.setBackgroundColor(Color.WHITE);
            btn7x7.setBackgroundColor(Color.BLUE);
            btn9x9.setBackgroundColor(Color.WHITE);
            btn3x3.setTextColor(Color.BLACK);
            btn5x5.setTextColor(Color.BLACK);
            btn7x7.setTextColor(Color.WHITE);
            btn9x9.setTextColor(Color.BLACK);
        } else if (gameSize == 81) {
            btn3x3.setBackgroundColor(Color.WHITE);
            btn5x5.setBackgroundColor(Color.WHITE);
            btn7x7.setBackgroundColor(Color.WHITE);
            btn9x9.setBackgroundColor(Color.BLUE);
            btn3x3.setTextColor(Color.BLACK);
            btn5x5.setTextColor(Color.BLACK);
            btn7x7.setTextColor(Color.BLACK);
            btn9x9.setTextColor(Color.WHITE);
        }
    }
}
