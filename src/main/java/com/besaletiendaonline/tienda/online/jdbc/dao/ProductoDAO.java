package com.besaletiendaonline.tienda.online.jdbc.dao;

import com.besaletiendaonline.tienda.online.jdbc.ConnectionManager;
import com.besaletiendaonline.tienda.online.jdbc.dto.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductoDAO {
    private Connection connection;

    public ProductoDAO() throws SQLException {
        connection = ConnectionManager.obtenerConexion();
    }
    //Obtener Producto
    public List<Producto> getPeliculas() throws SQLException {
        String sql = "SELECT * FROM product";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Producto> producto = new ArrayList<>();
        Producto p = null;
        while (rs.next()) {
                    p = new Producto( rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("url_image"),
                    rs.getFloat("price"),
                    rs.getInt("discount"),
                    rs.getInt("category"));

            producto.add(p);
        }
        return producto;
    }
}
