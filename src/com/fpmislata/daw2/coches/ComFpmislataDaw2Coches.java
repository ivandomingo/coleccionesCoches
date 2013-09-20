/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.coches;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ivan domingo muñoz
 */
public class ComFpmislataDaw2Coches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Coche> coches = new ArrayList<Coche>();

        coches.add(new Coche(Marca.FORD, "mustang", 4500, "12345678Z"));
        coches.add(new Coche(Marca.CITROEN, "c6", 2000, "9874L"));
        coches.add(new Coche(Marca.RANAULT, "5", 1200, "9876A"));
        coches.add(new Coche(Marca.FORD, "gt", 6000, "5678B"));
        coches.add(new Coche(Marca.SEAT, "600", 1000, "9864J"));

        /*System.out.println(coches.get(1).getMarca() + " " + coches.get(1).getModelo());

         for (Coche c : coches) {
         System.out.println(c.getMarca() + " " + c.getModelo());
         }
         Scanner sc = new Scanner(System.in);
         System.out.println("introduce un dni");
         String dni = sc.nextLine();
         for (Coche c : coches) {
         if (c.getDniPropietario().equalsIgnoreCase(dni)) {
         System.out.println(c.getMarca() + " " + c.getModelo());
         }
         }

         System.out.println("Coches marca ford");
         for (Coche c : coches) {
         if (c.getMarca().equals(c.getMarca().FORD)) {
         System.out.println(c.getMarca() + " " + c.getModelo() + " " + c.getDniPropietario());
         }
         }*/

        //------------------------
        ///MAP
        Map<String, Coche> mapCoche = new HashMap<String, Coche>();
        for (Coche c : coches) {
            mapCoche.put(c.getDniPropietario(), c);
        }


        System.out.println(mapCoche.get("12345678Z").getDniPropietario() + " " + mapCoche.get("12345678Z").getMarca() + " " + mapCoche.get("12345678Z").getModelo());
        System.out.println("--------------------");
        for (String c : mapCoche.keySet()) {
            System.out.println(mapCoche.get(c).getDniPropietario() + " " + mapCoche.get(c).getMarca() + " " + mapCoche.get(c).getModelo());
        }
        System.out.println("--------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un dni");
        String dni = sc.nextLine();
        System.out.println(mapCoche.get(dni).getModelo());
        
        
        System.out.println("--------------------");
        System.out.println("--------------------");
        
        for (String c:mapCoche.keySet()) {
            if (mapCoche.get(c).getMarca()==Marca.FORD) {
                System.out.println(mapCoche.get(c).getDniPropietario() + " " + mapCoche.get(c).getMarca() + " " + mapCoche.get(c).getModelo());
            }
        }
    }
}
