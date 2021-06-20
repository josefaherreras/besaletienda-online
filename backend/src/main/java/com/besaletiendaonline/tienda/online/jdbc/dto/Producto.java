package com.besaletiendaonline.tienda.online.jdbc.dto;

public class Producto {
    private int id;
    private String name;
    private String url_image;
    private float price;
    private int discount;
    private int category;

    public Producto(int id, String name, String url_image, float price, int discount, int category) {
        this.id = id;
        this.name = name;
        this.url_image = url_image;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl_image() {
        return url_image;
    }

    public float getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }

    public int getCategory() {
        return category;
    }
}
