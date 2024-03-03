# Kullanıcıdan Veri Alma
Java’da kullanıcıdan veri almak için Scanner sınıfı kullanılır. Ama bu sınıfı kullanmadan önce kodumuza Scanner sınıfını dahil etmemiz gerekir. Bunun için `import` deyimi kullanılır ;

`import java.util.Scanner;`

İmport deyimi projenin en başına yazılır. Kullanıcıdan verileri almak için değişkenlere ihtiyacımız vardır. İlk önce __a__ adında veri tipi __integer__ olan bir değişken oluşturalım. Oluşturduğumuz __a__ değişkenine veriyi kullanıcıdan almak için yapmamız gereken __Scanner__ sınıfını kullanmak. __Scanner__ sınıfından türeyen adı __input__ olan bir nesne tanımlayalım. Sınıf ve Nesne kavramları ilerleyen derslerde detaylıca anlatılacaktır. __Scanner__ sınıfından nesne ürettikten sonra değişkenimize veri almak için, değişkenimizin türüne göre bir kod yazmamız gerekecektir. Eğer değişkenimizin __integer__ türünde ise `input.nextInt()` veya double türünde ise `input.nextDouble()` kod bloğu kullanılmalıdır.

```java
import java.util.Scanner;

public class JavaPatika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;

        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("B sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("A Sayısı : " + a);
        System.out.println("B Sayısı : " + b);
    }
}
```

[alt text](./img/scanner.png)

