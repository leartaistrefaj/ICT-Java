package Oop_class_and_object_1;

public class ProfesorTest {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor();
        prof1.setEmri("Naim");
        prof1.setMbiemri("Sulejmani");
        prof1.setId(11);
        prof1.setMosha(30);
        prof1.setVendbanimi("Prishtine");
        prof1.setFakulteti("Rinvest");
        prof1.setDepartamenti("Shkenca kompjuterike");
        prof1.setNrLendeve(3);

        System.out.println("Ligjeruesi per grupin Java mobile app and android ne Ict eshte: " + prof1.getEmri()  +  prof1.getMbiemri());
    }
}
