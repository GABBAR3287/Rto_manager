package com.example.databasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

import com.google.firebase.database.FirebaseDatabase;


public class learners_licence_screen extends AppCompatActivity {


    DatabaseReference databaseReference;

    EditText applicantName;
    EditText gaurdianName;
    EditText permanent_address;
    EditText temporary_address;

    EditText duration_of_stay;
    EditText DOB;
    EditText migration;
    EditText educational_qualification;
    EditText identification_mark;
    EditText blood_group;
    EditText existing_driving_licence;
    EditText date_of_conviction;

    EditText disqualified;
    EditText driving_test;

    Button saveLicInfo;

  //  String mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learners_licence_screen);

        databaseReference= FirebaseDatabase.getInstance().getReference().child("Learners_Lic");

        applicantName=(EditText)findViewById(R.id.editText41);
    gaurdianName=(EditText)findViewById(R.id.editText43);
        permanent_address=(EditText)findViewById(R.id.editText46);
        temporary_address=(EditText)findViewById(R.id.editText47);
        duration_of_stay=(EditText)findViewById(R.id.editText48);
        DOB=(EditText)findViewById(R.id.editText49);
        migration=(EditText)findViewById(R.id.editText50);
        educational_qualification   =(EditText)findViewById(R.id.editText51);
        identification_mark =(EditText)findViewById(R.id.editText52);
        blood_group =(EditText)findViewById(R.id.editText53);
        existing_driving_licence  =(EditText)findViewById(R.id.editText54);
        date_of_conviction  =(EditText)findViewById(R.id.editText55);
        disqualified  =(EditText)findViewById(R.id.editText56);
        driving_test  =(EditText)findViewById(R.id.editText57);



        saveLicInfo=(Button)findViewById(R.id.button18);

                    saveLicInfo.setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View v)
                        {
                         // Toast.makeText(getApplicationContext(),"Before func",Toast.LENGTH_LONG).show();
                            saveLicInformation();
                        //    Toast.makeText(getApplicationContext(),"after func",Toast.LENGTH_LONG).show();
                        }
                    });



    }

    public void saveLicInformation()
    {

            String appName = applicantName.getText().toString().trim();
            String gdianName = gaurdianName.getText().toString().trim();
            String paddress = permanent_address.getText().toString().trim();
            String taddress = temporary_address.getText().toString().trim();
            String d_sty = duration_of_stay.getText().toString().trim();
            String dob = DOB.getText().toString().trim();
            String mig = migration.getText().toString().trim();
            String equalification = educational_qualification.getText().toString().trim();
            String idmark = identification_mark.getText().toString().trim();
            String bgroup = blood_group.getText().toString().trim();
            String existingdrivinglicence = existing_driving_licence.getText().toString().trim();
            String dateofconviction = date_of_conviction.getText().toString().trim();
            String disqualificationdetails = disqualified.getText().toString().trim();
            String drivingtest = driving_test.getText().toString().trim();



        String id = databaseReference.push().getKey();
        UserLicInformation userLicInformation = new UserLicInformation(id, appName, gdianName, paddress, taddress, d_sty, dob, mig, equalification, idmark, bgroup, existingdrivinglicence, dateofconviction, disqualificationdetails, drivingtest);
        databaseReference.child(id).setValue(userLicInformation);
        Toast.makeText(this, "Stored successfully", Toast.LENGTH_LONG).show();



    }




}
