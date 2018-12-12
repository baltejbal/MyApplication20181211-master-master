package com.example.andrew.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();

        String message = intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView = findViewById(R.id.husername);
        textView.setText(message);
    }

    public void clickSettings(View view) {
        Intent intent = new Intent(Home.this, Settings.class);
        startActivity(intent);
    }
    public void calibrate(View view) {
        Intent intent = new Intent(Home.this, Testing.class);
        startActivity(intent);
    }

    public void History(View view) {
        Intent intent = new Intent(Home.this, History.class);
        startActivity(intent);
    }
}
