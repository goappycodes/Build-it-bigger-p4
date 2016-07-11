package com.swatiag1101.jokesdisplay;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesDisplay extends ActionBarActivity {

    TextView joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes_display);

        joke = (TextView) findViewById(R.id.joke);

        Intent i = getIntent();
        String joke_display = i.getStringExtra("Joke");
        joke.setText(joke_display);
    }
}
