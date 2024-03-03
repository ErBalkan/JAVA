# Do-While Döngüsü
Do-while döngüsünün çalışma mantığı __while__ döngüsü ile aynıdır , fakat while döngüsünde parantez içerisindeki koşul sağlandığı sürece kod bloğu çalışacaktır. Ama __Do-while__ döngüsünde durum __false__ olsa bile döngü __en az bir kere çalışacaktır.__ Bu tür durumlar için __Do-while__ kullanılır.

Java Do-While döngüsü söz dizimi şu şekildedir ;
```java
do {
kodlar//
} while (kosul);
```
Gördüğünüz gibi, koşul döngünün sonunda test edilir. Bu durumda, koşul false olsa bile döngü en az bir kere çalıştırılmış olur. Bu şekilde döngü yazmak istediğiniz durumlarla karşılaşacaksınız. Aşağıdaki örneği inceleyelim:
```java
int year = 2020;
do
{
	System.out.println(“Döngü işletiliyor..”);
	year++;
} while (year < 2020);
```
Bu kod çalıştırıldığında çıktısı aşağıdaki gibi olur:

__Döngü işletiliyor..__ 

Gördüğünüz gibi __year__ değişkeni __2020’den__ küçük olmamasına rağmen döngü en az bir kere çalıştırılmıştır.

## Java While ve Do-While Arasındaki Farklar ?
Java'da Do-While ve While döngüleri arasındaki tek fark , Do-while döngüsünde, döngü bloğu içindeki kod kesimi en az bir kez mutlaka işletilecektir. Çünkü önce döngü bloğu işletilip sonra koşul denetlenmektedir. While döngüsünde ise önce koşula bakılıp sonra döngü bloğu işletildiği için, döngüye hiç girilmemesi olasıdır.

