package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText etEmail,etPassword;
    Button btLogin, btSignup;

    String dummy_pass="1234", dummy_user="xp@gmail.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail= findViewById(R.id.etemail);
        etPassword= findViewById(R.id.etpassword);

        btLogin= findViewById(R.id.btLogin);
        btSignup= findViewById(R.id.btSignup);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String eml = etEmail.getText().toString().trim();
                String psd = etPassword.getText().toString().trim();

                if(eml.isEmpty()){
                    etEmail.setError("Required");
                    return;
                }
                if(psd.isEmpty()){
                    etPassword.setError("Required");
                    return;
                }


                if(!eml.equals(dummy_user)){
                    etEmail.setError("Incorrect");
                    return;

                }
                if(!psd.equals(dummy_pass)){
                    etPassword.setError("Incorrect");
                    return;
                }

                Intent xp = new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(xp);


            }
        });

    }
}