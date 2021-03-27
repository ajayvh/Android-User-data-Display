package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void nextclick(View view) {
        Intent intent = new Intent(this, FirstPage.class);
        EditText f_name = (EditText) findViewById(R.id.editText);
        EditText l_name = (EditText) findViewById(R.id.editText2);
        String fname = f_name.getText().toString();
        String lname = l_name.getText().toString();

        intent.putExtra("FIRST_NAME", fname);
        intent.putExtra("LAST_NAME", lname);
        if(fname.length() < 15 && lname.length() <15 && fname.length() > 0 && lname.length() >0){
            f_name.setText("");
            l_name.setText("");
        startActivity(intent);}
        else{
            Toast.makeText(this,"Please Enter Valid Credentials",Toast.LENGTH_LONG).show();
            f_name.setText("");
            l_name.setText("");
        }
    }

    public void onBackPressed() {
        finishAffinity();
    }
}