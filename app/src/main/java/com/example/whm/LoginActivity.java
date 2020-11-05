package com.example.whm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {
    EditText editTextEmail, editTextPassword;
    Button buttonLogin;
    TextView textViewRegister , forgetPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        textViewRegister = findViewById(R.id.textViewRegister);
        forgetPassword = findViewById(R.id.forgetPassword);
    }

    public void to_home(View view) {
        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
    }

    public void to_forget_pass(View view) {
        startActivity(new Intent(LoginActivity.this,ForgetPassActivity.class));

    }
}