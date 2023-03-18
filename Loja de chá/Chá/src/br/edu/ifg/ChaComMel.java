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
public class ChaComMel extends ChaComAdocante {

    public ChaComMel() {
        this.setAdocante(Adocante.MEL);
        this.preparaCha();
        this.definePreco();
    }

}
