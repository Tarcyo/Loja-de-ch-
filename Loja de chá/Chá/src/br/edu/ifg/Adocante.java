/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

/**
 *
 * @author Tarcyo
 */
public enum Adocante {

    ACUCAR("AÇUCAR",2.0),
    MEL("MEL",3.50),
    GELEIAREAL("GELEIA REAL",15.0),
    ACUCARMASCAVO("ACUCAR MASCAVO",4.0),
    ADANTEQUIMICO("ADOÇANTE QUÍMICO",3.0),
    CHANTILLY("CHANTILLY",2.50);
    

    private String string;

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getString() {
        return string;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setString(String string) {
        this.string = string;
    }
    
    private String descricao;
    private double preco;

    Adocante(String descricao,double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
        return preco;
    }
    
    

}
