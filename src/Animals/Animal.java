package Animals;

public class Animal {

    private String emri;
    private int mosha;
    private String ngjyra;
    private String ushqimi;
    private String lloji;

    public Animal(String emri, int mosha, String ngjyra,String ushqimi, String lloji) {
        this.emri = emri;
        this.mosha = mosha;
        this.ngjyra = ngjyra;
        this.ushqimi = ushqimi;
        this.lloji = lloji;
    }
    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public String getUshqimi() {
        return ushqimi;
    }

    public void setUshqimi(String ushqimi) {
        this.ushqimi = ushqimi;
    }

    public String getLloji() {
        return lloji;
    }

    public void setLloji(String lloji) {
        this.lloji = lloji;
    }

    @Override
    public String toString() {
        return String.format("Emri: %s %n Mosha: %d %n Ngjyra: %s %n Ushqimi: %s %n LLoji: %s ",getEmri(),getMosha(),
                getNgjyra(),getUshqimi(),getLloji());
    }
}


