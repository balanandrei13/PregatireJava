import java.util.ArrayList;
import java.util.List;

public class Capitol {
    private int codCapitol;
    private int codSantier; //cod din santier
    private String denumireCheltuiala;
    private String unitateMasura;
    private float cantitate;
    private float pretUnitar;

    public static List<Capitol> capitole = new ArrayList<Capitol>();

    public Capitol(int codCapitol, int codSantier, String denumireCheltuiala, String unitateMasura, float cantitate, float pretUnitar) {
        this.codCapitol = codCapitol;
        this.codSantier = codSantier;
        this.denumireCheltuiala = denumireCheltuiala;
        this.unitateMasura = unitateMasura;
        this.cantitate = cantitate;
        this.pretUnitar = pretUnitar;

        capitole.add(this);
    }

    public int getCodCapitol() {
        return codCapitol;
    }

    public void setCodCapitol(int codCapitol) {
        this.codCapitol = codCapitol;
    }

    public int getCodSantier() {
        return codSantier;
    }

    public void setCodSantier(int codSantier) {
        this.codSantier = codSantier;
    }

    public String getDenumireCheltuiala() {
        return denumireCheltuiala;
    }

    public void setDenumireCheltuiala(String denumireCheltuiala) {
        this.denumireCheltuiala = denumireCheltuiala;
    }

    public String getUnitateMasura() {
        return unitateMasura;
    }

    public void setUnitateMasura(String unitateMasura) {
        this.unitateMasura = unitateMasura;
    }

    public float getCantitate() {
        return cantitate;
    }

    public void setCantitate(float cantitate) {
        this.cantitate = cantitate;
    }

    public float getPretUnitar() {
        return pretUnitar;
    }

    public void setPretUnitar(float pretUnitar) {
        this.pretUnitar = pretUnitar;
    }

    @Override
    public String toString() {
        return codCapitol +
                "," + codSantier +
                "," + denumireCheltuiala +
                "," + unitateMasura +
                "," + cantitate +
                "," + pretUnitar;
    }
}
