package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email,password,contactno;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        contactno = (EditText) findViewById(R.id.contactno);
        submit = (Button) findViewById(R.id.submit);

}
    public void openGetData(View view) {
        //get data
        String Name = name.getText().toString();
        String Email = email.getText().toString();
        String Password = password.getText().toString();
        String Contactno = contactno.getText().toString();

        //calling activity and sending data
        Intent intent=new Intent(MainActivity.this,GetData.class);
        intent.putExtra("name",Name);
        intent.putExtra("email",Email);
        intent.putExtra("password",Password);
        intent.putExtra("contactno",Contactno);
        startActivity(intent);
    }
}