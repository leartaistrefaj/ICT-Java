package Oop_class_and_object_1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setEmri("Learta");
        s1.setMbiemri("Istrefaj");
        s1.setId(181944528);
        s1.setMosha(21);
        s1.setVendbanimi("Peje");
        s1.setFakulteti("UBT");
        s1.setDrejtimi("Shkenca kompjterike dhe inxhinieri");
        s1.setVitiAkademik(18/19);
        s1.setNotaMesatare(8.7);

        Student s2 = new Student();
        s2.setEmri("Elsa");
        s2.setMbiemri("Selmani");
        s2.setId(181944110);
        s2.setMosha(21);
        s2.setVendbanimi("Gjakove");
        s2.setFakulteti("UP");
        s2.setDrejtimi("Inxhinieri kompjuterike");
        s2.setVitiAkademik(18/19);
        s2.setNotaMesatare(8.2);

        System.out.println("Dy studente te perzgjedhura nga ky program jane:" + s1.getEmri() + " dhe " + s2.getEmri());

    }
}
