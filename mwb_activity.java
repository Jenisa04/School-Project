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

public class mwb_activity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<mwb_item> listItems;
    //fds_adapter mAdapter;
    Context context;
    CardView cardView;


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mwb);
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
        listItems.add(new mwb_item("Shirt","Price"));
        listItems.add(new mwb_item("T-Shirt","Price"));
        listItems.add(new mwb_item("Trouser","Price"));
        listItems.add(new mwb_item("CAS T-Shirt","Price"));
        listItems.add(new mwb_item("CAS Skirt","Price"));
        listItems.add(new mwb_item("Socks","Price"));
        listItems.add(new mwb_item("Blazer","Price"));
        listItems.add(new mwb_item("Skirt","Price"));
        listItems.add(new mwb_item("Football Stockings","Price"));
        listItems.add(new mwb_item("Swim Wear","Price"));
    }

    protected void initializeAdapter(){
        mwb_adapter adapter=new mwb_adapter(listItems, new mwb_adapter.OnItemClickListener() {
            @Override
            public void onItemClick(mwb_item item)

            {
                item.getHead();
                Toast.makeText(getBaseContext(), "Item CLicked", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(mwb_activity.this,item_details.class);
                intent.putExtra("thead", item.getHead());
                intent.putExtra("tprice", item.getPrice());
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(adapter);
    }
}
