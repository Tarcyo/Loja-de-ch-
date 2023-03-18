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
public class ChaComAdocanteQuimico extends ChaComAdocante {

    public ChaComAdocanteQuimico() {
        this.setAdocante(Adocante.ADANTEQUIMICO);
        this.preparaCha();
        this.definePreco();
    }

}
