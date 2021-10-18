package Vehicle;

public class Boat extends Vehicle{
    private String emri;
    private int shpejetesia;
    private double cmimi;

    public Boat(String tipi, String ngjyra, String emri, int shpejetesia, double cmimi) {
        super(tipi, ngjyra);
        this.emri = emri;
        this.shpejetesia = shpejetesia;
        this.cmimi = cmimi;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getShpejetesia() {
        return shpejetesia;
    }

    public void setShpejetesia(int shpejetesia) {
        this.shpejetesia = shpejetesia;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Emri %s %n Shpejtesia maksimale %d %n Cmimi: %.2f %n",getEmri(),getShpejetesia(),getCmimi());
    }
}
