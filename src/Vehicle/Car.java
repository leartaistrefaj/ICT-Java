package Vehicle;

public class Car extends WheeledVehicle{
    private double cmimi;
    private double shpejtesia;
    private String karburanti;

    public Car(String tipi, String ngjyra, int nrRrotave, double cmimi, double shpejtesia, String karburanti) {
        super(tipi, ngjyra, nrRrotave);
        this.cmimi = cmimi;
        this.shpejtesia = shpejtesia;
        this.karburanti = karburanti;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    public double getShpejtesia() {
        return shpejtesia;
    }

    public void setShpejtesia(double shpejtesia) {
        this.shpejtesia = shpejtesia;
    }

    public String getKarburanti() {
        return karburanti;
    }

    public void setKarburanti(String karburanti) {
        this.karburanti = karburanti;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Cmimi: %.2f %n Shpejtesia %.2f %n Karburanti: %s %n",getCmimi(),getShpejtesia(),getKarburanti());
    }
}
