package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstPage extends AppCompatActivity {

    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        Intent intent = getIntent();

    }

    public void nextclickpage(View view) {
        Intent intent = new Intent(this, SecondPage.class);
        EditText user_email = (EditText) findViewById(R.id.email_id);
        EditText user_mobile = (EditText) findViewById(R.id.mobile_no);
        String Email = user_email.getText().toString();
        String Mobile_no = user_mobile.getText().toString();

        String F_name = getIntent().getStringExtra("FIRST_NAME");
        String L_name = getIntent().getStringExtra("LAST_NAME");
        intent.putExtra("FIRST_NAME", F_name);
        intent.putExtra("LAST_NAME", L_name);
        intent.putExtra("USER_EMAIL", Email);
        intent.putExtra("USER_MOBILE_NO", Mobile_no);

        if(user_email.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(),"enter email address",Toast.LENGTH_SHORT).show();
            user_email.setText("");
        }else {
            if (user_email.getText().toString().trim().matches(emailPattern) && Mobile_no.length()==10) {
                user_email.setText("");
                user_mobile.setText("");
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(),"Invalid email address or Mobile no Invalid", Toast.LENGTH_SHORT).show();
                if(!user_email.getText().toString().trim().matches(emailPattern))
                {user_email.setText("");}
                if(Mobile_no.length()!=10){
                user_mobile.setText("");}
            }
        }


    }
}