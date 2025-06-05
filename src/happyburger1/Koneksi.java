/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package happyburger1;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author damha
 */
public class Koneksi {
public Connection conn;
    
    public Koneksi (){
            try{
                Class.forName("org.postgresql.Driver").newInstance();
                String url = "jdbc:postgresql://localhost:5432/DBL_A_HappyBurger_Kel7";
                String user = "postgres";
                String password = "123456";
                try {
                    conn = DriverManager.getConnection(url, user, password);
                    
                }catch (SQLException ex){
                    System.exit(1);
                }
            } catch (Exception ex){
                System.out.println("salah");
            }
        }
    
    public static void main(String[] a){
        new Koneksi();
    }
}
