package com.example.ia;

public class mtb_item {

    private String head;
    private String price;

    public mtb_item(String head, String price) {
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
