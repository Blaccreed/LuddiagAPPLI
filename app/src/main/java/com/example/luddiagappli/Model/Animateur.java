package com.example.luddiagappli.Model;

import android.util.Log;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Animateur extends User{
    String stand;

    public Animateur(int id_user, String nom_user, String prenom_user, String mdp_user, String mail_user, String phone_user, String adresse_user, String cd_postal_user, String stand){
        super(id_user, nom_user, prenom_user, mdp_user, mail_user, phone_user, adresse_user, cd_postal_user);
        this.stand = stand;
    }

    public String getStand() {
        return stand;
    }

    //méthode pour valider une note avec l'id du jeu et l'id de l'user
    public static void ValiderNote(int id_jeu, int id_user){
        String sql = "UPDATE noter SET validee = true WHERE id_jeu = ? AND id_user = ?";
        database conn = new database();
        PreparedStatement myStmt;
        try {
            myStmt = conn.getExtraConnection().prepareStatement(sql);
            myStmt.setInt(1, id_jeu );
            myStmt.setInt(2, id_user);
            myStmt.executeUpdate();
        } catch (SQLException throwables) {
            Log.d("DB","Impossible de valider la note");
            throwables.printStackTrace();
        }

    }
}
