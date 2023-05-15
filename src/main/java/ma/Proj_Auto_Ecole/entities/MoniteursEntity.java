package ma.Proj_Auto_Ecole.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="Moniteur")
public class MoniteursEntity {
    @Id
    @Column(name ="Cin_Moniteur")
    private String cin;
    private  String nom;
    private  String prenom;
    private Date date_naissance;

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    @Override
    public String toString() {
        return "MoniteursEntity{" +
                "cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date_naissance=" + date_naissance +
                '}';
    }
}
