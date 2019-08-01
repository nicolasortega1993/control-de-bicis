/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleteria;

/**
 *
 * @author Desarrollo Web
 */
public class Bicicleta {
    String numeroDeSerie;
    String modelo;
    int año;
    float precio;

    public Bicicleta(String numeroDeSerie, String modelo, int año, float precio) {
        this.numeroDeSerie = numeroDeSerie;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    Bicicleta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "numeroDeSerie=" + numeroDeSerie + ", modelo=" + modelo + ", año=" + año + ", precio=" + precio + '}';
    }
    
}
