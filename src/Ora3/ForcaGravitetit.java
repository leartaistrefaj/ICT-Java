package Ora3;
import java.util.Scanner;
public class ForcaGravitetit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shtypni vleren e m-se");
        int m = scan.nextInt();
        System.out.println("Shtypni vleren e g-se");
        int g = scan.nextInt();
        int F = m * g;
        System.out.println("Forca e gravitetit gjendet me formulen e F=m*g dhe ne kete rast vlera e F-se eshte = " + F);
    }
}
