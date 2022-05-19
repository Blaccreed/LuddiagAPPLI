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

    public User(int id_user, String nom_user, String mdp_user, String mail_user, String phone_user, String adresse_user, String cd_postal_user)
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
                Log.d("MAIL", mail);
            }

        } catch (SQLException e) {
            Log.d("DB", "Erreur pour se connecter");
            e.printStackTrace();
        }
    }

    public static void InscriptionJoueur(String nom_user, String prenom_user, String mdp_user, String mail_user, String phone_user, String adresse_user, String cd_postal_user){
        String sql = "INSERT INTO user_flip (nom_user, prenom_user, mdp_user, mail_user, phone_user, adresse_user, cd_postal_user)  VALUES( ?1, ?2 , ?3, ?4, ?5, ?6, ?7);  " +
                "INSERT INTO joueur(id_user, nombre_points) VALUES(SELECT MAX(id_user) FROM user_flip, 0);";

        String sql2 = "SELECT * FROM user_flip WHERE mail_user='" +  mail_user + "'";

        database db = new database();
        try {
            PreparedStatement st = db.getExtraConnection().prepareStatement(sql);
            st.setString(1, nom_user);
            st.setString(2, prenom_user);
            st.setString(3, mdp_user);
            st.setString(4, mail_user);
            st.setString(5, phone_user);
            st.setString(5, adresse_user);
            st.setString(6, cd_postal_user);
            st.executeUpdate();

        } catch (SQLException e) {
            Log.d("DB", "Erreur inscription");
            e.printStackTrace();
        }
    }   

}
