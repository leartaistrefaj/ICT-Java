package Animals;

public class Bird extends Animal{
    private String llojiZogut;

    public Bird(String emri, int mosha, String ngjyra, String ushqimi, String lloji, String llojiZogut) {
        super(emri, mosha, ngjyra, ushqimi, lloji);
        this.llojiZogut = llojiZogut;
    }

    public String getLlojiZogut() {
        return llojiZogut;
    }

    public void setLlojiZogut(String llojiZogut) {
        this.llojiZogut = llojiZogut;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Lloji i zogut eshte: %s &n",getLlojiZogut());
    }
}



