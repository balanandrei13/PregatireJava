import java.util.ArrayList;
import java.util.List;

public class Apartament{
    private int nrApartament;
    private int nrPersoane;
    private int suprafata;

    public static List<Apartament> apartamente = new ArrayList<>();

    public Apartament(int nrApartament, int nrPersoane, int suprafata) {
        this.nrApartament = nrApartament;
        this.nrPersoane = nrPersoane;
        this.suprafata = suprafata;
        apartamente.add(this);
    }

    public int getNrApartament() {
        return nrApartament;
    }

    public void setNrApartament(int nrApartament) {
        this.nrApartament = nrApartament;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public int getSuprafata() {
        return suprafata;
    }

    public void setSuprafata(int suprafata) {
        this.suprafata = suprafata;
    }

    public static List<Apartament> getApartamente() {
        return apartamente;
    }

    public static void setApartamente(List<Apartament> apartamente) {
        Apartament.apartamente = apartamente;
    }

    @Override
    public String toString() {
        return nrApartament + ","+ nrPersoane + ","+ suprafata;}
}