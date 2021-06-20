package com.besaletiendaonline.tienda.online.jdbc.dto;

public class Categoria {
    private int id;
    private String name;

    public Categoria(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
