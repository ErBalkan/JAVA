import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName,password;
        String defaultuserName = "erhan";
        String defaultPassword = "balkan";

        System.out.print("Kullanıcı adı: ");
        userName = scanner.nextLine();
        System.out.print("Şifre: ");
        password = scanner.nextLine();

        if(userName.equals(defaultuserName) && password.equals(defaultPassword))
            System.out.println("Giriş yapıldı.");
        else {
            System.out.println("Bilgileriniz yanlış !");
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz? (E/H): ");
            String cevap = scanner.nextLine();
            if(cevap.equals("E")){
                System.out.println("Yeni parola: ");
                String newPassword = scanner.nextLine();
                if(defaultPassword.equals(newPassword)){
                    System.out.println("Yeni parolanız eski parolanız ile aynı olamaz.");
                }else{
                    defaultPassword = newPassword;
                    System.out.println("Parola değiştirildi.");
                }
            }
        }
    }
}