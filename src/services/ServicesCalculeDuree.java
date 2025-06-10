package services;

public class ServicesCalculeDuree {
    public int calculeDureeSecondes(int minutes, int secondes){
        int dureeTotale = (minutes*60)+secondes;
        return dureeTotale;
    }
    public int calculeMinutesEntieres(int minutes, int secondes){
        int dureeTotale = (minutes*60)+secondes;
        int minuteTotale = dureeTotale/60;
        return minuteTotale;
    }
    public int calculeResteSecondes(int minutes, int secondes){
        int dureeTotale = (minutes*60)+secondes;
        int secondeRestante = dureeTotale%60;
        return secondeRestante;
    }
}
