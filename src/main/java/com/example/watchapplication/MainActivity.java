package com.example.watchapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final int OPTIONS_KEY = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == OPTIONS_KEY && resultCode == Activity.RESULT_OK) {
            assert data != null;
            //user = data.getParcelableExtra(TimeZoneActivity.EXTRA_OPTIONS);
        }
    }

    public void startTimeZoneActivity(View view) {
        Intent intent = new Intent(this, TimeZoneActivity.class);
        startActivityForResult(intent, OPTIONS_KEY);
    }
}