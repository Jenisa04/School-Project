package com.example.ia;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class item_details extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    DatabaseHelper myDb;
    TextView textName, textPrice, textuName;
    EditText textQuantity, textSize, textId;
    Button btnGTC;
    Button btnVC;
    Button btnUC;
    Button btndDelete;
    ImageView item_image;

   // EditText s_quantity;
   // EditText s_size;
    Button button;
  //  CheckBox checkBox;
    TextView item_name;
    TextView item_price;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

        myDb = new DatabaseHelper(this);
        textName = findViewById(R.id.Ein);
        textPrice = findViewById(R.id.Eip);
        textQuantity = findViewById(R.id.quantity);
        textSize = findViewById(R.id.size);
        textId = findViewById(R.id.type_id);
        btnGTC = findViewById(R.id.cart);
        btnVC= findViewById(R.id.vc);
        btnUC= findViewById(R.id.update);
        btndDelete= findViewById(R.id.delete);
        textuName= findViewById(R.id.U_name);
        AddData();
        viewCart();
        UpdateData();
        deleteData();

        item_image=findViewById(R.id.image);
       // s_quantity = findViewById(R.id.quantity);
       // s_size = findViewById(R.id.size);
        button = findViewById(R.id.cart);
        //checkBox = findViewById(R.id.check);
        item_name = findViewById(R.id.Ein);
        item_price = findViewById(R.id.Eip);

        final Bundle bundle = getIntent().getExtras();
        String iname = bundle.get("thead").toString();
        item_name.setText(iname);

        String iprice = bundle.get("tprice").toString();
        item_price.setText(iprice);

      //  String uname= bundle.get("username").toString();
     //   textuName.setText(uname);

       // s_quantity.setOnItemSelectedListener(this);
       // s_size.setOnItemSelectedListener(this);

        List<String> quantities = new ArrayList<>();
        quantities.add("1");
        quantities.add("2");
        quantities.add("3");
        quantities.add("4");
        quantities.add("5");

        List<String> sizes = new ArrayList<>();
        sizes.add("Extra Small");
        sizes.add("Small");
        sizes.add("Medium");
        sizes.add("Large");
        sizes.add("Extra Large");

  /*      ArrayAdapter q_adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, quantities);
        q_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s_quantity.setAdapter(q_adapter);

        ArrayAdapter s_adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, sizes);
        s_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s_size.setAdapter(s_adapter);
*/


        }

    public void AddData () {
        btnGTC.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(textName.getText().toString(), textPrice.getText().toString(),
                                textQuantity.getText().toString(), textSize.getText().toString());

                        if (isInserted == true)
                            Toast.makeText(item_details.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(item_details.this, "Data Not Inserted", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
        public void viewCart(){
            btnVC.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1= new Intent(item_details.this,cart.class);
                        startActivity(intent1);

                 /*       Cursor res= myDb.getAllData();
                        if(res.getCount()== 0){
                            //show message
                            showMessage("Error", "No Data Found");
                            return;
                        }
                        StringBuffer buffer=new StringBuffer();
                        while (res.moveToNext()){
                            buffer.append("ID :" + res.getString(0) + "\n");
                            buffer.append("I_name :" + res.getString(1) + "\n");
                            buffer.append("I_price :" + res.getString(2) + "\n");
                            buffer.append("I_quantity :" + res.getString(3) + "\n");
                            buffer.append("I_size :" + res.getString(4) + "\n\n");
                        }

                        //show all data
                        showMessage("Data", buffer.toString());
                        Intent intent1= new Intent(item_details.this, cart.class);
                        intent1.putExtra("Data",buffer.toString());
                   */
                    }
                }
            );
        }

        public void UpdateData(){
            btnUC.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isUpdate = myDb.updateData(textId.getText().toString(),
                                    textName.getText().toString(), textPrice.getText().toString(),
                                    textQuantity.getText().toString(), textSize.getText().toString());
                        if(isUpdate == true)
                            Toast.makeText(item_details.this, "Data is Updated", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(item_details.this, "Data is not Updated", Toast.LENGTH_SHORT).show();

                    }
                }
            );
        }

        public void deleteData(){
        btndDelete.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer deletedRows = myDb.deleteData(textId.getText().toString());
                        if (deletedRows > 0)
                            Toast.makeText(item_details.this, "Data deleted", Toast.LENGTH_SHORT).show();
                        else
                            Toast.makeText(item_details.this, "Data is not deleted", Toast.LENGTH_SHORT).show();

                    }
                }
        );
        }


        public void showMessage(String title, String message){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.create();
            builder.setCancelable(true);
            builder.setTitle(title);
            builder.setMessage(message);
            builder.show();
        }


        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String q= parent.getItemAtPosition(position).toString();
        String s=parent.getItemAtPosition(position).toString();
       // Toast.makeText(parent.getContext(), "Selected "+q, Toast.LENGTH_SHORT).show();
       // Toast.makeText(parent.getContext(),"Selected "+s,Toast.LENGTH_SHORT).show();
        }


        @Override
        public void onNothingSelected (AdapterView < ? > parent){

        }

}

