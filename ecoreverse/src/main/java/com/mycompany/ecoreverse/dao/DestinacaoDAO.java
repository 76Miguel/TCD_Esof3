/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecoreverse.dao;

import com.mycompany.ecoreverse.conexao.ConexaoDB;
import com.mycompany.ecoreverse.modelo.Destinacao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Miguel
 */
public class DestinacaoDAO {
    private Connection conn;

    public DestinacaoDAO() {
        this.conn = new ConexaoDB().conectar();
    }

    public boolean registrarDestino(Destinacao destinacao) {
        String sql = "INSERT INTO Destinacao (dataEnvio, tipoDestino, entidadeRecebedora, termoDocumento, equipamento_id) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, destinacao.getDataEnvio());
            stmt.setString(2, destinacao.getTipoDestino());
            stmt.setString(3, destinacao.getEntidadeRecebedora());
            stmt.setString(4, destinacao.getTermoDocumento());
            stmt.setInt(5, destinacao.getEquipamentoId());
            
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao registrar destino: " + e.getMessage());
            return false;
        }
    }
}