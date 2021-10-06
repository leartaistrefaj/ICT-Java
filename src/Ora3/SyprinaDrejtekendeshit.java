package Ora3;
import java.util.Scanner;
public class SyprinaDrejtekendeshit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shtypni vleren e brinjes a");
        int a = scan.nextInt();
        System.out.println("Shtypni vleren e brinjes b");
        int b = scan.nextInt();
        int syprina = a*b;
        System.out.println("Syprina e drejtekendeshit me brinjen a =  " + a + " dhe me brinjen b = " + b + " eshte e barabarte me " + syprina + "cm");
    }
}
