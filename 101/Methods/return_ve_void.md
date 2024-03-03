# Return ve Void Kullanımı
Java'da iki tür metot mevcuttur bunlar : __Return (geri dönüşü olan)__ , __Void (geri dönüşü olmayan)__ metotlar. Return metotlar çağrıldığında geriye bir değer döndürürken, Void metotlar geriye bir değer döndürmemektedir.

## Return Metotlar
Java'da oluşturduğumuz bir metodun bir değer üretmesini istendiğinde, __"return"__ deyimi kullanılır. Metot içerisinde yazılan kod parçacıkları çalışacaktır, buna ek olarak metot içinde oluşturduğumuz bir veriyi dışarıya aktarma ihtiyacı duyabiliriz, bu durumlarda __"return"__ deyimi kullanılır. __Geri dönecek değerin veri tipi, metot tanımlarken verdiğimiz veri tipi ile aynı olmalıdır.__ Aksi halde derleyici tarafından hata alınır.

```java
  static int toplam(int x, int y) {
    return x + y;
  }
```

## Void Metotlar
Java'da yazılan bir metodun geriye bir değer döndürmesini istemiyor, sadece metot içindeki kod bloğunun çalışmasını istersek __"void"__ deyimi kullanmalıdır. Metot tanımlanırken veri tipi kısmına __"void"__ deyimi yazılması yeterlidir. __Void__ metotlar içerisinde __"return"__ deyimi kullanılamamaktadır.

```java
  static void toplam(int x, int y) {
      System.out.println(x+y);
  }
```



