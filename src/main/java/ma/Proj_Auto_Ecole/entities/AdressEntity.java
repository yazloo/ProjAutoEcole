package ma.Proj_Auto_Ecole.entities;

import javax.persistence.Embeddable;

@Embeddable
public class AdressEntity {
    private String ville;
    private String rue;

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    @Override
    public String toString() {
        return "AdressEntity{" +
                "ville='" + ville + '\'' +
                ", rue='" + rue + '\'' +
                '}';
    }
}
