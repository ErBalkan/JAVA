# Continue ve Break Komutları
## Continue Deyimi
Java'da __"continue"__ deyimi , döngü içinde bir koşul oluştuğunda o döngüyü tamamlamadan bir sonraki kademeye geçmeye yarar.

```java
int i = 0;
while (i < 10) {
  i++;
  if (i == 5) {
    continue;
  }
  System.out.println(i);
}
```

Örnekte görüldüğü gibi eğer __i__ değişkeni __5__ sayısına eşit olduysa, o kod bloğundan sonraki kodlar çalışmayıp döngü bir sonraki adıma geçiş yapacaktır.

## Break Deyimi
Buraya kadar gördüğümüz bütün döngüler belirlediğimiz bir koşula göre kontrol ediliyor ve bu koşul sağlandığı sürece çalışıyordu. Bazı durumlarda, döngü koşulu sağlansa bile başka bir nedenden ötürü döngüyü sonlandırmak isteyebiliriz. Bu tarz durumlarda __break__ deyimini kullanırız. Bu deyim, içinde kullanıldığı döngüyü __anında sonlandırır.__
```java
for (int i = 0; i < 10; i++) {
  if (i == 5) {
    break;
  }
  System.out.println(i);
}
```
Örnekte görüldüğü üzere döngü içindeki koşul tamamlanmadan __i__ değişkeni __5__ değerine ulaştığında __"break"__ komutu ile döngümüzü bitirebiliriz.

