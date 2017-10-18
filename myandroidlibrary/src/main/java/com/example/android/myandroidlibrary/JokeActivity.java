package com.example.android.myandroidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
    public static String JOKE_CONTENT = "JOKE_CONTENT";
    String mJokeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        Intent intentFromButtonClick = getIntent();
        if (intentFromButtonClick.hasExtra(JOKE_CONTENT)) {
            mJokeString = intentFromButtonClick.getStringExtra(JOKE_CONTENT);
        }
        TextView jokeTextView = (TextView)findViewById(R.id.jokeTextView);
        jokeTextView.setText(mJokeString);
    }
}
