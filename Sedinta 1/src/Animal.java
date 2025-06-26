public abstract class Animal {
    private String nume;
    private int nrPicioare;

    public Animal(String nume, int nrPicioare) {
        this.nume = nume;
        this.nrPicioare = nrPicioare;
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
}
