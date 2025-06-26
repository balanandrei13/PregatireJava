import java.util.ArrayList;
import java.util.List;

public class Caine implements AnimaluteActivities{
    private String nume;
    private int nrPicioare;
    private boolean areZgarda;
    public static List<Caine> listaCaini = new ArrayList<Caine>();

    public Caine(String nume, int nrPicioare, boolean areZgarda) {
        this.nume = nume;
        this.nrPicioare = nrPicioare;
        this.areZgarda = areZgarda;
        listaCaini.add(this);
    }

    @Override
    public String toString() {
        return  nume +
                "," + nrPicioare +
                "," + areZgarda;
    }

    public Caine(){
        this.nume = "Azorel";
        this.nrPicioare = 4;
        this.areZgarda = true;
        listaCaini.add(this);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }

    public boolean isAreZgarda() {
        return areZgarda;
    }

    public void setAreZgarda(boolean areZgarda) {
        this.areZgarda = areZgarda;
    }

    public static List<Caine> getListaCaini() {
        return listaCaini;
    }

    public static void setListaCaini(List<Caine> listaCaini) {
        Caine.listaCaini = listaCaini;
    }

    @Override
    public void faceZgomot() {
        System.out.println("Ham Ham!");
    }
}
