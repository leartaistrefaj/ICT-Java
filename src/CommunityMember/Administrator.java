package CommunityMember;

public class Administrator extends Faculty{
    private String mbiemri;
    private String gjinija;
    private int mosha;
    private int nrZyres;
    private int paga;

    public Administrator(int id, String emri, String adressa, String departamenti, String mbiemri, String gjinija, int mosha, int nrZyres, int paga) {
        super(id, emri, adressa, departamenti);
        this.mbiemri = mbiemri;
        this.gjinija = gjinija;
        this.mosha = mosha;
        this.nrZyres = nrZyres;
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

    public int getNrZyres() {
        return nrZyres;
    }

    public void setNrZyres(int nrZyres) {
        this.nrZyres = nrZyres;
    }

    public int getPaga() {
        return paga;
    }

    public void setPaga(int paga) {
        this.paga = paga;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Mbiemri: %s %n Gjinija:%s %n Mosha:%d %n Numri zyres : %d %n %n Paga : %d %n",getMbiemri(),getGjinija(),getMosha(),getNrZyres(),getPaga());
    }
}
