package com.example.birthday_card;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void createBirthday(View view) {
        Intent intent  = new Intent(this, Birthday_greeting);
        startActivity(intent);

    }
}