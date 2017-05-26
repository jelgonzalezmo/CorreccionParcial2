/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *

 */
public class Ciudad {

    private String nombre;
    private ArrayList<EstacionMet> estaciones;

    public Ciudad(String nombre, ArrayList<EstacionMet> estaciones) {
        this.nombre = nombre;
        this.estaciones = estaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<EstacionMet> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<EstacionMet> estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "estaciones=" + estaciones + '}';
    }

    public void informacion() {
        estaciones.get(0).toString();
    }
}
