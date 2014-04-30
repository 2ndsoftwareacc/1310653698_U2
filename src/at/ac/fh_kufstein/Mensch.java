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
public class Mensch extends Saeugetier {                    //Mensch erbt von Säugetier
    

    public Mensch(String n, int a, String g) {
        super(n, a, g);                                     //Säugetier Konstruktor wird aufgerufen
        
    }
    
    @Override                                               //Überschreiben um "Verhalten" der Methode zu verändern
    public String printAll(){
    
        return name + "#" + alter + "#" + geschlecht;
    
    }
    
    public static void main (String[] args){                   
    
        Mensch human = new Mensch("Michael", 24, "Männlich");      //Übergeben konkreter Werte
        System.out.println(human.printAll());                      //Ausgabe der konkreten Werte
    
    }
    
    

}
    
    
    
    
    
    
    
    

