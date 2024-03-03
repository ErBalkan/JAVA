# Lokal Değişken Kavramı
Java'da lokal değişkenler, kod blokları içerisinde tanımlanan değişkenlerdir ve __sadece tanımlandıkları kod blokları içerisinde kullanılabilirler.__ __Diğer metot ve sınıflar üzerinden erişimleri yoktur.__ Lokal değişkenler tanımladıkları __({...})__ kod blokları arasında kullanılırlar.

```java
public class JavaPatika {
	static void ekranaBas(){
        // Hatalı kullanım 
       System.out.println(a);
    }    
    
    public static void main(String[] args) {
        int a = 10;
        if (a < 10) {
            int b = 20;
            System.out.println(a);
        }
         // Hatalı kullanım 
        System.out.println(b);
    }
}
```

Bu örnekte __if blokları__ arasında tanımlanmış olan __integer türünde ki "b"__ değişkeni, if bloğunun dışında ekrana bastırılmak istenildiğinde hata ile karşılaşılacaktır. Çünkü __"b"__ değişkeni if blokları arasında tanımlanmıştır ve tanımlandığı kod blokları arasında kullanılabilir.

Dikkat edilmesi gereken diğer bir nokta, main metodun içerisinde tanımlanmış olan __"a"__ değişkeni if bloğu içerisinde kullanılabilir, çünkü if bloğu main metodun bir parçasıdır. Ama __"a"__ değişkeni __ekranaBas();__ metodu içerisinde kullanılamaz, bunun sebebi ise __ekranaBas()__ ve main metodu __farklı iki kod bloklarıdır.__

