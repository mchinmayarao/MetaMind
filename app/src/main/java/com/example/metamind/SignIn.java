package com.example.metamind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    EditText username, password, cpassword;
    Button signup, signin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin);

        username = findViewById(R.id.username);
        password = findViewById(R.id.Password);
        cpassword = findViewById(R.id.cpassword);
        signup = findViewById(R.id.Sigup);
        signin = findViewById(R.id.Sigin);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = cpassword.getText().toString();

                if (TextUtils.isEmpty(user) || TextUtils.isEmpty(pass) || TextUtils.isEmpty(repass)) {
                    Toast.makeText(SignIn.this, "All fields are required", Toast.LENGTH_SHORT).show();
                } else {
                    if (pass.equals(repass)) {
                        boolean insert = DB.insertUser(user, pass);
                        if (insert) {
                            Toast.makeText(SignIn.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                            username.setText("");
                            password.setText("");
                            cpassword.setText("");
                            Intent intent = new Intent(SignIn.this, Login.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(SignIn.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(SignIn.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignIn.this, Login.class);
                startActivity(intent);
            }
        });
    }
}