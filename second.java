package com.example.ia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class second extends AppCompatActivity {
    Button button;
    RadioGroup rg1,rg2;
    RadioButton rb1, rb2,rb3,rb4,rb5;
    Button back_btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rg1 = findViewById(R.id.st);
        rg2=findViewById(R.id.g);

        back_btn=findViewById(R.id.backb);
        button = findViewById(R.id.nextb);
        int s1 = rg1.getCheckedRadioButtonId();
        rb1=findViewById(R.id.ds);
        rb2=findViewById(R.id.wb);
        rb3=findViewById(R.id.tb);
        rb4=findViewById(R.id.female);
        rb5=findViewById(R.id.male);
        textView=findViewById(R.id.u1);

        String username= getIntent().getStringExtra("username");
        textView.setText("Username: " +username);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1=new Intent(second.this,MainActivity.class);
                startActivity(intent1);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rb1.isChecked() && rb4.isChecked()){
                    Intent intent1=new Intent(second.this,fds_activity.class);

                    startActivity(intent1);
                }
                else if (rb1.isChecked() && rb5.isChecked()){
                    Intent intent2= new Intent(second.this,mds_activity.class);
                    startActivity(intent2);
                }

                else if (rb2.isChecked()&& rb4.isChecked()){
                    Intent intent3=new Intent(second.this,fwb_activity.class);
                    startActivity(intent3);
                }
                else if(rb2.isChecked()&& rb5.isChecked()){
                    Intent intent4=new Intent(second.this,mwb_activity.class);
                    startActivity(intent4);
                }
                else if (rb3.isChecked()&&rb4.isChecked()){
                    Intent intent5= new Intent(second.this,ftb_activity.class);
                    startActivity(intent5);
                }

                else if (rb3.isChecked()&& rb5.isChecked()){
                    Intent intent6=new Intent(second.this,mtb_activity.class);
                    startActivity(intent6);
                }

                else if (rb1.isChecked()!=true || rb2.isChecked()!=true || rb3.isChecked()!=true && rb4.isChecked()!=true || rb5.isChecked()!=true){
                    Toast.makeText(second.this,"Please choose the options",Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}


