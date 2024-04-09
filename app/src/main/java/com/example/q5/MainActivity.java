package com.example.q5;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    EditText n,e,p;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        n=findViewById(R.id.name);
        e=findViewById(R.id.email);
        p=findViewById(R.id.pass);

        b=findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = n.getText().toString();
                String email = e.getText().toString();
                String password = p.getText().toString();

                if(name.isEmpty()||email.isEmpty()||password.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Fill all the fields",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFULLY",Toast.LENGTH_SHORT).show();
                }
            }
        });

        }
    }
