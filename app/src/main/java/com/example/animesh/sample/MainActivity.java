package com.example.animesh.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "hello world", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hi this is my second toast ", Toast.LENGTH_SHORT).show();
    }
}
