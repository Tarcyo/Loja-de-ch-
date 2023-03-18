/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifg;

import javax.swing.JOptionPane;

/**
 *
 * @author Tarcyo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cha cha;
        int temAdocante = JOptionPane.showConfirmDialog(null, "Você deseja colocar algum adoçante em seu chá?");

        switch (temAdocante)
        {
            case 0:

                int tipoAdocate = Integer.parseInt(JOptionPane.showInputDialog("Escolha o adoçante para o chá:\n1- Açucar branco\n2- Açucar Mascavo\n3- Mel\n4- Chantilly\n5- Geleia Real\nOutro Numero- Adoçante quimico"));
                switch (tipoAdocate)
                {
                    case 1:
                        cha = new ChaComAcucar();
                        break;
                    case 2:
                        cha = new ChaComAcucarMascavo();
                        break;
                    case 3:
                        cha = new ChaComMel();
                        break;
                    case 4:
                        cha = new ChaComChantilly();
                        break;
                    case 5:
                        cha = new ChaComGeleiaReal();
                        break;
                    default:
                        cha = new ChaComAdocanteQuimico();
                        break;
                }

                break;
            default:
                cha = new ChaSemAdocante();
                break;

        }
        System.out.println("Seu chá: \n" + cha);

    }
}
