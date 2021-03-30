package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class GetData extends AppCompatActivity {

    TextView name,email,pass,contactno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);
        name=(TextView)findViewById(R.id.txname);
        email=(TextView)findViewById(R.id.txemail);
        pass=(TextView)findViewById(R.id.txpass);
        contactno=(TextView)findViewById(R.id.txcono);

        Intent intent=getIntent();
        String d_name=intent.getStringExtra("name");
        String d_email=intent.getStringExtra("email");
        String d_pass=intent.getStringExtra("password");
        String d_contacno=intent.getStringExtra("contactno");

        name.setText("Name - "+d_name);
        email.setText("Email - "+d_email);
        pass.setText("Password - "+d_pass);
        contactno.setText("Contact no - "+d_contacno);

        Toast.makeText(this,"Welcome"+" "+d_name+" ",Toast.LENGTH_SHORT).show();

    }
}