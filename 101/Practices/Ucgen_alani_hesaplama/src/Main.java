import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz: ");
        a = scanner.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        b = scanner.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + c);

    }
}