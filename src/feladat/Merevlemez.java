
package feladat;


public class Merevlemez extends Adathordozo {
    private int fordulatszam;
    public Merevlemez(String nev, int kapacitas, int fordulatszam){
        super(nev, kapacitas);
        this.fordulatszam=5400 | 7200;
    }
    public String getNev(String nev){
        this.nev="Merevlemez";
        return nev;
    }
    @ Override
    public String toString(){
        return nev + "kapacitás: " + kapacitas + "fordulatszám: "+fordulatszam;
    }
    
}
