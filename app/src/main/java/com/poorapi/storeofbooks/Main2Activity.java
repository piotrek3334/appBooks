package com.poorapi.storeofbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private Button login, register;
    private EditText email, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        login = (Button) findViewById(R.id.butLogin);
        register = (Button) findViewById(R.id.butRegister);
    }
}
