/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_4;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Bol2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /** Realiza un algoritmo e codifica o programa correspondente que lea,
         * dende o teclado, unha cantidade enteira en euros e amose , por 
         * pantalla, o seu desglose en billetes de 100, 20, 5 e moedas de 1 € .*/
        
         Scanner leer= new Scanner (System.in);
        int billete100, billete20, billete5, moneda1, total, resto;
        System.out.println("Introduzca cantidad exacata de €");
        total= leer.nextInt();
        billete100=total/100;resto=total%100; total=total-(total-resto);
        billete20=total/20;resto=total%20;total=total-(total-resto);
        billete5=total/5;resto=total%5;
        moneda1=resto;
        System.out.println("total billetes de 100€ = " + billete100 +" total de billetes de 20€ = " 
        + billete20 + " total de billetes de 5€ = " + billete5 + " total de monedas de 1€ = "+moneda1);
    }
    
}

