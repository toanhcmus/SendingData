package com.example.sendingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txtName, txtEmail, txtPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtName = findViewById(R.id.textViewName);
        txtEmail = findViewById(R.id.textViewEmail);
        txtPhone = findViewById(R.id.textViewPhone);

        Intent i = getIntent();
        String userName = i.getStringExtra("name");
        String userEmail = i.getStringExtra("email");
        int userPhone = i.getIntExtra("phone", 0);

        txtName.setText("Hello" + userName);
        txtEmail.setText("Your email address is " + userEmail);
        txtPhone.setText("Your phone number is "+ String.valueOf(userPhone));

    }
}