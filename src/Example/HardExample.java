package Example;

public class HardExample extends Example{

    private String kategoriaShembullit;

    public HardExample(int nrShembullit, String emriShembullit, String kategoriaShembullit){
        super(nrShembullit, emriShembullit);
        this.kategoriaShembullit = kategoriaShembullit;

    }

    public String getKategoriaShembullit() {
        return kategoriaShembullit;
    }

    public void setKategoriaShembullit(String kategoriaShembullit) {
        this.kategoriaShembullit = kategoriaShembullit;
    }

    @Override
    public String toString() {
        return super.toString() + " i perket kategorise " + kategoriaShembullit;
    }
}
