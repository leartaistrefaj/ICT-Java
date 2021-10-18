package Family;

public class Grandfather {
    private String emri;
    private String mbiemri;
    private int mosha;

    public Grandfather(String emri, String mbiemri, int mosha) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
    }

    public String getEmri() {
        return emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return String.format("Emri: %s %n Mbiemri: %s %n Mosha %d",getEmri(),getMbiemri(),getMosha());
    }
}
