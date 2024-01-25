package com.example.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    EditText editTextText5,editTextText6;

    Button button6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //initialize views
        editTextText5=findViewById(R.id.editTextText5);
        editTextText6=findViewById(R.id.editTextText6);
        button6=findViewById(R.id.button6);

        //
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity4.this,"Successful transaction", Toast.LENGTH_SHORT).show();
            }
        });

    }
}