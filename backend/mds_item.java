package com.example.ia;

public class mds_item {

    private String head;
    private String price;

    public mds_item(String head, String price) {
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