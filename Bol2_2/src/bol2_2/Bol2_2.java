/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_2;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Bol2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         /** Realiza o ordinograma e,despois codifica un programa que
        representa un algoritmo, que reciba como dato de entrada o valor
        dunha temperatura expresada en graos centígrados e calcule o seu
        equivalente en graos Fahrenheit e graos Kelvin.*/
        
        Scanner leer = new Scanner (System.in);
        double gradoscentigrados, gradosfahrenheit, gradoskelvin;
        System.out.println("introducir los grados centigrados a pasar:");
        gradoscentigrados= leer.nextDouble();
        gradosfahrenheit= (gradoscentigrados*9/5)+32 ;
        gradoskelvin = gradoscentigrados + 273;
        System.out.println(gradoscentigrados+" grados centigrados equilaven a " + gradosfahrenheit +" fahrenheit y a " + gradoskelvin +" kelvin.");   
    }
    
}