package Vehicle;

public class WheeledVehicle extends Vehicle{
    private int nrRrotave;

    public WheeledVehicle(String tipi, String ngjyra, int nrRrotave) {
        super(tipi, ngjyra);
        this.nrRrotave = nrRrotave;
    }

    public int getNrRrotave() {
        return nrRrotave;
    }

    public void setNrRrotave(int nrRrotave) {
        this.nrRrotave = nrRrotave;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Numri rrotave %d %n",getNrRrotave());
    }
}
