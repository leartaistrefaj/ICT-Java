package CommunityMember;

public class Alumnus extends CommunityMember{
    private String mbiemri;
    private String gjinija;
    private int mosha;

    public Alumnus(int id, String emri, String adressa, String mbiemri,String gjinija, int mosha) {
        super(id, emri, adressa);
        this.mbiemri = mbiemri;
        this.mosha = mosha;
        this.gjinija = gjinija;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public String getGjinija() {
        return gjinija;
    }

    public void setGjinija(String gjinija) {
        this.gjinija = gjinija;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Mbiemri: %s %n Gjinija:%s %n Mosha:%d %n",getMbiemri(),getGjinija(),getMosha());
    }
}
