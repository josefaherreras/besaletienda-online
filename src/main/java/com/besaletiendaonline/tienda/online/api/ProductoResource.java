package com.besaletiendaonline.tienda.online.api;

import com.besaletiendaonline.tienda.online.jdbc.dao.ProductoDAO;
import com.besaletiendaonline.tienda.online.jdbc.dto.Producto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoResource {

    //Obtener Productos
    @RequestMapping( method = RequestMethod.GET, value = "/producto/")
    public List<Producto> producto() throws SQLException {
        List<Producto> ProductoLista = new ProductoDAO().getPeliculas();
        return ProductoLista;
    }
}
