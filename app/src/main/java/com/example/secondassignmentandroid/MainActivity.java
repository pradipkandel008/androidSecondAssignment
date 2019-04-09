package com.example.secondassignmentandroid;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ActionBar actionBar;
    Button btn_q1,btn_q2,btn_q3,btn_q4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
    }

    public void initializeViews(){
        actionBar=getSupportActionBar();
        actionBar.setTitle("Android Assignment");
        actionBar.setSubtitle("By Pradip Kandel");
        btn_q1=(Button)findViewById(R.id.q1);
        btn_q1.setOnClickListener(this);

        btn_q2=(Button)findViewById(R.id.q2);
        btn_q2.setOnClickListener(this);

        btn_q3=(Button)findViewById(R.id.q3);
        btn_q3.setOnClickListener(this);

        btn_q4=(Button)findViewById(R.id.q4);
        btn_q4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.q1:
                Intent intent=new Intent(MainActivity.this,BMIActivity.class);
                startActivity(intent);
                break;
            case R.id.q2:
                Intent intent2=new Intent(MainActivity.this,NumToStringActivity.class);
                startActivity(intent2);
                break;
            case R.id.q3:
                Intent intent3=new Intent(MainActivity.this,TaxActivity.class);
                startActivity(intent3);
                break;
            case R.id.q4:
                Intent intent4=new Intent(MainActivity.this,VehicleActivity.class);
                startActivity(intent4);
                break;

        }

    }
}
