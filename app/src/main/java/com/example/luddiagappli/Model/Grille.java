package com.example.luddiagappli.Model;

import android.util.Log;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Grille {

    private int id;
    private boolean rempli;
    private String type;
    private Date date_deb;
    private Date date_fin;
    //private Joueur joueur;
    private List<Jeu> listJeux;


    public Grille(int id, boolean rempli, String type, Date date_deb, Date date_fin, List<Jeu> listJeux) {
        this.id = id;
        this.rempli = rempli;
        this.type = type;
        this.date_deb = date_deb;
        this.date_fin = date_fin;
        this.listJeux = listJeux;
    }

    public int getId() {
        return id;
    }

    public boolean isRempli() {
        return rempli;
    }

    public String getType() {
        return type;
    }

    public Date getDate_deb() {
        return date_deb;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public List<Jeu> getListJeux() {
        return listJeux;
    }

    public static List<Jeu> GetJeuxGrille(int id_grille)
    {

        List<Jeu>LesJeuxDeLaGrille = new ArrayList<Jeu>();
        String sql = "SELECT jeu.id_jeu , jeu.nom_jeu , jeu.categorie_jeu  FROM contenu , jeu WHERE jeu.id_jeu = contenu.id_jeu AND contenu.id_grille = 1;";
        System.out.println("--->" + sql);
        database db = new database();

        try {
            Statement st = db.getExtraConnection().createStatement();

            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                //Jeu jeu = new Jeu(rs.getInt("jeu.id_jeu"), rs.getString("jeu.nom_jeu"), rs.getString("jeu.categorie_jeu"));
                //LesJeuxDeLaGrille.add(jeu);
                //Log.d("list", String.valueOf(LesJeuxDeLaGrille));
            }

        } catch (SQLException e) {
            Log.d("DB", "Erreur pour récupérer les jeux de la grille");
            e.printStackTrace();
        }
        return LesJeuxDeLaGrille;
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





}
