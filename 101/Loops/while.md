# While Döngüsü
While döngüsü Java'nın temel yapı taşlarından bir tanesidir. While terimini yazdıktan sonra yanına bir parantez açılıp kapatılır ve bu parantezler arasına __boolean__ bir değer girilir. Sonrasında bir süslü parantez açılıp kapatılır ve bunun içine kod bloğu yazılır. Bu parantezler içindeki değer __doğru(true)__ olduğu sürece döngü dönmeye devam eder ve kod bloğu çalışır.

While döngüsü söz dizimi şu şekildedir ;

```java
while(kosul){
   //kod bloğu
}
```

Burada belirtilen koşul, __boolean__ bir ifadedir. Bu koşul __true__ olduğu sürece döngü devam eder. Koşul __false__ olursa döngü sonlanır. Koşul ifadesi parantez içine yazılır. Eğer döngüye girecek kod tek satırdan oluşuyorsa blok açmaya gerek yoktur; fakat birden fazla satırdan oluşuyorsa mutlaka blok açılmalıdır.

```java
int i = 1;
while (i <= 5) {
   System.out.print(i + ',');
   i++;
}
```

Bu Java'da While kullanımı örneğinde, `i` değeri `5`'e eşit ve küçük olduğu sürece döngü çalışmaya devam edecektir ve çıktısı şu şekilde olacaktır ; `1,2,3,4,5,`

Döngülerin içeriği olmak zorunda değildir. Bazı durumlarda döngüye girecek kod olmasa bile döngüye girebiliriz. Aşağıdaki örneği inceleyelim:

```java
int left = 100, right = 200;
while (++left < --right);
System.out.println("100 ile 200'ün ortası: " + left);
```

Bu algoritma, 100 ile 200’ün arasında tam ortada bulunan sayıyı bulmamızı sağlar. Kodu çalıştırdığımızda çıktısı şu şekilde olur:

`100 ile 200'ün ortası: 150`

