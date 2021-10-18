package Animals;

public class Mammal extends Animal{
    private String llojiGjitarit;

    public Mammal(String emri, int mosha, String ngjyra, String ushqimi, String lloji, String llojiGjitarit) {
        super(emri, mosha, ngjyra, ushqimi, lloji);
        this.llojiGjitarit = llojiGjitarit;
    }

    public String getLlojiGjitarit() {
        return llojiGjitarit;
    }

    public void setLlojiGjitarit(String llojiGjitarit) {
        this.llojiGjitarit = llojiGjitarit;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Lloji i zogut eshte: %s &n",getLlojiGjitarit());
    }
}
