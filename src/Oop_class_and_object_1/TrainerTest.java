package Oop_class_and_object_1;

public class TrainerTest {
    public static void main(String[] args) {
        Trainer t1 = new Trainer();
        t1.setEmri("Egzona");
        t1.setMbiemri("Krasniqi");
        t1.setId(121);
        t1.setMosha(25);
        t1.setVendbanimi("Prishtine");
        t1.setEkipi("KB Prishtina");
        t1.setGjatesia(1.72);
        t1.setPesha(56);

        Trainer t2 = new Trainer();
        t2.setEmri("Jeta");
        t2.setMbiemri("Basha");
        t2.setId(122);
        t2.setMosha(31);
        t2.setVendbanimi("Peje");
        t2.setEkipi("KB Peja");
        t2.setGjatesia(1.80);
        t2.setPesha(70);

        System.out.println("Trainere ne KB Peja eshte " + t2.getEmri());
        System.out.println("Trainere ne KB Prishtina eshte " + t1.getEmri());
    }
}
