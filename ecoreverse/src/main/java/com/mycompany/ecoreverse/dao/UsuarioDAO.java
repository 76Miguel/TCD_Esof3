/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecoreverse.dao;

import com.mycompany.ecoreverse.conexao.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Miguel
 */
public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO() {
        this.conn = new ConexaoDB().conectar();
    }

    // Método para o Técnico fazer Login
    public boolean autenticar(String email, String senha) {
        String sql = "SELECT * FROM Usuario WHERE email = ? AND senha = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            
            ResultSet rs = stmt.executeQuery();
            boolean existe = rs.next(); // Se achou alguem, retorna true
            
            stmt.close();
            return existe;
        } catch (SQLException e) {
            System.out.println("Erro no login: " + e.getMessage());
            return false;
        }
    }
}