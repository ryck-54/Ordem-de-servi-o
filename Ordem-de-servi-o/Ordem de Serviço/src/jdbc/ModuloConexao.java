/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ifmtn
 */
 public class ModuloConexao {
    
    public static Connection conectar() {
        Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306?dbos2025";
        String user = "root";
        String senha = "";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, senha);
            System.out.println(conexao);
            return conexao;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"OPS !!! - Algo de errado aconteceu!!"+e);
            System.out.println(e);
            return null;
          }
        
    }
    public static java.sql.Connection desconectar(){
     Connection conexao = null;
     
        try {
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
 }
    

