package com.example.ia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class payment extends AppCompatActivity {

    Button button;
    EditText cno;
    EditText cvc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        button=findViewById(R.id.b1);
        cno=findViewById(R.id.et1);
        cvc=findViewById(R.id.et3);

       // cno.setFilters(new InputFilter[]{ new MinMaxFilter("5", "16")});
       // cvc.setFilters(new InputFilter[]{ new MinMaxFilter("2", "3")});
    }

    public void onClick(View view){
        Toast.makeText(this,"Payment Successful",Toast.LENGTH_SHORT).show();

    }
}
