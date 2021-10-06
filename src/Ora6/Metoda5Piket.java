package Ora6;

public class Metoda5Piket {
    public static void main(String[] args) {
        metodaPerRenditjenEPikeve(255.7);
    }

    public static void metodaPerRenditjenEPikeve(double piket) {
        if (piket >= 202.5) {
            System.out.println("Ranku:A1");
        }else if (piket >= 122.4) {
            System.out.println("Ranku:A2");
        }else {
            System.out.println("Ranku:A3");
        }
    }
}
