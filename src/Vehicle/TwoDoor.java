package Vehicle;

public class TwoDoor extends Car{
    private int nrDyerve;

    public TwoDoor(String tipi, String ngjyra, int nrRrotave, double cmimi, double shpejtesia, String karburanti, int nrDyerve) {
        super(tipi, ngjyra, nrRrotave, cmimi, shpejtesia, karburanti);
        this.nrDyerve = nrDyerve;
    }

    public int getNrDyerve() {
        return nrDyerve;
    }

    public void setNrDyerve(int nrDyerve) {
        this.nrDyerve = nrDyerve;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("Numri dyerve %d %n",getNrDyerve());
    }
}
