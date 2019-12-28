package com.example.ia;

import android.content.Intent;
import android.widget.ImageView;

public class fds_item {

    private String head;
    private String price;

    public fds_item(String head, String price) {
        this.head = head;
        this.price = price;

    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}

