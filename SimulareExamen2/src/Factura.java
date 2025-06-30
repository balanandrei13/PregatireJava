import java.util.ArrayList;
import java.util.List;

public class Factura {
    private String denumire;
    private String repartizare;
    private double valoare;

    public static List<Factura> facturi = new ArrayList<>();

    public Factura(String denumire, String repartizare, double valoare) {
        this.denumire = denumire;
        this.repartizare = repartizare;
        this.valoare = valoare;
        facturi.add(this);
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getRepartizare() {
        return repartizare;
    }

    public void setRepartizare(String repartizare) {
        this.repartizare = repartizare;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    public static List<Factura> getFacturi() {
        return facturi;
    }

    public static void setFacturi(List<Factura> facturi) {
        Factura.facturi = facturi;
    }

    @Override
    public String toString() {
        return denumire + "," + repartizare + ","+ valoare;}
}