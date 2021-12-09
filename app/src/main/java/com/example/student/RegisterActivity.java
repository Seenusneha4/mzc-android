package com.example.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    AppCompatButton b2,b1;
    String getName,getAddress,getPhoneNumber,getEmail,getUsername,getPassword,getConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ed1=(EditText)findViewById(R.id.name);
        ed2=(EditText)findViewById(R.id.address);
        ed3=(EditText)findViewById(R.id.phone_number);
        ed4=(EditText)findViewById(R.id.email);
        ed5=(EditText)findViewById(R.id.username);
        ed6=(EditText)findViewById(R.id.password);
        ed7=(EditText)findViewById(R.id.confirm_password);
        b2=(AppCompatButton)findViewById(R.id.register);
        b1=(AppCompatButton)findViewById(R.id.backlogin);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=ed1.getText().toString();
                getAddress=ed2.getText().toString();
                getPhoneNumber=ed3.getText().toString();
                getEmail=ed4.getText().toString();
                getUsername=ed5.getText().toString();
                getPassword=ed6.getText().toString();
                getConfirmPassword=ed7.getText().toString();
                Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getAddress,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getPhoneNumber,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getEmail,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getUsername,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),getConfirmPassword,Toast.LENGTH_LONG).show();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}