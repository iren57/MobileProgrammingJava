package com.example.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextText,editTextText2,editTextText3,editTextText4;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize views
        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        editTextText3 = findViewById(R.id.editTextText3);
        editTextText4 = findViewById(R.id.editTextText4);
        button=findViewById(R.id.button);

        //create click listener on the button
        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                Integer bread=Integer.parseInt(editTextText.getText().toString());
                Integer milk=Integer.parseInt(editTextText2.getText().toString());
                Integer butter=Integer.parseInt(editTextText3.getText().toString());
                Integer total=bread + milk + butter;
                editTextText4.setText(total.toString());


                Intent intent= new Intent(getApplicationContext(), ReceiptDisplay.class);
                intent.putExtra("id1", bread);
                intent.putExtra("id2", milk);
                intent.putExtra("id3", butter);
                startActivity(intent);

            }
        });
    }
}