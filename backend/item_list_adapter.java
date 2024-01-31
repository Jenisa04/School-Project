package com.example.ia;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class item_list_adapter extends ArrayAdapter<Item> {

    private LayoutInflater mInflater;
    private ArrayList<Item> items;
    private int mViewResourceId;

    public item_list_adapter(Context context, int textViewResourceId, ArrayList items) {
        super(context, textViewResourceId, items);
        this.items = items;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView (int position, View convertView, ViewGroup parents){
        convertView = mInflater.inflate(mViewResourceId,null);

        Item item = items.get(position);

        if ((item != null)){
            TextView itemName = convertView.findViewById(R.id.item_name);
            TextView itemPrice = convertView.findViewById(R.id.item_price);
            TextView itemQuantity = convertView.findViewById(R.id.item_quantity);
            TextView itemSize = convertView.findViewById(R.id.item_size);

            if (itemName != null){
                itemName.setText(item.getItemName());
            }

            if (itemPrice != null){
                itemPrice.setText(item.getItemPrice());
            }

            if (itemQuantity != null){
                itemQuantity.setText(item.getItemQuantity());
            }

            if (itemSize != null){
                itemSize.setText(item.getItemSize());
            }
        }
        return convertView;
    }
}