/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecoreverse.modelo;

/**
 *
 * @author Miguel
 */
public class Triagem {
    private int id;
    private String dataTeste;
    private String laudoTecnico;
    private String componentesSubstituidos;
    private int equipamentoId;

    public Triagem() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDataTeste() { return dataTeste; }
    public void setDataTeste(String dataTeste) { this.dataTeste = dataTeste; }

    public String getLaudoTecnico() { return laudoTecnico; }
    public void setLaudoTecnico(String laudoTecnico) { this.laudoTecnico = laudoTecnico; }

    public String getComponentesSubstituidos() { return componentesSubstituidos; }
    public void setComponentesSubstituidos(String componentesSubstituidos) { this.componentesSubstituidos = componentesSubstituidos; }

    public int getEquipamentoId() { return equipamentoId; }
    public void setEquipamentoId(int equipamentoId) { this.equipamentoId = equipamentoId; }
}