package Ora6;

public class Metoda2MinMosha {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        int c = minMosha(a, b);
        System.out.println("Mosha minimale eshte  " + c);
    }

    public static int minMosha(int n1, int n2) {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;

        return min;
    }
}
