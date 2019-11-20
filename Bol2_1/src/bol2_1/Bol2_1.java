/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_1;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Bol2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** 1-	Realiza o ordinograma  correspondente a un programa que saque por 
pantalla a porcentaxe descontada nunha compra. 
Introducindo, por teclado, o prezo da tarifa e o prezo pagado.*/
     
        Scanner leer = new Scanner (System.in);
           double porcentaje,porciento , descuento=100;
           System.out.println("introducir el precio de la tarifa");
           porcentaje = leer.nextDouble();
           System.out.println("introducir el precio pagado");
           porciento = leer.nextDouble();
           System.out.println((descuento-(porciento*100)/porcentaje) + " descuento de la compra");
    }
    
}

