
package feladat;


public class Pendrive extends Adathordozo{
    private int verzio;
    public Pendrive(String nev, int kapacitas, int verzio){
       
        super(nev, kapacitas); 
        this.verzio=2|3;
    }
    public String getNev(String nev){
        this.nev="Pendrive";
        return nev;
    }
    @ Override
    public String toString(){
        return nev + "kapacitás: " + kapacitas + "Verzió: "+verzio;
    }
    
    
    
    }
    
    

