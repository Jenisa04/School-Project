package com.example.ia;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class cart extends AppCompatActivity {

    DatabaseHelper myDb;
    ArrayList itemList;
    ListView listView;
    Item item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        myDb= new DatabaseHelper(this);

        itemList = new ArrayList();
        Cursor data = myDb.getAllData();
        int numRows = data.getCount();
        if(numRows == 0 ){
            Toast.makeText(cart.this, "The cart is empty", Toast.LENGTH_SHORT);
        }

        else{
            while (data.moveToNext()) {
                item = new Item(data.getString(1), data.getString(2),
                        data.getString(3), data.getString(4));
                itemList.add(item);
            }
            item_list_adapter adapter = new item_list_adapter(this, R.layout.cart_adapter_view, itemList);
                listView = findViewById(R.id.list);
                listView.setAdapter(adapter);

        }


    }

}
