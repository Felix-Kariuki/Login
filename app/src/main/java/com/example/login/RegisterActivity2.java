package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity2 extends AppCompatActivity {
    EditText mTextUsername;
    EditText mTextPassword;
    EditText mTextConfPassword;
    Button mButtonRegister;
    TextView mTextViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mTextUsername = (EditText)findViewById(R.id.editText_username);
        mTextConfPassword = (EditText)findViewById(R.id.editText_confirm_password);
        mTextPassword = (EditText)findViewById(R.id.editText_password);
        mButtonRegister = (Button) findViewById(R.id.button_login);
        mTextViewLogin = (TextView)findViewById(R.id.textView_register);

        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LoginIntent = new Intent(RegisterActivity2.this,MainActivity.class);
                startActivity(LoginIntent);
            }
        });
    }
}