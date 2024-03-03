import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double boy;
        double kilo;
        double indeks;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();

        indeks = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);
    }
}