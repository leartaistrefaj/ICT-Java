package Ora3;
import java.util.Scanner;
public class SyprinaKatrorit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shtypni vleren e brinjes a");
        int a = scan.nextInt();
        int syprina= 4*a;
        System.out.println("Syprina e katrorit me brinjen a= " + a + " eshte e barabarte me  " + syprina +  " cm " );
    }
}
