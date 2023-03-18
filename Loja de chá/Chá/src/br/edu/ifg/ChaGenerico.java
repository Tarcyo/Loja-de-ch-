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
public abstract class ChaGenerico implements Cha {

    private String descricao;
    private double preco;

    public ChaGenerico() {
        this.preco = 6;
    }

    @Override
    public String toString() {
        return "Cha{" + "descricao=" + descricao + ", preco=" + preco + '}';
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
