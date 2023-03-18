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
public class ChaComAcucar extends ChaComAdocante{

    public ChaComAcucar() {
        this.setAdocante(Adocante.ACUCAR);
        this.preparaCha();
        this.definePreco();
        
    }
  
}
