[alt text](https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java101/programlamaya-baslangic/figures/java-syntax.jpg)

Yukarıda ki örnekte göreceğiniz gibi, en üst kısımda `public class Sinif` komutu ile bir sınıf (class) oluşturuyoruz. Java'da sınıflar içerisine kodlarımızı yazarız ve ilerleyen derslerde sınıflar konusuna derin bir giriş yapacağız. Daha sonra program çalıştığında çalışan bir metot olan `Main Metodu` sınıfımızın içerisine yazarız çünkü programı çalıştırmak için derleyici ilk olarak main metot içerisindeki komutları okuyacaktır.

Main metot içerisine `Gövde (body)` adını veririz ve komutlarımızı ya da diğer adıyla ifadelerimizi gövde içerisine yazarız. Buraya yazdığımız kodlar derleyici tarafından yorumlanır ve çıktı olarak kullanıcıya verir. Genel olarak Java'nın Genel Sözdizim kuralları bu şekildedir.

# Ekrana Veri Yazdırma
Java'da ekrana veri yazdırmak için `System.out.print("Hello World!")` kod parçacığı kullanılır. Bu komuta baktığımızda, iki parantez arasında, çift tırnaklar arasına ekrana yazdırmak istediğimiz sözcüğü yazmalıyız. Bu komutun iki farklı kullanım şekli mevcuttur, yazılan komuttan sonra yeni satıra inilmesi isteniyorsa `System.out.println();` kullanılırken aynı satırda kalınması isteniyorsa `System.out.print();` şeklinde kullanılır.

# Escape Karakterler
Java'da Escape (Kaçış) karakterleri ile bazı özel durumlar durumlar gerçekleştirilir. Kaçış karakterleri `( / )` ters eğik çizgi ile ifade edilip sonrasında yazılan karakter ile özel işleve sahip olurlar.

[Escape Karakterlerin tablosu](./img/escape.png)
