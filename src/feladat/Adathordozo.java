
package feladat;


public class Adathordozo {
    String nev;
    int kapacitas;
    
    public Adathordozo(String nev, int kapacitas){
        this.nev=nev;
        this.kapacitas=kapacitas;
        
    }
    
    @ Override
    public String toString(){
        return nev + "kapacitás: " + kapacitas;
    }
    public int nagyobbMint(Adathordozo masik){
        if (kapacitas > masik.kapacitas) {
            return 1;
        } 
        if (kapacitas < masik.kapacitas) {
            return -1;
        }
        return 0;
    }
    

    
    
}
