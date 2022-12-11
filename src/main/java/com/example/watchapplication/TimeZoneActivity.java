package com.example.watchapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.watchapplication.model.TimeZone;

import java.util.Collections;

public class TimeZoneActivity extends AppCompatActivity {

    public static final String EXTRA_OPTIONS = "EXTRA_OPTIONS";

    private TimeZone timeZone;

    public TimeZoneActivity(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        Spinner spinner = findViewById(R.id.timezoneSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Collections.singletonList(timeZone));

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}