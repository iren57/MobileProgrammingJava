package com.example.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ReceiptDisplay extends AppCompatActivity {

    TextView textView,textView2,textView3,textView4,textView5,textView6;

    Button button5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt_display);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        button5=findViewById(R.id.button5);

        //receive the price of bread
        Intent intent=getIntent();
        Integer bread=intent.getIntExtra("id1",0);
        textView2.setText(bread.toString());
        Integer milk=intent.getIntExtra("id2",0);
        textView4.setText(milk.toString());
        Integer butter=intent.getIntExtra("id3",0);
        textView6.setText(butter.toString());

        //link to activity
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}