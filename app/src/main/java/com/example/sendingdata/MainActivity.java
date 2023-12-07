package com.example.sendingdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    EditText name, email, phone;
//    Button signup;

    EditText weight, height;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        name = findViewById(R.id.editTextName);
//        email = findViewById(R.id.editTextEmail);
//        phone = findViewById(R.id.editTextPhone);
//
//        signup = findViewById(R.id.buttonSignup);
//
//        signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String userName = name.getText().toString();
//                String userEmail = email.getText().toString();
//                int userPhone = Integer.parseInt(phone.getText().toString());
//
//                Intent i = new Intent(MainActivity.this, SecondActivity.class);
//                i.putExtra("name", userName);
//                i.putExtra("email", userEmail);
//                i.putExtra("phone", userPhone);
//                startActivity(i);
//
//            }
//        });

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MyFirstFragment myFirstFragment = new MyFirstFragment();
        weight = findViewById(R.id.editTextWeight);
        height = findViewById(R.id.editTextHeight);
        calculate = findViewById(R.id.buttonCalculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                int userWeight = Integer.valueOf(weight.getText().toString());
                int userHeight = Integer.valueOf(height.getText().toString());

                bundle.putInt("weight", userWeight);
                bundle.putInt("height", userHeight);

                myFirstFragment.setArguments(bundle);
                fragmentTransaction.add(R.id.frame, myFirstFragment);
                fragmentTransaction.commit();


            }
        });

    }
}