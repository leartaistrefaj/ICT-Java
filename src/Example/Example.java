package Example;

public class Example {

    private int nrShembullit;
    private String emriShembullit;

    public Example(int nrShembullit, String emriShembullit){
        this.nrShembullit = nrShembullit;
        this.emriShembullit = emriShembullit;
    }

    public int getNrShembullit() {
        return nrShembullit;
    }

    public String getEmriShembullit() {
        return emriShembullit;
    }

    public void setNrShembullit(int nrShembullit) {
        this.nrShembullit = nrShembullit;
    }

    public void setEmriShembullit(String emriShembullit) {
        this.emriShembullit = emriShembullit;
    }

    @Override
    public String toString() {
        return " Shembulli me numrin " + nrShembullit + " ka emrin " + emriShembullit;
    }
}
