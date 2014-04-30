/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein;

import at.ac.fh_kufstein.Auto.color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Mickey
 */
public class Aufruf {
    
    public static void main(String[] args){                                       //explizites casten, int--->short
    
        Auto audi = new Auto((short) 8, (short) 4, (short) 180, (short) 5, (short) 0, color.black);
        Auto bmw = new Auto((short) 4, (short)4, (short)220, (short)5, (short)0, color.blue);
        Auto audi2 = new Auto((short) 8, (short) 4, (short) 160, (short) 5, (short) 0, color.red);
        Auto audi3 = new Auto((short) 8, (short) 4, (short) 90, (short) 5, (short) 0, color.silver);
        Auto audi4 = new Auto((short) 8, (short) 4, (short) 70, (short) 5, (short) 0, color.white);
        
        List<Auto> liste = new ArrayList<>();                                     //Erstellung der Arrayliste "liste"
        liste.add(audi);
        liste.add(bmw);
        liste.add(audi2);
        liste.add(audi3);
        liste.add(audi4);
        Collections.sort(liste);                                                  //Collections Klasse, Sortierung
        
        //StringBuilder sb = new StringBuilder();
        for (Auto attribute: liste){                                              //for-each-Schleife...
        
            System.out.println(attribute.getPs());                                //Ausgabe konkreter Werte
            //sb.append(attribute).append(";");
        }
        
        //String attributefromArrayList =sb.toString();
        //System.out.println(attributefromArrayList);
        
    
    }
    
}
