package com.standardappcompany.putoutthelights;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    Button btnNewGame;
    Button btnStatistics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main_menu);

        //Buttons
        btnNewGame = findViewById(R.id.btn_newGame);
        btnStatistics = findViewById(R.id.btn_statistics);

        btnNewGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent newGameIntent = new Intent(MainMenuActivity.this, NewGameActivity.class);
                MainMenuActivity.this.startActivity(newGameIntent);
            }
        });

        btnStatistics.setOnClickListener(new View.OnClickListener() {
           public void onClick(View view) {
               Intent statisticsIntent = new Intent(MainMenuActivity.this, StatisticsActivity.class);
               MainMenuActivity.this.startActivity(statisticsIntent);
           }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}