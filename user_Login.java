package com.example.databasetest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;


public class user_Login extends AppCompatActivity
{

    TextView newUser;

    EditText usernametext, passwordtext;
    Button Login;

    FirebaseAuth mfirebaseauth;
    private ProgressDialog mLoginProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__login);

        mfirebaseauth = FirebaseAuth.getInstance();
        usernametext = (EditText) findViewById(R.id.editText);
        final String username = usernametext.getText().toString();

        passwordtext = (EditText) findViewById(R.id.editText3);
        final String password = passwordtext.getText().toString();

        newUser=(TextView)findViewById(R.id.textView4);
        newUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(user_Login.this,vehicle_registration.class);
                startActivity(i);
            }
        });

        Login = (Button) findViewById(R.id.button);


    }
}
