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
public class Student extends Mensch_2 {                //Student erbt von Mensch_2, Subklasse von Mensch_2
    
    int matrikelnummer;                                //zusätzliche Eigenschaften der Klasse Student
    String studiengang;

    public Student(int matrikelnummer, String studiengang, String firstname, String lastname, int age) {
        super(firstname, lastname, age);
        this.matrikelnummer = matrikelnummer;           //Student Konstruktor
        this.studiengang = studiengang;
    }

    @Override                                           //Überschreiben um "Verhalten" der Methode zu verändern
    public void Status() {
        super.Status(); 
    }

    

    public static void main(String[] args){                           //Übergabe von konkreten Werten
        
        Mensch_2 human_2 = new Mensch_2("Michael", "Ramsteck", 24);   //nutz Mensch_2 Konstruktor
        human_2.Status();
        
    Student student = new Student(1310653698, "Web Business & Technology", "Michael", "Ramsteck", 24);
    student.Status();                                                 
    
        
    
    }
    
    
    
}
