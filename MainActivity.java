package com.example.databasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity
{

   // DatabaseReference databaseReference;
    EditText editText_name;
    EditText editText_Username;

    EditText editText_dob;
    EditText editText_email;
    EditText editText_password;
    EditText editText_voterid;
    EditText editText_pno;


    TextView testlic;


    Button save_button;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //     databaseReference = FirebaseDatabase.getInstance().getReference();

        editText_name = (EditText) findViewById(R.id.editText2);
        editText_Username = (EditText) findViewById(R.id.editText4);
        editText_dob = (EditText) findViewById(R.id.editText5);
        editText_email = (EditText) findViewById(R.id.editText6);
        editText_password = (EditText) findViewById(R.id.editText7);
        editText_voterid = (EditText) findViewById(R.id.editText10);
        editText_pno = (EditText) findViewById(R.id.editText25);


        save_button = (Button) findViewById(R.id.button2);


        testlic=findViewById(R.id.textView16);
        testlic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,learners_licence_screen.class);
                startActivity(i);
            }
        });


        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                saveInfo();
            }
        });


    }

    public void saveInfo()
    {
        String name = editText_name.getText().toString().trim();

        String username = editText_Username.getText().toString().trim();
        String dob = editText_dob.getText().toString().trim();
        String email = editText_email.getText().toString().trim();
        String password = editText_password.getText().toString().trim();
        String voterid = editText_voterid.getText().toString().trim();
        String mobile = editText_pno.getText().toString().trim();


        if(name.isEmpty())
        {
            editText_name.setError("Please enter your name ");
            editText_name.requestFocus();
            return;
        }
        if (username.isEmpty())
        {
            editText_Username.setError("Username cannot be empty");
            editText_Username.requestFocus();
            return;
        }
        if(dob.isEmpty())

        {
            editText_dob.setError("dob cannot be empty");
            editText_dob.requestFocus();
            return;
        }
        if(email.isEmpty())
        {
            editText_email.setError("Email address cannot be empty");
            editText_email.requestFocus();
            return;
        }
        if (password.isEmpty())

        {
            editText_password.setError("please enter your password");
            editText_password.requestFocus();
            return;
        }
    //    if(confirmpass.isEmpty())

       // {
      //      e8.setError("confirm password cannnot be empty");
      //      e8.requestFocus();
     //       return;
      //  }
     //   //   if(e7.getText().toString()!= e8.getText().toString())
        //   {
        //       e8.setError("confirm password should be same ");
        //       e8.requestFocus();
        //       return;
        //   }

        if (voterid.isEmpty())
        {
            editText_voterid.setError("Voters id is mandatory");
            editText_voterid.requestFocus();
            return;
        }
        if  (mobile.isEmpty()||mobile.length()<10)
        {
            editText_pno.setError("Enter a valid mobile");
            editText_pno.requestFocus();
            return;
        }

  //     String id = databaseReference.push().getKey();
  //      UserInformation userInformation = new UserInformation(id, name, username, dob, email, password, voterid, mobile);
  //      databaseReference.child(id).setValue(userInformation);
   //     Toast.makeText(this, "Stored successfully", Toast.LENGTH_LONG).show();
        Intent i = new Intent(MainActivity.this, verify_otp.class);

        //i.putExtra("id", id);
        i.putExtra("name ", name);
        i.putExtra("username ", username);
        i.putExtra("dob ", dob);
        i.putExtra("email ", email);
        i.putExtra("password ", password);
        i.putExtra("voterid", voterid);
        i.putExtra("mobile", mobile);



        startActivity(i);
    }
}
