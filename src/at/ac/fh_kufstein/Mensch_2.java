/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein;

/**
 *
 * @author Mickey
 */
public class Mensch_2 {                                                 //Oberklasse von Student
    
    String vorname;                                                     //Eigenschaften der Klasse Mensch_2
    String nachname;
    int alter;

    public Mensch_2(String firstname, String lastname, int age) {       //Mensch_2 Konstruktor
        this.vorname = firstname;
        this.nachname = lastname;
        this.alter = age;
    }
    
    public void Status(){                                               //Ausgabe der konkreten Werte
    
        System.out.println("Es handelt sich um einen Menschen der den Vornamen " + vorname + " trägt und dessen Nachname "+nachname+" ist und "+alter+" Jahre alt ist");
    
    }
    

    
    
    
    
}
