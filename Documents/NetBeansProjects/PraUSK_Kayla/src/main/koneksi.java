/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.*;

/**
 *
 * @author kayla
 */
public class koneksi {
    private Connection connect;
    private String username = "root";
    private String password = "";
    private String jdbc = "jdbc:mysql://localhost:3306/konversi";
    
    public Connection getKoneksi(){
        if(connect == null){
            try{
                connect = DriverManager.getConnection(jdbc, username, password);
                System.out.println("Koneksi Berhasil");
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }
        return connect;
    }
    
    public static void main(String[] args){
        koneksi k = new koneksi();
        Connection c = k.getKoneksi();
    }
}
