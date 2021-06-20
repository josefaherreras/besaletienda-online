package com.besaletiendaonline.tienda.online.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static Connection connection = null;
    //private static String connectionString = ("jdbc:mysql://mdb-test.c6vunyturrl6.us-west-1.rds.amazonaws.com:3306/bsale_test","bsale_test", "bsale_test");

    public static Connection obtenerConexion() throws SQLException {
        if(connection==null)
            connection = DriverManager.getConnection("jdbc:mysql://mdb-test.c6vunyturrl6.us-west-1.rds.amazonaws.com:3306/bsale_test","bsale_test", "bsale_test");
        return connection;
    }
}
