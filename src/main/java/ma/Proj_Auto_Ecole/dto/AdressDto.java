package ma.Proj_Auto_Ecole.dto;

public class AdressDto {

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
        return "AdressDto{" +
                "ville='" + ville + '\'' +
                ", rue='" + rue + '\'' +
                '}';
    }
}
