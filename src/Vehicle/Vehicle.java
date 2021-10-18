package Vehicle;

public class Vehicle {
    private String tipi;
    private String ngjyra;

    public Vehicle(String tipi, String ngjyra) {
        this.tipi = tipi;
        this.ngjyra = ngjyra;
    }

    public String getTipi() {
        return tipi;
    }

    public void setTipi(String tipi) {
        this.tipi = tipi;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    @Override
    public String toString() {
        return String.format("Tpi automjetit: %s %n  Ngjyra : %s %n",getTipi(),getNgjyra());
    }
}
