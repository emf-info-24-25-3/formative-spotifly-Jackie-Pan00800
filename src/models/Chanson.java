package models;
import java.text.DecimalFormat;

import services.ServicesCalculeDuree;
public class Chanson {
    private String interprete;
    private String titre;
    private int duree;

    public Chanson(){
        this.interprete=interprete;
        this.titre=titre;
        this.duree=ServicesCalculeDuree.calculeDureeSecondes();
    }

    public String toString(){
        DecimalFormat df = new DecimalFormat("#.00");
        String resultat = df.format(duree/60);
        String toString = interprete+" - "+titre+", "+resultat;
        return toString;
    }
}
