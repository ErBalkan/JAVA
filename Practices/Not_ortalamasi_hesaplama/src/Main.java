import java.util.Scanner;

public static void main(String[] args) {
    int Matematik,Fizik,Kimya,Türkçe,Tarih,Müzik;
    int ortalama;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Matematik notunuzu giriniz: ");
    Matematik = scanner.nextInt();
    System.out.print("Fizik notunuzu giriniz: ");
    Fizik = scanner.nextInt();
    System.out.print("Kimya notunuzu giriniz: ");
    Kimya = scanner.nextInt();
    System.out.print("Türkçe notunuzu giriniz: ");
    Türkçe = scanner.nextInt();
    System.out.print("Tarih notunuzu giriniz: ");
    Tarih = scanner.nextInt();
    System.out.print("Müzik notunuzu giriniz: ");
    Müzik = scanner.nextInt();

    ortalama = (Matematik + Fizik + Kimya + Türkçe + Tarih + Müzik) / 6;
    String sonuc = ortalama >= 60 ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";

    System.out.println("Ortalamanız: " + ortalama + " " + sonuc);


}