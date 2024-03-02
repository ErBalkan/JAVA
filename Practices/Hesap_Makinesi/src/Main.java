import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1,number2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");
        number1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        number2 = scanner.nextDouble();

        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        System.out.print("Yapmak istediğiniz işlemini seçiniz: ");
        int select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Sonuç: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Sonuç: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Sonuç: " + (number1 * number2));
                break;
            case 4:
                System.out.println("Sonuç: " + (number1 / number2));
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız...");
        }
    }
}