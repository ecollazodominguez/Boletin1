/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;

import java.util.Scanner;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //pedimos euros y cambio para pasar a dólares
        double euros=0,cambio=0;
        System.out.println("Cantidad de Euros:");
        euros=ler.nextDouble();
        System.out.println("Valor de conversión:");
        cambio=ler.nextDouble();
        System.out.println(euros+" € = "+euros*cambio+" $");
    }
    
}
