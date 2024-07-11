package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/EstudiantesA24";
        String user="root";
        String password="123456";

        String nombre="Santiago Cumbal";
        String cedula="1753653458";
        double b1=12.4;
        double b2=10.4;
        String sql="INSERT INTO estudiantesA(cedula,nombre,b1,b2) VALUES(?,?,?,?)";
        try(Connection connection= DriverManager.getConnection(url,user,password)){
            System.out.println("Conexion exitosa");
         PreparedStatement cadenaPreparada=connection.prepareStatement(sql);
         cadenaPreparada.setString(1,cedula);
         cadenaPreparada.setString(2,nombre);
         cadenaPreparada.setDouble(3,b1);
         cadenaPreparada.setDouble(4,b2);
         cadenaPreparada.executeUpdate();

        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}