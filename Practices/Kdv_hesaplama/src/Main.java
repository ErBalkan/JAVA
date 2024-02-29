import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar;
        double KDV;
        double kdvli_tutar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hesaplanacak tutar: ");
        tutar = scanner.nextInt();
        KDV = tutar > 1000 ? 8 : 18;
        kdvli_tutar = tutar * (1+KDV/100);
        System.out.println("KDVli tutar: " + kdvli_tutar);
    }
}