package com.example.firebaseauth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class test extends AppCompatActivity {

    Button login, add, logout;
    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        login = findViewById(R.id.login);
        add = findViewById(R.id.adds);
        logout = findViewById(R.id.logout);
        txt = findViewById(R.id.txt);

        add.setEnabled(false);
        logout.setEnabled(false);

        login();
        add();
        logout();
    }

    private void add() {
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = txt.getText().toString();
                Toast.makeText(test.this, "" + n, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void login() {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login.setEnabled(false);
                add.setEnabled(true);
                logout.setEnabled(true);
            }
        });
    }

    private void logout() {
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login.setEnabled(true);
                add.setEnabled(false);
                logout.setEnabled(false);
                txt.setText("");
            }
        });

    }
}
