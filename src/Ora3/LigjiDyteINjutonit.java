package Ora3;
import java.util.Scanner;
public class LigjiDyteINjutonit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Shtypni vleren e m-se");
        int m=scan.nextInt();
        System.out.println("Shtypni vleren e a-se");
        int a=scan.nextInt();
        int F = m*a;
        System.out.println("Ligji i dyte i Njutonit gjendet nga formula F=m*a ku ne kete rast F = " + F);
    }
}
