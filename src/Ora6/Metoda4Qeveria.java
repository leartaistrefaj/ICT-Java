package Ora6;

public class Metoda4Qeveria {
    public static void main(String[] args) {
        int vv = 11;
        int ldk = 6;
        int nrK = maxKomuna(vv, ldk);
        System.out.println("Partia me me se shumti komuna te fituara ne Kosove eshte vv me " + nrK + " komuna ");
    }
    public static int maxKomuna(int n1, int n2) {
        int qeveria;
        if (n1 > n2)
            qeveria = n1;
        else
            qeveria = n2;

        return qeveria;
    }
}
