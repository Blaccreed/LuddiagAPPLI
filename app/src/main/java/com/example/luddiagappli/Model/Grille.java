package com.example.luddiagappli.Model;

import java.util.Date;
import java.util.List;

public class Grille {

    private int id;
    private boolean rempli;
    private String type;
    private Date date_deb;
    private Date date_fin;
    //private Joueur joueur;
    private List<Jeux> listJeux;


    public Grille(int id, boolean rempli, String type, Date date_deb, Date date_fin, List<Jeux> listJeux) {
        this.id = id;
        this.rempli = rempli;
        this.type = type;
        this.date_deb = date_deb;
        this.date_fin = date_fin;
        this.listJeux = listJeux;
    }

    @Override
    public String toString() {
        return "Grille{" +
                "id=" + id +
                ", rempli=" + rempli +
                ", type='" + type + '\'' +
                ", date_deb=" + date_deb +
                ", date_fin=" + date_fin +
                '}';
    }

    public boolean estRempli()
    {
        return this.rempli;
    }
}
