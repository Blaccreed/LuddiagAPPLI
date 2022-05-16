package com.example.luddiagappli.Model;

import android.util.Log;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Jeux {

    private int id;
    private  String nom;
    private String categorie;
    private String image;

    //private List<Note> listeDesNotes;

    //Temporaire

    public Jeux(int id, String nom, String categorie, String image) {
        this.id = id;
        this.nom = nom;
        this.categorie = categorie;
        this.image = image;
    }

    public static List<Jeux> getTousLesJeux()
    {
        List<Jeux> jeuxList = new ArrayList<>();
        String sql = "SELECT * FROM jeu";
        database db = new database();
        try {
            Statement st = db.getExtraConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                Jeux j = new Jeux(rs.getInt("id_jeu"), rs.getString("nom_jeu"), rs.getString("categorie_jeu"), rs.getString("image"));
                jeuxList.add(j);

            }
        } catch (SQLException e) {
            Log.d("DB", "Error getting querry");
            e.printStackTrace();
        }

        return jeuxList;
    }

    public static void UpdateJeux(int id, String nom, String categorie)
    {
        String sql = "UPDATE jeu SET nom_jeu ="+ nom +", categorie_jeu = "+ categorie +" WHERE id_jeu = "+ id;

        database db = new database();
        try {
            Statement st = db.getExtraConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
        } catch (SQLException e) {
            Log.d("DB", "Error getting querry");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Jeux{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", categorie='" + categorie + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
