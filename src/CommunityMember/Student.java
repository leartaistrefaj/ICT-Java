package CommunityMember;

public class Student extends CommunityMember{
    private String mbiemri;
    private String gjinija;
    private String mosha;
    private String drejtimi;
    private double notaMesatare;
    private int vitiAkademik;

    public Student(int id, String emri, String mbiemri, int mosha, String gjinia, String adressa, String drejtimi,
                   double notaMesatare,int vitiAkademik) {
        super(id, emri, adressa);
        this.drejtimi = drejtimi;
        this.notaMesatare = notaMesatare;
        this.vitiAkademik = vitiAkademik;
    }

    public String getDrejtimi() {
        return drejtimi;
    }

    public void setDrejtimi(String drejtimi) {
        this.drejtimi = drejtimi;
    }

    public double getNotaMesatare() {
        return notaMesatare;
    }

    public int getVitiAkademik() {
        return vitiAkademik;
    }

    public void setVitiAkademik(int vitiAkademik) {
        this.vitiAkademik = vitiAkademik;
    }

    public void setNotaMesatare(double notaMesatare) {
        this.notaMesatare = notaMesatare;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getGjinija() {
        return gjinija;
    }

    public void setGjinija(String gjinija) {
        this.gjinija = gjinija;
    }

    public String getMosha() {
        return mosha;
    }

    public void setMosha(String mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Mbiemri: %s %n Gjinija:%s %n Mosha:%d %n Drejtimi: %s %n Nota Mesatare %.2f %n Viti akademik: %d %n",getMbiemri(),getGjinija(), getMosha(),getDrejtimi(),getNotaMesatare(),getVitiAkademik());
    }
}
