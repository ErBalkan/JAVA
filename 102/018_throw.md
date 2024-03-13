# Throw (Hata Fırlatmak)

__"throw"__ Anahtar Kelimesi ile Hata Fırlatmak


__"try-catch"__ yöntemiyle hatayı kontrol edip uygulamanın kırılmasını engelleyebiliyorduk. Bir başka yöntem de hata fırlatarak hatanın çağrıldığı noktada kontrolünün sağlanmasıdır.

```java
public int indexOf(String value, String searchedText) throws BatuxException { 	
if(value == null) { 
    throw new BatuxException("Gelen değer null olamaz!"); 	
    }
return value.indexOf(searchedText); 
}
```

Yukarıdaki örnekte bir String değer içinde aranan ifadenin hangi indekste olduğunu bulmaya çalışıyoruz. Fakat, gönderilen değer __"null"__ ise __"throw"__ anahtar kelimesi ile yukarıda oluşturduğumuz kendi hata tipimizden bir hata fırlatıyoruz.

```java
import java.util.Scanner; 
public class HataYakala { 
public static void checkAge(int age) { 
    if (age < 18) { 
        throw new ArithmeticException("Hatalı Yaş");         
    }

System.out.println("Yasaktan Muaf !");     
}

public static void main(String[] args) { 
    Scanner scan = new Scanner(System.in); 
    System.out.print("Yaşınız : "); 
    int a = scan.nextInt(); 
    try {
        checkAge(a);
    } 
    catch (ArithmeticException e) {
        System.out.println(e.getMessage());
    }
}
}
```

# Java’daki Bazı Hata Sınıfları


Java’da bazı ortak hatalar için önceden tanımlanmış hata sınıfları vardır. Bunlardan en çok karşılaşılanları kısaca inceleyelim:



1. __ArithmeticException:__ Sıfıra bölme başta olmak üzere matematiksel hataları belirtir.


2. __ArrayIndexOutOfBoundsException:__ Bir dizinin aralığı dışında elemanına erişmeye çalışıldığında fırlatılır.


3. __ClassCastException:__ Geçersiz tür dönüşümü işlemlerinde fırlatılır.


4. __IllegalArgumentException:__ Metoda verilen parametrelerden biri hatalı olduğunda fırlatılır.


5. __IndexOutOfBoundsException:__ Hatalı indeks erişimlerinde fırlatılır.


6. __NullPointerException:__ Henüz değer ataması yapılmamış değişkenler üzerinde işlem yapmaya çalışıldığında fırlatılır. Java’da en çok karşılaşılan hatalardan biridir. Bu hataya karşı önlem almak için yaptığımız kontrollere null kontrolü (null-check) denir.


7. __NumberFormatException:__ Bir String değerini sayısal bir türe dönüştürmeye çalıştığımızda, eğer String değer düzgün bir sayı ifade etmiyorsa fırlatılır.


8. __UnsupportedOperationException:__ Desteklenmeyen bir iş yapmaya çalışıldığında fırlatılır.