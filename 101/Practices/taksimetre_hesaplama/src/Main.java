import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double taksimetre_acilis_ucreti = 10;
        double km_basina_tutar = 2.20;
        double katedilen_km;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilen yol(km): ");
        katedilen_km = scanner.nextDouble();

        double sonuc = (katedilen_km * km_basina_tutar) + 10;
        double tutar = sonuc < 20 ? 20 : sonuc;

        System.out.println("Tutar: " + tutar);
    }
}