package Ora6;

public class Metoda3MesatarjaStudenteve {
    public static void main(String[] args) {
        double m1 = 8.3;
        double m2 = 7.9;
        double mesatarja = mesatarjaStudentit(m1,m2);
        System.out.println("Mesatarja e studenteve eshte " + mesatarja);

    }
        public static double mesatarjaStudentit(double s1, double s2 ) {
        double average;
        average = s1 + s2 /2;
        return average;

        }
}
