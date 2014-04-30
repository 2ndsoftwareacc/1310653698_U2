/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package at.ac.fh_kufstein;

/**
 *
 * @author Mickey
 */                                                                   //Auto erbt von Oberklasse Fahrzeug
public class Auto extends Fahrzeug implements Comparable <Auto> {     //Interface Comparable
    
    private boolean klimaanlage;                                      //Eigenschaften der Klasse Auto
    private short airbags;
    private color farbe;
    
    public enum color{
    
        silver, red, black, blue, white;                              //Aufzählung der Konstanten
    
    }

    public Auto(short airbags, short reifen, short ps, short tueren, short geschwindigkeit, color farbe) {
        super(reifen, ps, tueren, false, geschwindigkeit);            //ruft Fahrzeug Konstruktor auf
        this.klimaanlage = false;
        this.airbags = airbags;
        this.farbe = farbe;
        
        anzahl++;
    }

    public Auto(short airbags, short reifen, short ps, short tueren, short geschwindigkeit) {
        this(airbags, reifen, ps, tueren, geschwindigkeit, color.red); //Standardfarbe wird festgeschrieben
        
    }

    
    
    public boolean isKlimaanalage() {
        return klimaanlage;
    }

    public void setKlimaanalage(boolean klimaanalage) {
        this.klimaanlage = klimaanalage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }

    public color getFarbe() {
        return farbe;
    }

    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }

    

    public void klimaanlageAn()
    {
        if(klimaanlage == true)
        {
            System.out.println("Die Klimaanlage läuft bereits");
        }
        else
        {
            klimaanlage = true;
        }
        
    }
    
    public void klimaanlageAus(){
        
       if(klimaanlage == true)
       {
           klimaanlage = false;
       }
       else
       {
           System.out.println("Die Klimaanlage ist bereits aus");
       }
    }
    
    
    @Override                                         
    public int compareTo(Auto a) {                 // Interface Comparable erfordert "compareTo()"
        
        if(this.getPs() < a.getPs())
        {
            return -1;
        }
        else if(this.getPs()>a.getPs())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    
}
