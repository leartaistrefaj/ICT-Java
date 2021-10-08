package Oop_class_and_object_1;

public class FootbollPlayerTest {
    public static void main(String[] args) {
        FootbollPlayer fp1 = new FootbollPlayer();
        fp1.setEmri("Milot");
        fp1.setMbiemri("Rashica");
        fp1.setEkipi("Kosove");
        fp1.setGjatesia(1.80);
        fp1.setMosha(26);
        fp1.setNrLojtarit(7);
        fp1.setPesha(74.5);
        fp1.setId(4789);
        fp1.setPozita("Sulmues");

        FootbollPlayer fp2 = new FootbollPlayer();
        fp1.setEmri("Lionel");
        fp1.setMbiemri("Messi");
        fp1.setEkipi("PS");
        fp1.setGjatesia(1.63);
        fp1.setMosha(28);
        fp1.setNrLojtarit(30);
        fp1.setPesha(70);
        fp1.setId(1111);
        fp1.setPozita("Sulmues");

        System.out.println("Lojtari i dyte eshte " + fp2.getEmri() + fp2.getMbiemri());
    }
}
