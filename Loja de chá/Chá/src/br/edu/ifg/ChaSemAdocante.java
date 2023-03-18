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
public class ChaSemAdocante extends ChaGenerico {

    public ChaSemAdocante() {
        super();
        this.preparaCha();
        this.definePreco();
    }

    @Override
    public void preparaCha() {
        this.setDescricao("CHÁ SEM ADOÇANTE!");

    }

    @Override
    public void definePreco() {
        this.setPreco(this.getPreco());
    }
}
