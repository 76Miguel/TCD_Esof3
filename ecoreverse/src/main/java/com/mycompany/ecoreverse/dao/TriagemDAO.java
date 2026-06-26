/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecoreverse.dao;

import com.mycompany.ecoreverse.conexao.ConexaoDB;
import com.mycompany.ecoreverse.modelo.Triagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Miguel
 */
public class TriagemDAO {
    private Connection conn;

    public TriagemDAO() {
        this.conn = new ConexaoDB().conectar();
    }

    public boolean registrarLaudo(Triagem triagem) {
        String sql = "INSERT INTO Triagem (dataTeste, laudoTecnico, componentesSubstituidos, equipamento_id) VALUES (TO_DATE(?, 'DD/MM/YYYY'), ?, ?, ?)";
        String sqlAtualizaStatus = "UPDATE Equipamento SET statusAtual = ? WHERE id = ?";
        
        try {
            // 1. Salva a Triagem
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, triagem.getDataTeste());
            stmt.setString(2, triagem.getLaudoTecnico());
            stmt.setString(3, triagem.getComponentesSubstituidos());
            stmt.setInt(4, triagem.getEquipamentoId());
            stmt.execute();
            stmt.close();
            
            // 2. Atualiza o status do equipamento baseado no laudo
            PreparedStatement stmtStatus = conn.prepareStatement(sqlAtualizaStatus);
            if (triagem.getLaudoTecnico().equalsIgnoreCase("Sucata")) {
                stmtStatus.setString(1, "Pronto para Descarte");
            } else {
                stmtStatus.setString(1, "Pronto para Doação");
            }
            stmtStatus.setInt(2, triagem.getEquipamentoId());
            stmtStatus.execute();
            stmtStatus.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao registrar triagem: " + e.getMessage());
            return false;
        }
    }
}