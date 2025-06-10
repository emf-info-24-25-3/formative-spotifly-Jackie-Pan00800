package models;

public class Album {
    private Chanson[] chansons;
    private String titre;
    private String interprete;
    private int nbreChanson;
    public Album(){
        this.chansons=new Chanson[nbreChanson];
        this.titre=titre;
        this.interprete=interprete;
    }
    public void ajouterChanson(){
        for (int i = 0; i < chansons.length; i++) {
            if(chansons[i]==null){
                chansons[i]=chanson;
            }
        }
    }
}