/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleteria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Desarrollo Web
 */
public class Bicicleteria {

    Bicicleta bici;

    private List<Bicicleta> Bicicletas;
    private float ganancias;
    private int cantidadDeVentas;

    public void Bicileteria() {
        Bicicletas = new ArrayList<>(6);
        cantidadDeVentas = 0;
        ganancias = 0;
    }

    public void addBicicleta(Bicicleta nuevaBici) {
        Bicicletas.add(nuevaBici);
    }

    public void venderBicileta(Bicicleta bicicleta) {
        Bicicletas.remove(bicicleta);
        cantidadDeVentas++;
        ganancias = ganancias + bicicleta.getPrecio();
    }

    public void buscarBicicleta(String numeroDeSerie) {
        boolean llave = true;
        for (int i = 0; i < Bicicletas.size(); i++) {
            if (Bicicletas.equals(numeroDeSerie) && llave) {
                System.out.println("El numero de serie de su bicicleta es es " + bici.getNumeroDeSerie());
                llave = false;
            } else {
                System.out.println("no se ha encontrado");;
            }
        }
    }

    List<Bicicleta> ordenarBicis() {
        //metodo burbuja ordenado.
        Bicicleta aux;
        boolean bandera = true;
        for (int j = 0; j < Bicicletas.size() && bandera == true; j++) {
            bandera = false;
            for (int i = 0; i < Bicicletas.size() - 1 - j; i++) {
                if (Bicicletas.get(i).getAño() > Bicicletas.get(i + 1).getAño()) {
                    aux = Bicicletas.get(i + 1);
                    Bicicletas.set(i + 1, Bicicletas.get(i));
                    Bicicletas.set(i, aux);
                    bandera = true;
                }
            }

        }
        return Bicicletas;
    }

    void mostrarTodo() {
        for (int i = 0; i < Bicicletas.size(); i++) {
            System.out.println(Bicicletas.get(i).toString());
        }
    }
}

//Bicicletas.sort(bicicleta.equals(bicicleta.año));
/* String a=new String(String.valueOf(bicicleta.año));
        String b=new String(String.valueOf(bicicleta.año));
        return a.compareTo(b);*/
