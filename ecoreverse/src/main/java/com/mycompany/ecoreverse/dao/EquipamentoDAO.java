/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecoreverse.dao;

import com.mycompany.ecoreverse.conexao.ConexaoDB;
import com.mycompany.ecoreverse.modelo.Equipamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Miguel
 */
public class EquipamentoDAO {
    
    private Connection conn;

    public EquipamentoDAO() {
        // Toda vez que chamarmos o DAO, ele já abre a conexão
        ConexaoDB conexao = new ConexaoDB();
        this.conn = conexao.conectar();
    }

    public boolean cadastrar(Equipamento equipamento) {
        String sql = "INSERT INTO Equipamento (tipo, marca, modelo, estadoAparente, statusAtual) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, equipamento.getTipo());
            stmt.setString(2, equipamento.getMarca());
            stmt.setString(3, equipamento.getModelo());
            stmt.setString(4, equipamento.getEstadoAparente());
            stmt.setString(5, "Pendente"); // Status inicial padrão
            
            stmt.execute();
            stmt.close();
            return true; // Deu certo!
            
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar equipamento: " + e.getMessage());
            return false; // Deu erro!
        }
    }
}
