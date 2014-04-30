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
abstract class Saeugetier {                                  //enthält keine konkreten Methoden

    String name;                                             //Eigenschaften der Klasse Säugetier
    int alter;
    String geschlecht;
    
    public abstract String printAll();                      //Erstellung abstrakter Methode
                                                            //enthält nur die Deklaration des Methodenkopfes

    public Saeugetier(String n, int a, String g) {            //Säugetier Konstruktor
        this.name = n;
        this.alter = a;
        this.geschlecht = g;
    }
        
    
    
}
