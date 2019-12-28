package com.example.ia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ftb_activity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<ftb_item> listItems;
    //fds_adapter mAdapter;
    Context context;
    CardView cardView;


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ftb);
        cardView=findViewById(R.id.card);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);

        initializeData();
        initializeAdapter();

    }


    protected void initializeData(){
        listItems=new ArrayList<>();
        listItems.add(new ftb_item("Shirt","Price"));
        listItems.add(new ftb_item("T-Shirt","Price"));
        listItems.add(new ftb_item("Trouser","Price"));
        listItems.add(new ftb_item("CAS T-Shirt","Price"));
        listItems.add(new ftb_item("CAS Skirt","Price"));
        listItems.add(new ftb_item("Socks","Price"));
        listItems.add(new ftb_item("Blazer","Price"));
        listItems.add(new ftb_item("Skirt","Price"));
        listItems.add(new ftb_item("Football Stockings","Price"));
        listItems.add(new ftb_item("Swim Wear","Price"));
    }

    protected void initializeAdapter(){

            ftb_adapter adapter=new ftb_adapter(listItems, new ftb_adapter.OnItemClickListener() {
                @Override
                public void onItemClick(ftb_item item)

                {
                    item.getHead();
                    Toast.makeText(getBaseContext(), "Item CLicked", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(ftb_activity.this,item_details.class);
                    intent.putExtra("thead", item.getHead());
                    intent.putExtra("tprice", item.getPrice());
                    startActivity(intent);
                }
            });
            recyclerView.setAdapter(adapter);
        }

    }






