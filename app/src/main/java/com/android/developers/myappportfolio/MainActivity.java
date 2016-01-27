package com.android.developers.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(View view){

        Button button = (Button) view;
        String text = "This button will launch my " + button.getText().toString().toLowerCase();
        Toast.makeText(MainActivity.this, "" + text, Toast.LENGTH_SHORT).show();
    }
}
