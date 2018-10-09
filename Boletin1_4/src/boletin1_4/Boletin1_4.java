/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;

import java.util.Scanner;

/**
 *
 * @author ecollazodominguez
 */
public class Boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedimos numero por teclado y hacemos operaciones
        Scanner ler = new Scanner(System.in);
        float suma,resta,producto,cociente;
        System.out.println("Primer número: ");
        float n1=ler.nextFloat();
        System.out.println("Segundo número: ");
        float n2=ler.nextFloat();
            
        suma=n1+n2;
        resta=n1-n2;
        producto=n1*n2;
        cociente=n1/n2;
        
        System.out.println("Suma: "+suma+"\nResta: "+resta+"\nProducto: "+producto+"\nCociente: "+cociente);
        
    }
    
}
