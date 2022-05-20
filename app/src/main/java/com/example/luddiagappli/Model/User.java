package com.example.luddiagappli.Model;

import android.util.Log;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class User {
    protected int id_user;
    protected String nom_user;
    protected String prenom_user;
    protected String mdp_user;
    protected String mail_user;
    protected String phone_user;
    protected String adresse_user;
    protected String cd_postal_user;

    public User(int id_user, String nom_user, String prenom_user, String mdp_user, String mail_user, String phone_user, String adresse_user, String cd_postal_user)
    {
        this.id_user = id_user;
        this.nom_user = nom_user;
        this.prenom_user = prenom_user;
        this.mdp_user = mdp_user;
        this.mail_user = mail_user;
        this.phone_user = phone_user;
        this.adresse_user = adresse_user;
        this.cd_postal_user = cd_postal_user;
    }

    public int getId_user() {
        return id_user;
    }

    public String getNom_user() {
        return nom_user;
    }

    public String getPrenom_user() {
        return prenom_user;
    }

    public String getMdp_user() {
        return mdp_user;
    }

    public String getMail_user() {
        return mail_user;
    }

    public String getPhone_user() {
        return phone_user;
    }

    public String getAdresse_user() {
        return adresse_user;
    }

    public String getCd_postal_user() {
        return cd_postal_user;
    }

    //fonctionne! Permet de vérifier que la personne se connecte
    public static  void SeConnecter(String mail_user, String mdp_user)
    //public static  void SeConnecter()
    {
        String sql = "SELECT * FROM user_flip WHERE mail_user='" +  mail_user + "'AND mdp_user='"+ mdp_user + "'";

        database db = new database();
        try {
            Statement st = db.getExtraConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                String mail = rs.getString("mail_user");
                Animateur animateur = new Animateur(rs.getInt("id_user"), rs.getString("nom_user"), rs.getString("prenom_user"),rs.getString("mdp_user"),rs.getString("mail_user"),
                        rs.getString("phone_user"), rs.getString("adresse_user"), rs.getString("cd_postal_user"), rs.getString("stand"));
                Log.d("MAIL", mail);
            }

        } catch (SQLException e) {
            Log.d("DB", "Erreur pour se connecter");
            e.printStackTrace();
        }
    }

    public static void InscriptionJoueur(String nom_user, String prenom_user, String mdp_user, String mail_user, String phone_user, String adresse_user, String cd_postal_user){
        //public static void InscriptionJoueur(){

            String sql = "INSERT INTO user_flip(nom_user, prenom_user, mdp_user, mail_user, phone_user, adresse_user, cd_postal_user)  VALUES( ?, ? , ?, ?, ?, ?, ?);" +
                    "INSERT INTO Joueur VALUES((SELECT max(id_user) FROM user_flip), 0)";
        database conn = new database();
        PreparedStatement myStmt;
        try {
            myStmt = conn.getExtraConnection().prepareStatement(sql);
            myStmt.setString(1, nom_user);
            myStmt.setString(2, prenom_user);
            myStmt.setString(3, mdp_user);
            myStmt.setString(4, mail_user);
            myStmt.setString(5, phone_user);
            myStmt.setString(6, adresse_user);
            myStmt.setString(7, cd_postal_user);
            myStmt.executeUpdate();

        } catch (SQLException throwables) {
            Log.d("DB", "Impossible d'inscrire");
            throwables.printStackTrace();
        }
    }


}
