package com.example.whm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgetPassActivity extends AppCompatActivity {
    EditText userNameReset;
    TextView forgetTv;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);
        userNameReset = findViewById(R.id.userNameReset);
        forgetTv = findViewById(R.id.forgetTv);
        btnReset = findViewById(R.id.btnReset);

    }
}