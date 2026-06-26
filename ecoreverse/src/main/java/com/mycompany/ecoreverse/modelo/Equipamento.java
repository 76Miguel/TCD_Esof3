/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecoreverse.modelo;

/**
 *
 * @author Miguel
 */
public class Equipamento {
    private int id;
    private String tipo;
    private String marca;
    private String modelo;
    private String estadoAparente;
    private String statusAtual;

    public Equipamento() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getEstadoAparente() { return estadoAparente; }
    public void setEstadoAparente(String estadoAparente) { this.estadoAparente = estadoAparente; }

    public String getStatusAtual() { return statusAtual; }
    public void setStatusAtual(String statusAtual) { this.statusAtual = statusAtual; }
}
