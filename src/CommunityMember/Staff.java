package CommunityMember;

public class Staff extends Employee{
    private String mbiemri;
    private String gjinija;
    private int mosha;

    public Staff(int id, String emri, String adressa, String mbiemri, String gjinija, int mosha) {
        super(id, emri, adressa);
        this.mbiemri = mbiemri;
        this.gjinija = gjinija;
        this.mosha = mosha;
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

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Mbiemri: %s %n Gjinija:%s %n Mosha:%d %n",getMbiemri(),getGjinija(),getMosha());
    }
}
