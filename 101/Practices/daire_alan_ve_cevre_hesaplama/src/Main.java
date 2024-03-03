import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14;
        double yaricap;
        double alan;
        double cevre;

        System.out.print("Yarıçap giriniz: ");
        yaricap = scanner.nextDouble();

        alan = PI * (yaricap * yaricap);
        cevre = 2 * PI * yaricap;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);

    }
}