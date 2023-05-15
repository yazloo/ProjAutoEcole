package ma.Proj_Auto_Ecole.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="Eleves")
public class ElevesEntity {
    @Id
    private String cin;
    private String nom;
    private String prénom;
    private Date date_naissance;
    private  Date date_inscription;
    private long nbr_heurs;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "rue", column = @Column(name = "RUE")),
            @AttributeOverride(name = "ville", column = @Column(name = "VILLE_de_eleve")),
    })
    private  AdressEntity adress ;

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

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public Date getDate_inscription() {
        return date_inscription;
    }

    public void setDate_inscription(Date date_inscription) {
        this.date_inscription = date_inscription;
    }

    public long getNbr_heurs() {
        return nbr_heurs;
    }

    public void setNbr_heurs(long nbr_heurs) {
        this.nbr_heurs = nbr_heurs;
    }

    public AdressEntity getAdress() {
        return adress;
    }

    public void setAdress(AdressEntity adressEntity) {
        this.adress = adressEntity;
    }

    @Override
    public String toString() {
        return "ElevesEntity{" +
                "cin='" + cin + '\'' +
                ", nom='" + nom + '\'' +
                ", prénom='" + prénom + '\'' +
                ", date_naissance=" + date_naissance +
                ", date_inscription=" + date_inscription +
                ", nbr_heurs=" + nbr_heurs +
                '}';
    }
}
