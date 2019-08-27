package com.example.register1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText confirmpass;
    EditText email;
    EditText password;
    Button signup;
    String e, p, cp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        confirmpass = (EditText) findViewById(R.id.confirmpass);
        signup=(Button)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e = email.getText().toString();
                p = password.getText().toString();
                cp = confirmpass.getText().toString();
                if (!e.isEmpty() && !p.isEmpty() && !cp.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Successfully login", Toast.LENGTH_LONG).show();
                } else if (e.isEmpty()) {
                    Toast.makeText(MainActivity.this, "email is empty", Toast.LENGTH_LONG).show();
                } else if (p.isEmpty()) {
                    Toast.makeText(MainActivity.this, "password is empty", Toast.LENGTH_LONG).show();
                } else if (cp.isEmpty()) {
                    Toast.makeText(MainActivity.this, "confirmpassword is empty", Toast.LENGTH_LONG).show();
                }
            }


        });
    }
}

