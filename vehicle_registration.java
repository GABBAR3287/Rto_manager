package com.example.databasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class vehicle_registration extends AppCompatActivity {

    DatabaseReference databaseReference;
    EditText cc;
    EditText typeOfbody;
    EditText chassisno;

    EditText makersName;
    EditText engineno;
    EditText unladenweight;
    EditText axeltype ,ownersname, colour,noofclinders;


    Spinner s1;
    Spinner s2;
    Spinner s3;
    DatePicker d1;


    Button saveveh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_registration);
        databaseReference= FirebaseDatabase.getInstance().getReference().child("Veh_Reg");
        cc=(EditText)findViewById(R.id.editText33);
        typeOfbody=(EditText)findViewById(R.id.editText13);
        chassisno=(EditText)findViewById(R.id.editText14);
        makersName=(EditText)findViewById(R.id.editText15);
        engineno=(EditText)findViewById(R.id.editText16);

        unladenweight=(EditText)findViewById(R.id.editText17);
        axeltype=(EditText)findViewById(R.id.editText18);
        noofclinders=(EditText)findViewById(R.id.editText20);

        colour=(EditText)findViewById(R.id.editText19);
        ownersname=(EditText)findViewById(R.id.editText21);



        s1 = (Spinner) findViewById(R.id.spinner);
        s2 = (Spinner) findViewById(R.id.spinner2);
        s3 = (Spinner) findViewById(R.id.spinner3);
        d1 = (DatePicker) findViewById(R.id.datePicker);

        additemsonspinners1();
        additemsonspinner2();
        additemsonspinner3();


        saveveh=(Button)findViewById(R.id.button5);
        saveveh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveVehinfo();
            }
        });


    }

    public void additemsonspinners1()
    {
        List<String> list = new ArrayList<String>();

        list.add("LMW");
        list.add("HMV");
        list.add("MCWG");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(dataAdapter);

    }


    public void additemsonspinner2() {
        List<String> list = new ArrayList<String>();
        list.add("Commercial");
        list.add("Non-Commercial");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(dataAdapter);

    }

    public void additemsonspinner3() {
        List<String> list = new ArrayList<String>();
        list.add("Petrol");
        list.add("Diesel");
        list.add("CNG");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s3.setAdapter(dataAdapter);

    }

    private void saveVehinfo()
    {
        String    classofvehicle=s1.getSelectedItem().toString().trim();
    String typeofbody1= typeOfbody.getText().toString().trim();
    String   makersname1=makersName.getText().toString().trim();
    String    purpose=s2.getSelectedItem().toString().trim();
    String   axeltype1=axeltype.getText().toString().trim();
    String noofcylinder1=ownersname.getText().toString().trim();
    String ownersname1=ownersname.getText().toString().trim();
    String Cc=cc.getText().toString().trim();
    String   chassisno1=chassisno.getText().toString().trim();
    String unladenweigh1=unladenweight.getText().toString().trim();

    String color  =colour.getText().toString().trim();
    String  fuel=s3.getSelectedItem().toString().trim();
    String  engineno1=engineno.getText().toString().trim();

    String id = databaseReference.push().getKey();
    UserVehInformation uservehInformation = new UserVehInformation(id,classofvehicle,typeofbody1,makersname1,purpose,axeltype1,noofcylinder1,ownersname1,Cc,chassisno1,unladenweigh1,color,fuel,engineno1);
    databaseReference.child(id).setValue(uservehInformation);
    Toast.makeText(this, "Stored successfully", Toast.LENGTH_LONG).show();


    }



}
