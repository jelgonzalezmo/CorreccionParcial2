/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *

 */
public class Mediciones {

    String fecha;
    double temperatura;
    double nivelDeCarga;
    double milimetrosDeAgua;

    public double getTemperatura() {
        return temperatura;
    }

    public Mediciones() {

    }

    public Mediciones(double temperatura, double nivelDeCarga, double milimetrosDeAgua, String fecha) {
        this.temperatura = temperatura;
        this.nivelDeCarga = nivelDeCarga;
        this.milimetrosDeAgua = milimetrosDeAgua;
        this.fecha=fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

       
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getNivelDeCarga() {
        return nivelDeCarga;
    }

    public void setNivelDeCarga(double nivelDeCarga) {
        this.nivelDeCarga = nivelDeCarga;
    }

    public double getMilimetrosDeAgua() {
        return milimetrosDeAgua;
    }

    public void setMilimetrosDeAgua(double milimetrosDeAgua) {
        this.milimetrosDeAgua = milimetrosDeAgua;
    }

}
