package Ora6;

public class Metoda1MaxMosha {
    public static void main(String[] args) {
        int a = 11;
        int b = 6;
        int c = maxMosha(a, b);
        System.out.println("mosha me e madhe eshte  = " + c);
    }
    public static int maxMosha(int n1, int n2) {
        int max;
        if (n1 > n2)
            max = n1;
        else
            max = n2;

        return max;
    }
}
