package com.example.ia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText text1;
    EditText text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.sign_in);
        text1=findViewById(R.id.et1);
        text2=findViewById(R.id.et2);

        global.SaveUser1(MainActivity.this, "user1", "user1");
        global.SaveUser2(MainActivity.this, "user2","user2");
        global.SaveUser3(MainActivity.this,"user3","user3");
        global.SaveUser4(MainActivity.this,"user4","user4");
        global.SaveUser5(MainActivity.this,"user5","user5");
        global.SaveUser6(MainActivity.this,"user6","user6");
        global.SaveUser7(MainActivity.this,"user7","user7");
        global.SaveUser8(MainActivity.this,"user8", "user8");
        global.SaveUser9(MainActivity.this,"user9", "user9");
        global.SaveUser10(MainActivity.this,"user10","user10");
    }


    public void onClick(View view){


        if(global.CheckUser1(MainActivity.this,text1.getText().toString(),text2.getText().toString() )) {
            String username= text1.getText().toString();
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
            intent.putExtra("username", username);
        }

        else if(global.CheckUser2(MainActivity.this,text1.getText().toString(),text2.getText().toString() )) {
            String username= text1.getText().toString();
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
            intent.putExtra("username",username);
        }

        else if (global.CheckUser3(MainActivity.this,text1.getText().toString(),text2.getText().toString())){
            String username= text1.getText().toString();
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
            intent.putExtra("username",username);
        }

        else if (global.CheckUser4(MainActivity.this,text1.getText().toString(),text2.getText().toString())){
            String username= text1.getText().toString();
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
            intent.putExtra("username",username);
        }

        else if (global.CheckUser5(MainActivity.this,text1.getText().toString(),text2.getText().toString())){
            String username= text1.getText().toString();
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
            intent.putExtra("username",username);
        }

        else if (global.CheckUser6(MainActivity.this,text1.getText().toString(),text2.getText().toString())){
            String username= text1.getText().toString();
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
            intent.putExtra("username",username);
        }

        else if(global.CheckUser7(MainActivity.this,text1.getText().toString(),text2.getText().toString())){
            String username= text1.getText().toString();
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
            intent.putExtra("username",username);
        }

        else if(global.CheckUser8(MainActivity.this,text1.getText().toString(),text2.getText().toString())){
            String username= text1.getText().toString();
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
            intent.putExtra("username",username);
        }

        else if (global.CheckUser9(MainActivity.this,text1.getText().toString(),text2.getText().toString())){
            String username= text1.getText().toString();
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
            intent.putExtra("username",username);
        }

        else if (global.CheckUser10(MainActivity.this,text1.getText().toString(),text2.getText().toString())){
            String username= text1.getText().toString();
            Intent intent = new Intent(MainActivity.this, second.class);
            startActivity(intent);
            intent.putExtra("username",username);
        }

        else {
            Toast.makeText(this, "Incorrect Username and Password", Toast.LENGTH_SHORT).show();
        }
    }
 }
