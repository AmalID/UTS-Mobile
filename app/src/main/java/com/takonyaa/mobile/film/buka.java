package com.takonyaa.mobile.film;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class buka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
