package com.example.luddiagappli.Model;

public class Note {

    private int id;
    private int notation;
    private Jeu jeu;
    //private Joueur joueur;
    //private Animateur animateur;
    private boolean valider;

    //Temporaire


    public Note(int id, int notation, Jeu jeu, boolean valider) {
        this.id = id;
        this.notation = notation;
        this.jeu = jeu;
        this.valider = valider;
    }

    public int getId() {
        return id;
    }

    public int getNotation() {
        return notation;
    }

    public Jeu getJeu() {
        return jeu;
    }

    public boolean isValider() {
        return valider;
    }


}
