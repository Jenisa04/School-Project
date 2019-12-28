package com.example.ia;

import org.w3c.dom.Text;

public class Item {
    private String ItemName;
    private String ItemPrice;
    private String ItemQuantity;
    private String ItemSize;

    public Item(String itemName, String itemPrice, String itemQuantity, String itemSize) {
        ItemName = itemName;
        ItemPrice = itemPrice;
        ItemQuantity = itemQuantity;
        ItemSize = itemSize;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getItemPrice() {
        return ItemPrice;
    }

    public String getItemQuantity() {
        return ItemQuantity;
    }

    public String getItemSize() {
        return ItemSize;
    }
}
