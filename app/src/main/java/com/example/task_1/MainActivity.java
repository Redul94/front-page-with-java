package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameText,idText,phoneText;
    TextView displayName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = findViewById(R.id.nameId);
        idText = findViewById(R.id.idOne);
        phoneText = findViewById(R.id.phoneId);
        displayName = findViewById(R.id.fullInfoId);
    }

    public void toastFunction(View view) {
        String name = nameText.getText().toString();
        String eid = idText.getText().toString();
        String phone = phoneText.getText().toString();
        displayName.setText(name +  " "+ eid +" " + phone);
//        Toast.makeText(this, "Hello"+" "+name+" "+"Your id is"+" "+"and phone number is"+ phone, Toast.LENGTH_SHORT).show();
    }
}