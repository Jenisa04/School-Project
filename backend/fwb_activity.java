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

public class fwb_activity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<fwb_item> listItems;
    //fds_adapter mAdapter;
    Context context;
    CardView cardView;


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fwb);
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
        listItems.add(new fwb_item("Shirt","Price"));
        listItems.add(new fwb_item("T-Shirt","Price"));
        listItems.add(new fwb_item("Trouser","Price"));
        listItems.add(new fwb_item("CAS T-Shirt","Price"));
        listItems.add(new fwb_item("CAS Skirt","Price"));
        listItems.add(new fwb_item("Socks","Price"));
        listItems.add(new fwb_item("Blazer","Price"));
        listItems.add(new fwb_item("Skirt","Price"));
        listItems.add(new fwb_item("Football Stockings","Price"));
        listItems.add(new fwb_item("Swim Wear","Price"));
    }

    protected void initializeAdapter(){
        fwb_adapter adapter=new fwb_adapter(listItems, new fwb_adapter.OnItemClickListener() {
            @Override
            public void onItemClick(fwb_item item)

            {
                item.getHead();
                Toast.makeText(getBaseContext(), "Item CLicked", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(fwb_activity.this,item_details.class);
                intent.putExtra("thead", item.getHead());
                intent.putExtra("tprice", item.getPrice());
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(adapter);
    }

}

