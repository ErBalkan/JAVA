# Dizilerin Genel Mantıkları
Java'da Diziler (Arrays) , her değer için ayrı değişkenler oluşturmak yerine, birden çok değeri tek bir değişkende depolamak için kullanılır. Değişkenler hafızada tek bir değer tutmamızı sağlar. Fakat bazı durumlarda, birden çok veriyi bir arada bulundurmak isteriz. Örneğin, bir sınıfta okuyan 20 öğrenci olsun. Bu 20 öğrenci için hafızada ayrı ayrı 20 tane değişken oluşturmak yerine, tek bir değişken kullanarak 20 öğrencinin koleksiyonunu tutmak isteyebiliriz.

Bu gibi durumlarda dizileri kullanırız. Dizi, aynı türden birden fazla değişkeni tutmamızı sağlayan hafıza birimidir. __Kısaca, dizileri aynı türden elemanları gruplamak için kullanırız.__ Dizi oluşturduktan sonra dizinin içerisindeki elemanlara indeks numarasıyla ulaşır ve değiştiririz. Ayrıca, çok boyutlu diziler oluşturmak da mümkündür. Tek boyutlu dizi kullanabileceğimiz gibi 2 veya 3 boyutlu diziler de oluşturabiliriz. 2 boyutlu dizilere matris denir.

Dizi (Array) kavramı programlama dillerinde bir veri tipini ifade eder. Bu veri tipi liste halindeki ardışık verileri bir arada tutan yapıya denilir. Bu ardışık yapıya ait elemanlara indis yoluyla erişim sağlanabilir. Diziler sabit boyutludur ve tanımlanırken boyutları belirtilir.

Dizinin hafızada bir başlangıç adresi olur ve ardışık olan diğer elemanlar sırayla hafızaya yerleştirilir. Diziler __"new"__ anahtar sözcüğüyle oluşturulur. Böylece, __Heap__ Hafıza bölgesinde yer kaplarlar.

```java
double[] myList;   // tercih edilen yol

// veya

double myList[];   // başka türlü tanımlama biçimi
```
Diziler __veri tipi ve []__ parantezler ile belirtilir. Yukarıda iki farklı tanımı görülmektedir. Hafızadan yer alıp diziye alan ayırabilmek için __"new"__ anahtar kelimesi kullanılır.

```java
double[] myList = new double[10];
```

Yukarıda maksimum __10__ eleman alabilen __"double"__ veri tipinde olan bir dizi oluşturulmuştur.

Yukarıda __"myList"__ isminde bir dizi tanımlamıştık. Tanımlanan dizi hafıza yukarıdaki şekildeki gibi tutulur. __"myList"__ değişkeni dizinin başlangıç adresini tutar. Dizilerde ardışık bir sıra olduğu için ilk elemandan sonra gelen elemanların hafıza adresleri de birer birer artar. Dizi blok halinde yer kaplar. Diziye erişmek için __indeks__ numarası kullanılır. Örneğin: __"myList[0]"__ demek dizinin 1. Elemanını verecektir. __Java'da dizilerin indeksleri sıfırdan başlar.__ Örneğin: __"myList[5]"__, yani 5 nolu indeksteki dizi elemanını ver dediğimizde aslında dizinin __6. Elemanına erişmiş oluruz.__

```java
// Java'da diziye ilk değerler süslü parantezler arasında verilir.
double[] myList = { 1.9, 2.9, 3.4, 3.5 };

// tüm dizi elemanlarını arada boşuk bırakarak sırayla ekrana yazdırır.
for (int i = 0; i < myList.length; i++)
{
	System.out.println(myList[i] + " ");
}
```
Yukarıdaki örnekte __myList__ isimli diziye ilk değerleri hemen verilmiştir. Süslü parantezler arasında kalan değerler dizi elemanlarıdır.

Ardından, bir __"for"__ döngüsü ile dizi elemanları ekrana yazdırılır.

