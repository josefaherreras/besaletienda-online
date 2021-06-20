package com.besaletiendaonline.tienda.online.jdbc;

import java.sql.*;
import java.util.Scanner;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://mdb-test.c6vunyturrl6.us-west-1.rds.amazonaws.com:3306/bsale_test","bsale_test", "bsale_test"
        );

        Scanner sc = new Scanner(System.in);
        //System.out.println("ingrese una pelicula");
        //String producto = sc.nextLine();
        String consulta = "SELECT  * FROM category";
        PreparedStatement ps = conn.prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.print(rs.getString("id")+": ");
            System.out.print(rs.getString("name")+": ");

        }
    }
}