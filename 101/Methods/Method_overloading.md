# Metotlarda Overloading (Aşırı Yüklenme)
Java'da, iki veya daha fazla metot, parametreler açısından farklılık gösteriyorsa __(farklı sayıda parametre, farklı türde parametre veya her ikisi)__ aynı isime sahip olabilir. Bu duruma metotlarda __"Overloading"__ yani aşırı yüklenme işlemi denir.

Buradaki amaç aynı işlemi farklı parametrelerle yapacak olan metot ismini tek seferde kullanmaktır. __Overloading__ işlemi __"Nesne Yönelimli Programlamada"__ da çok kullanılmaktadır.

```java
void func() { ... }
void func(int a) { ... }
float func(double a) { ... }
float func(int a, float b) { ... }
```
Burada `func()` metodu __(overloading)__ aşırı yüklenmiştir. Bu metotlar aynı isime sahiptir ancak farklı parametreler kabul eder.

```Not: Yukarıdaki metotların dönüş türleri aynı değildir. Bunun nedeni, metot aşırı yüklemesinin dönüş türleriyle ilişkili olmamasıdır. Aşırı yüklenmiş metotlar aynı veya farklı dönüş türlerine sahip olabilir, ancak parametreler açısından farklılık göstermeleri gerekir.```

```java
public class JavaPatika {static void ekranaYaz(int a) {
        System.out.println("Parametreler : " + a);
    }

    static void ekranaYaz(int a, int b) {
        System.out.println("Parametreler : " + a + " ve " + b);
    }

    public static void main(String[] args) {
        ekranaYaz(5);
        ekranaYaz(10, 2);
    }
}
// Çıktısı :
// Parametreler : 5
// Parametreler : 10 ve 2
```