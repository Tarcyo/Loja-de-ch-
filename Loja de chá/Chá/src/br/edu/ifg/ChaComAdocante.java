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
public abstract class ChaComAdocante extends ChaGenerico {

    public ChaComAdocante() {
        super();
    }

    private Adocante adocante;

    @Override
    public void preparaCha() {
        this.setDescricao("FOI ADICIONADO " + this.getAdocante().getDescricao() + " AO SEU CHÁ!");
    }

    @Override
    public void definePreco() {
        this.setPreco(this.getPreco() + this.getAdocante().getPreco());
    }

    public Adocante getAdocante() {
        return adocante;
    }

    public void setAdocante(Adocante adocante) {
        this.adocante = adocante;
    }

}
