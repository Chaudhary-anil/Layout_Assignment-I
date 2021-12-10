package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CheckYourMailActivity extends AppCompatActivity {

    TextView nexttv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_your_mail);

        nexttv = findViewById(R.id.NEXT);

        nexttv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(CheckYourMailActivity.this,CreateNewPasswordActivity.class);
                startActivity(intent);
            }
        });

    }
}