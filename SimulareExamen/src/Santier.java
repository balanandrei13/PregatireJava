import java.util.ArrayList;
import java.util.List;

public class Santier {
    private int codSantier;
    private String localitate;
    private String strada;
    private String obiectiv;
    private float valoareObiectiv;

    public static List<Santier> santiere= new ArrayList<Santier>();

    public Santier(int codSantier, String localitate, String strada, String obiectiv, float valoareObiectiv) {
        this.codSantier = codSantier;
        this.localitate = localitate;
        this.strada = strada;
        this.obiectiv = obiectiv;
        this.valoareObiectiv = valoareObiectiv;

        santiere.add(this);
    }

    public int getCodSantier() {
        return codSantier;
    }

    public void setCodSantier(int codSantier) {
        this.codSantier = codSantier;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getObiectiv() {
        return obiectiv;
    }

    public void setObiectiv(String obiectiv) {
        this.obiectiv = obiectiv;
    }

    public float getValoareObiectiv() {
        return valoareObiectiv;
    }

    public void setValoareObiectiv(float valoareObiectiv) {
        this.valoareObiectiv = valoareObiectiv;
    }

    public static List<Santier> getSantiere() {
        return santiere;
    }

    public static void setSantiere(List<Santier> santiere) {
        Santier.santiere = santiere;
    }

    @Override
    public String toString() {
        return codSantier +
                "," + localitate +
                "," + strada +
                "," + obiectiv +
                "," + valoareObiectiv;
    }
}
