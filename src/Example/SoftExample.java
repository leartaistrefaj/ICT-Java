package Example;

public class SoftExample extends Example{

    private String kategoriaShembullit;

    public SoftExample(int nrShembullit, String emriShembullit, String kategoriaShembullit){
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
