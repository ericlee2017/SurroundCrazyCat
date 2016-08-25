package com.czy.surroundcrazycat.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.czy.surroundcrazycat.View.GameView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GameView gameView = new GameView(this);
        setContentView(gameView);
        getSupportActionBar().hide();
    }
}
