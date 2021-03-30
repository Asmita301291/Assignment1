package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

    }

    public void openGetData(View view) {
        Intent intent = new Intent(FirstScreen.this,GetData.class);
        startActivity(intent);
    }

    public void openVerScroll(View view) {
        Intent intent = new Intent(FirstScreen.this,VerScroll.class);
        startActivity(intent);
    }

    public void openMainActivity(View view) {
        Intent intent = new Intent(FirstScreen.this,MainActivity.class);
        startActivity(intent);
    }

    public void openHoriScroll(View view) {
        Intent intent = new Intent(FirstScreen.this,HoriScroll.class);
        startActivity(intent);
    }
}