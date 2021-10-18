package Family;

public class Father extends Grandfather{
    private String emriPrindit;

    public Father(String emri, String mbiemri, int mosha, String emriPrindit) {
        super(emri, mbiemri, mosha);
        this.emriPrindit = emriPrindit;
    }

    public String getEmriPrindit() {
        return emriPrindit;
    }

    public void setEmriPrindit(String emriPrindit) {
        this.emriPrindit = emriPrindit;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Emri i prindit: %s &n" + getEmriPrindit());
    }
}
