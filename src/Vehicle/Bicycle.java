package Vehicle;

public class Bicycle extends WheeledVehicle{
    String modeli;

    public Bicycle(String tipi, String ngjyra, int nrRrotave, String modeli) {
        super(tipi, ngjyra, nrRrotave);
        this.modeli = modeli;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Modeli: %s %n",getModeli());
    }
}
