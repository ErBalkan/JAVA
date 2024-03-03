# Temel Operatörler
Java dilinde operatörler birçok işlemi yapabilmenize olanak tanır. Örneğin: matematiksel operatörlerle birlikte aritmetik işlemler yapabilmenizi, ilişkisel operatörlerle verileri kıyaslayabilmeyi, atama operatörleri ile değişkenlerin değerlerini değiştirmeye fırsat verir.

Java'da operatörler aşağıdaki gibi listelenebilir:

* Atama Operatörleri
* Aritmetiksel Operatörler
* İlişkisel ve Eşitlik Operatörler
* Koşul Operatörler
* Mantıksal Operatörler

## Atama Operatörü

[alt text](./img/operators.png)

## Aritmetik Operatörler
Java'da Aritmetik Operatörler adından da anlaşılacağı üzere matematiksel işlemleri programlama dilinde uygulamamızı sağlarlar.

1. Toplama : a + b
2. Çıkarma : a – b
3. Çarpma : a * b
4. Bölme : a / b
5. Mod alma : a % b
6. 1 arttırma : a++
7. 1 eksiltme : b--

## Karşılaştırma Operatörleri
Java'da Karşılaştırma Operatörleri iki nesnenin birbirleriyle olan durumlarını belirler.

1. Eşitlik : a == b
2. Eşit Değil : a != b
3. Büyüktür : a > b
4. Küçüktür : a < b
5. Büyük Eşittir : a >= b
6. Küçük Eşittir : a <= b

## Mantıksal Operatörler
Java'da Mantıksal Operatörler , nesnelerin veya ifadelerin mantıksal değerlerini yansıtır.

1. Ve : a && b
2. Veya : a || b
3. Değil : !(a&&b)

## Koşul Operatörü
Java'da Koşul Operatörleri ifadelerin sonucunda oluşacak olayları belirler.

```java
a = 5;
b = (a == 1) ? 1 : 0
```
__Çıktısı : 0__