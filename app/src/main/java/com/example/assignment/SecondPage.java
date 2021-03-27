package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        Intent intent = getIntent();

        String F_name = getIntent().getStringExtra("FIRST_NAME");
        String L_name = getIntent().getStringExtra("LAST_NAME");
        String Email = getIntent().getStringExtra("USER_EMAIL");
        String Mobile = getIntent().getStringExtra("USER_MOBILE_NO");

        TextView textView1 = findViewById(R.id.textView2);
        TextView textView2 = findViewById(R.id.textView3);
        TextView textView3 = findViewById(R.id.textView4);
        TextView textView4 = findViewById(R.id.textView5);

        textView1.setText(F_name);
        textView2.setText(L_name);
        textView3.setText(Email);
        textView4.setText(Mobile);

    }

    public void doneclick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}