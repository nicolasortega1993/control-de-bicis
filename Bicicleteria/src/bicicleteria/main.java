/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleteria;

import java.util.Scanner;

/**
 *
 * @author Desarrollo Web
 */
public class main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Bicicleteria bici = new Bicicleteria();
        String numeroDeSerie = null;
        String modelo = null;
        int año = 0;
        float precio = 0;
        Bicicleta b ;
        b=new Bicicleta(numeroDeSerie,modelo,año,precio);
        int opcion = 0;
        boolean salir=true;
                        while(!salir){
                    System.out.println("          ");    
                    System.out.println("    ******");
                    System.out.println("    *MENU*");
                    System.out.println("    ******");
                    System.out.println("1: agregar bicicletas");
                    System.out.println("2: mostrar bicicletas");
                    System.out.println("3: ordenar bicicletas por año");
                    System.out.println("4: vender bicicleta");
                    System.out.println("5: buscar bicicleta");
                    System.out.println("");
                    System.out.println("ELIJA LA OPCION DESEADA:");
                    System.out.println("------------------------");
        switch (opcion){
           case 1:
                       for(int i=0;i<3;i++){
        System.out.println("ingrese numero de serie");
        numeroDeSerie = teclado.next();
        System.out.println("ingrese modelo");
        modelo = teclado.next();
        System.out.println("ingrese año");
        año = teclado.nextInt();
        System.out.println("ingrese precio");
        precio = teclado.nextFloat();
        bici.addBicicleta(b);
       }
           case 2:
               bici.mostrarTodo();
           case 3:
               bici.ordenarBicis();
           case 4:
               bici.venderBicileta(b);
           case 5:
               bici.buscarBicicleta(numeroDeSerie);
               
       

}
}
    }
}
