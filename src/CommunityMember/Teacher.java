package CommunityMember;

public class Teacher extends Faculty{
    private String mbiemri;
    private String gjinija;
    private int mosha;
    private String lenda;
    private int paga;

    public Teacher(int id, String emri, String adressa, String departamenti, String mbiemri, String gjinija, int mosha, String lenda, int paga) {
        super(id, emri, adressa, departamenti);
        this.mbiemri = mbiemri;
        this.gjinija = gjinija;
        this.mosha = mosha;
        this.lenda = lenda;
        this.paga = paga;
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

    public String getLenda() {
        return lenda;
    }

    public void setLenda(String lenda) {
        this.lenda = lenda;
    }

    public int getPaga() {
        return paga;
    }

    public void setPaga(int paga) {
        this.paga = paga;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Mbiemri: %s %n Gjinija:%s %n Mosha:%d  %n Paga : %d %n Lenda: %s %n",getMbiemri(),getGjinija(),getMosha(),getPaga(), getLenda());
    }
}
