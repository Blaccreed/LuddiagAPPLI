package com.example.luddiagappli;

public class Animateur extends User{
    private String stand;
    public Animateur(String id_user, String nom_user, String prenom_user, String mdp_user, String mail_user ,String phone_user, String adresse_user,String cd_postal_user ,String stand){
        if (this.id_user==null) {
            new User(this.id_user, this.nom_user, this.prenom_user, this.mdp_user, this.mail_user, this.phone_user, this.adresse_user, this.cd_postal_user);
        }
        this->stand = stand;
    }
    static public ValiderNote(String id_user)//n'importe quelle user
    {
        String requetePreparee = "UPDATE note SET validee = True WHERE id_user_1 = "+id_user;

        $req_prep = Connexion::pdo()->prepare($requetePreparee);

        $arrayName = array("tag_jeu" => $id_user);

        try {
            $req_prep->execute($arrayName);
        } catch (PDOException $e) {
            echo "erreur: " . $e->getMessage() . "</br>";
        }
    }

}
/*{



*/