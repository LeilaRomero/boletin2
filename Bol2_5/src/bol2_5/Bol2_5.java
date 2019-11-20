/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_5;

import java.util.Scanner;

/**
 *
 * @author lromerofajar
 */
public class Bol2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          /**Fai o algoritmo e programa  que calcule o soldo bruto e líquido, 
         * a percibir, por unha persoa .Sabendo que o soldo total inclue
         * os seguintes conceptos :
         *  Soldo fixo. 
         *  Comisión : 5% sobre importe total de vendas
         *  Quilometraxe : 2 € por km
         *  Dietas : 30 € por día de desprazamento .
         *  Para calcular o soldo líquido debemos descontarlle ao soldo bruto :
         *  I.R.P.F. = 18 % do soldo total .
         *  Retención a seguridade social : 36 € .*/

        Scanner leer = new Scanner (System.in);
            double sueldobruto, sueldoliquido, irpf=0.18,comision=0.05,kilometrajeprecio=2,dietas=30,retencionseguridadsocial=36,sueldofijo,kilometrosrecorridos,diasdesplazados,ventas;
            System.out.println("Introducir el sueldo fijo:");
            sueldofijo = leer.nextDouble();
            System.out.println("Introducir los kilometros recorridos totales:");
            kilometrosrecorridos = leer.nextDouble();
            System.out.println("Introducir los días de desplazamiento:");
            diasdesplazados = leer.nextDouble();
            System.out.println("Introducir total de las ventas:");
            ventas = leer.nextDouble();
            sueldobruto=sueldofijo+(kilometrosrecorridos*kilometrajeprecio)+(diasdesplazados*dietas)+(ventas*comision);
            sueldoliquido=(sueldobruto*irpf)-retencionseguridadsocial;
            sueldoliquido=sueldobruto-sueldoliquido;
            System.out.println(sueldoliquido+" sueldo líquido"+"\n"+sueldobruto+" sueldo bruto");
    }
    
}
