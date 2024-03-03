import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double armut_kg_fiyat = 2.14;
        double elma_kg_fiyat = 3.67;
        double domates_kg_fiyat = 1.11;
        double muz_kg_fiyat = 0.95;
        double patlican_kg_fiyat = 5;

        double armut_kg;
        double elma_kg;
        double domates_kg;
        double muz_kg;
        double patlican_kg;
        double toplam_tutar;

        System.out.print("Armut kaç kilo: ");
        armut_kg = scanner.nextDouble();
        System.out.print("Elma kaç kilo: ");
        elma_kg = scanner.nextDouble();
        System.out.print("Domates kaç kilo: ");
        domates_kg = scanner.nextDouble();
        System.out.print("Muz kaç kilo: ");
        muz_kg = scanner.nextDouble();
        System.out.print("Patlıcan kaç kilo: ");
        patlican_kg = scanner.nextDouble();

        double armut_tutar = armut_kg * armut_kg_fiyat;
        double elma_tutar = elma_kg * elma_kg_fiyat;
        double domates_tutar = domates_kg * domates_kg_fiyat;
        double muz_tutar = muz_kg * muz_kg_fiyat;
        double patlican_tutar = patlican_kg * patlican_kg_fiyat;
        toplam_tutar = armut_tutar + elma_tutar + domates_tutar + muz_tutar + patlican_tutar;

        System.out.println("Toplam tutar: " + toplam_tutar);


    }
}