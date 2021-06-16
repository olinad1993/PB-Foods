/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Foods.conexao;

import java.sql.*;

/**
 *
 * @author Miler
 */
public class conexaoDB {
    
    public static Connection conector() {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver"; //importa a biblioteca com driver mysql
        String url = "jdbc:mysql://localhost:3306/dbpbfoods"; //parâmetro endereço e nome do banco de dados
        String user = "root"; //parâmetro usuário do banco de dados
        String password = ""; //parâmetro senha do banco de dados

        //Estabelecendo conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
