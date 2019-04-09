package com.example.secondassignmentandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class NumToStringActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et_number;
    Button btn_convert;
    TextView tv_result;
    String getNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_to_string);
        initializeViews();
    }

    public void initializeViews(){
        et_number=(EditText)findViewById(R.id.et_number);
        btn_convert=(Button)findViewById(R.id.btn_convert);
        tv_result=(TextView)findViewById(R.id.tv_result);
        btn_convert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_convert:
                getNumber=et_number.getText().toString();
                String result=EnglishNumberToWords.convert(Integer.parseInt(getNumber));
                tv_result.setText(result);

        }
    }
}

