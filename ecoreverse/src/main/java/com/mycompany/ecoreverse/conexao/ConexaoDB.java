/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecoreverse.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Miguel
 */
public class ConexaoDB {
    
    public Connection conectar() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/ecoreverse_db", "postgres", "postgres");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco: " + e.getMessage());
            return null;
        }
    }
}