package com.example.ia;


import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class fds_activity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<fds_item> listItems;
    //fds_adapter mAdapter;
    Context context;
    CardView cardView;
    ImageView imageView;


    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fds);
        cardView=findViewById(R.id.card);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        recyclerView.setLayoutManager(layoutManager);
        imageView=findViewById(R.id.image);
         //adapter = new fds_adapter(listItems);
        initializeData();
        initializeAdapter();

    }


    protected void initializeData(){
        listItems=new ArrayList<>();
        listItems.add(new fds_item("Shirt","Price" ));
        listItems.add(new fds_item("T-Shirt","Price"));
        listItems.add(new fds_item("Trouser","Price"));
        listItems.add(new fds_item("CAS T-Shirt","Price"));
        listItems.add(new fds_item("CAS Skirt","Price"));
        listItems.add(new fds_item("Socks","Price"));
        listItems.add(new fds_item("Blazer","Price"));
        listItems.add(new fds_item("Skirt","Price"));
        listItems.add(new fds_item("Football Stockings","Price"));
        listItems.add(new fds_item("Swim Wear","Price"));
    }

    protected void initializeAdapter(){
        fds_adapter adapter=new fds_adapter(listItems, new fds_adapter.OnItemClickListener() {
            @Override
            public void onItemClick(fds_item item)

            {
                item.getHead();
                Toast.makeText(getBaseContext(), "Selected "+item.getHead(), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(fds_activity.this,item_details.class);
                intent.putExtra("thead", item.getHead());
                intent.putExtra("tprice", item.getPrice());
                startActivity(intent);


                if("thead" == "Shirt"){
                    imageView.setImageResource(R.drawable.shirt);
                }
                else if ("thead" == "T-Shirt"){
                    imageView.setImageResource(R.drawable.ic_laptop_black_24dp);
                }
                else if ("thead" == "Trouser"){
                    imageView.setImageResource(R.drawable.ic_launch_black_24dp);
                }
                else if ("thead" == "CAS T-Shirt"){
                    imageView.setImageResource(R.drawable.lens);
                }
                else if ("thead" == "CAS Skirt"){
                    imageView.setImageResource(R.drawable.local_phone);
                }
                else if ("thead" == "Socks"){
                    imageView.setImageResource(R.drawable.music_note);
                }
                else if ("thead" == "Blazer"){
                    imageView.setImageResource(R.drawable.smile);
                }
                else if ("thead" == "Skirt"){
                    imageView.setImageResource(R.drawable.headset);
                }
                else if ("thead" == "Football Stockings"){
                    imageView.setImageResource(R.drawable.headset);
                }
                else if ("thead" == "Swim Wear"){
                    imageView.setImageResource(R.drawable.headset);
                }
            }
        });
        recyclerView.setAdapter(adapter);
        //recyclerView
    }
}

