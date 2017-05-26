/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *

 */
public class NivelCE extends Sensor {

    protected static final String[] TIPOC = {"1-TormentaElectrica", "2-Rayos", "3-Truenos", "4-Normal"};
    private String tipoc;

    public NivelCE(String Marca, String referencia, String Fechains) {
        super(Marca, referencia, Fechains);
        this.tipoc = tipoc;
    }

    public String getTipoc() {
        return tipoc;
    }

    public void setTipoc(String tipoc) {
        this.tipoc = tipoc;
    }

    @Override
    public void promedio() {
    }

}
