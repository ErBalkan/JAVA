# Mantıksal Operatörler
Java'da Mantıksal Operatörler, değişkenler veya değerler arasındaki mantığı belirlemek için kullanılır. Türkçe'de ki bağlaç ekleri gibi düşünebilirsiniz.

Bir kontrol işlemi sonucunda geriye `true` yada `false` değeri döndüren operatörlerdir. __True / False__ döndüren ifadeler veya __boolean__ tipinde değerler tutan değişkenler üzerinde kullanılabilirler. Konuyu anlayabilmek için ilk önce mantıksal operatörlerin neler olduğu öğrenilmelidir.

## Java'da Mantıksal Operatörler
### && VE (AND)

Her iki ifade de doğruysa True döndürür.

Örnek

x'i 5 olarak ele alırsak;

x<10 && x<25

Burada sonuç True olacaktır.

### || Veya (OR)

İfadelerden biri doğruysa True döndürür.

Örnek

x'i 5 olarak ele alırsak;

x<10 || x<3

Burada sonuç True olacaktır.

### ! Ters İşlem

Sonucu tersine çevirir.

Örnek

x'i 5 olarak ele alalım.

x<10 ifadesi True dönecektir. Ancak !(x<5) olarak yazarsak sonuç False olacaktır.

### Soru İşareti Operatörü
__?__ işareti operatörü ile Java'da mantıksal kıyaslama yapılabilir. __?__ ifadesi Java'daki __"if-else"__ yapısı yerine kullanılabilir. Tek satırda bunu yapabilmemizi sağlar. Kullanımı ise if'in içerisinde yer alacak ifadeyi soru işaretinden önce yazılır, ifadenin doğru olması durumunda yapılacak işlemler soru işareti ile iki nokta arasına yazılır. İfadenin yanlış olması durumunda yapılacaklar ise iki noktadan sonra yazılır.

Kullanımı :

`( kontrol edilecek ifade ) ? doğru olması durumunda yapılacaklar : yanlış olması durumunda yapılacaklar`

