/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;

import java.util.Scanner;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos millas para convertir en metros
        Scanner ler = new Scanner(System.in);
        float metros,conversion=1852;
        System.out.println("Millas: ");
        float millas=ler.nextFloat();
        
        metros=millas*conversion;
        
        System.out.println(+millas+" milla = "+metros+"m");
    }
    
}
