/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_3;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Bol2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /**Fai un programa , para o software dunha máquina,
         * que converta una cantidade enteira de diñeiro,
         * que está en billetes de 100, 20, 5 e moedas de 1 € ,
         * no seu equivalente en euros ( exp.  2 billetes de 100, 3 -> 20 , 
         * 6 moedas de 1  visualizaríamos 266 € ).*/
        
        Scanner leer= new Scanner (System.in);
        int billete100, billete20, billete5, moneda1;
        System.out.println("Introducir la cantidad de billetes de 100€ deseada");
        billete100= leer.nextInt();
        System.out.println("Introducir la cantidad de billetes de 20€ deseada");
        billete20= leer.nextInt();
        System.out.println("Introducir la cantidad de billetes de 5€ deseada");
        billete5= leer.nextInt();
        System.out.println("Introducir la cantidad de monedas de 1€ deseadas");
        moneda1= leer.nextInt();
        System.out.println("El total de la cantidad es " + ((billete100*100)+(billete20*20)+(billete5*5)+moneda1)+"€");   
    }
    
}

