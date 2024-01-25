package com.example.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {

    ListView l;

    String mpesa[]
            ={"Send Money", "Withdraw Cash", "Loans and Savings", "Change PIN", "Lipa na MPESA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        l=findViewById(R.id.list);

        ArrayAdapter<String> arr;

        arr= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,mpesa);

        l.setAdapter(arr);

        // Handling Click Events in ListView
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    //clicked Send Money
                    startActivity(new Intent(MainActivity3.this, MainActivity4.class));
                }else if (position==1) {
                    //withdraw cash
                    startActivity(new Intent(MainActivity3.this, MainActivity4.class));
                }else {

                }
            }
        });





        }
    }