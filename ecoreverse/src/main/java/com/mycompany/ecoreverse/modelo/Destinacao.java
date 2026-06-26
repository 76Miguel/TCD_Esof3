/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecoreverse.modelo;

/**
 *
 * @author Miguel
 */
public class Destinacao {
    private int id;
    private String dataEnvio;
    private String tipoDestino;
    private String entidadeRecebedora;
    private String termoDocumento;
    private int equipamentoId;

    public Destinacao() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDataEnvio() { return dataEnvio; }
    public void setDataEnvio(String dataEnvio) { this.dataEnvio = dataEnvio; }

    public String getTipoDestino() { return tipoDestino; }
    public void setTipoDestino(String tipoDestino) { this.tipoDestino = tipoDestino; }

    public String getEntidadeRecebedora() { return entidadeRecebedora; }
    public void setEntidadeRecebedora(String entidadeRecebedora) { this.entidadeRecebedora = entidadeRecebedora; }

    public String getTermoDocumento() { return termoDocumento; }
    public void setTermoDocumento(String termoDocumento) { this.termoDocumento = termoDocumento; }

    public int getEquipamentoId() { return equipamentoId; }
    public void setEquipamentoId(int equipamentoId) { this.equipamentoId = equipamentoId; }
}
