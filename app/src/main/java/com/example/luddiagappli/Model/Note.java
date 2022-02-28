package com.example.luddiagappli.Model;

public class Note {

    private int id;
    private int notation;
    private Jeux jeu;
    //private Joueur joueur;
    //private Animateur animateur;
    private boolean valider;

    //Temporaire


    public Note(int id, int notation, Jeux jeu, boolean valider) {
        this.id = id;
        this.notation = notation;
        this.jeu = jeu;
        this.valider = valider;
    }

}
