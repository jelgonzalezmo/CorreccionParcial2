/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *

 */
public class BDatos {

    public static ArrayList<Ciudad> ciudades = new ArrayList<>();

    public static void leerNuevasEstaciones() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los datos");
        System.out.println("Nombre de la ciudad:");
        String Ciudad = leer.nextLine();
        System.out.println("Numero de estaciones a registrar: ");

        int numeroEst = Integer.parseInt(leer.nextLine());
        ArrayList<EstacionMet> estaciones = new ArrayList<>();
        for (int i = 0; i < numeroEst; i++) {
            System.out.println("Nombre de la estacion " + (i + 1) + ":");
            String NombreEst = leer.nextLine();
            System.out.println("Numero de datos:");
            int numdatos = Integer.parseInt(leer.nextLine());
            ArrayList<Mediciones> mediciones = new ArrayList<>();

            for (int j = 0; j < numdatos; j++) {
                System.out.println("Dato " + (j + 1));
                System.out.println("fecha:");
                String Fecha = leer.nextLine();
                System.out.println("Temperatura:");
                int Temperatura = Integer.parseInt(leer.nextLine());
                System.out.println("Cantidad de agua:");
                int CantAgua = Integer.parseInt(leer.nextLine());
                System.out.println("Nivel eléctrico:");
                int NivelElec = Integer.parseInt(leer.nextLine());

                Mediciones datos = new Mediciones();
                datos.setFecha(Fecha);
                datos.setTemperatura(Temperatura);
                datos.setMilimetrosDeAgua(CantAgua);
                datos.setNivelDeCarga(NivelElec);

                mediciones.add(datos);
            }
            EstacionMet estacion = new EstacionMet(NombreEst, mediciones);
            estaciones.add(estacion);

        }
        ciudades.add(new Ciudad(Ciudad, estaciones));
    }

    public static void CargarDatos(String a) throws FileNotFoundException {
        Scanner s = new Scanner(new File(a));

        while (s.hasNextLine()) {
            String NombreC = s.nextLine();

            int NumEst = Integer.parseInt(s.nextLine());
            ArrayList<EstacionMet> estaciones = new ArrayList<>();
            for (int i = 0; i < NumEst; i++) {
                String NE = s.nextLine();

                int NumD = Integer.parseInt(s.nextLine());
                ArrayList<Mediciones> mediciones = new ArrayList<>();
                for (int j = 0; j < NumD; j++) {
                    Mediciones data = new Mediciones();
                    String u = s.nextLine();
                    String datos[] = u.split("[ ]+");
                    data.setFecha(datos[0]);
                    data.setTemperatura(Double.parseDouble(datos[1]));
                    data.setMilimetrosDeAgua((Double.parseDouble(datos[2])));
                    data.setNivelDeCarga(Double.parseDouble(datos[3]));
                    mediciones.add(data);
                }
                EstacionMet newEstacion = new EstacionMet(NE, mediciones);
                estaciones.add(newEstacion);
            }
            Ciudad c = new Ciudad(NombreC, estaciones);
            ciudades.add(c);
        }

    }

    public static void agregarCiudad(Ciudad c) {
        ciudades.add(c);
    }

}
