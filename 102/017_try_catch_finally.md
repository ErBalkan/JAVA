# Try-Catch-Finally

Hata durumlarını yönetmek için 2 yöntem vardır.


1. __Try-catch__ blokları ile hatayı alınacağı tahmin edilen yerde kontrol altına alabiliriz veya


2. Hatayı __throws__ anahtar kelimesi ile çağrıldığı bir üst noktaya fırlatarak, çözümün orada yapılmasını zorunlu hale getiririz.


## "try-catch-finally" Mekanizması

Bu yöntemde öncelikle hata oluşacağı tahmin edilen ve izlenmesi gereken kod satırları __"try"__ bloğu içerisine alınır. Hata oluşmadığı durumda buradaki istenilen işlemler tamamlanacak ve kod sorunsuz bir şekilde devam edecektir ancak hata oluştuğunda __"catch"__ bloğuna düşecektir.

__"catch"__ bloğu aldığımız hatayla nasıl baş edeceğimizi programladığımız bloktur. Bu yapı hatalarda programımızın nasıl davranacağını, kapatılacaksa bile gerekli verilerin kaydedilmesini ve programın bilinçli bir şekilde kapatılmasına veya sistemin hata durumlarıda gerekli önlemleri alarak çalışmasını sürdürmesini sağlar. Bu sayede yapacağımız uygulama daha kararlı bir şekilde çalışacaktır.

__"try-catch"__ mekanizmasının kullanımı maliyetlidir. Bu nedenle, __"try-catch"__ bloklarını gerekli yerlerde kullanmak gerekir.

```java
public class DataConverter { 
	
public int convertToInt(String numberAsText) { 		
// bu örnekte hatayı tespit ediyoruz ve oluştuğu noktada önlemler alıyoruz. 
try { int number = Integer.parseInt(numberAsText); return number; 		}
catch (NumberFormatException e) {
    e.printStackTrace();
// bu kısımda mutlaka loglama yapmanız önerilir. // kurumsal projelerde hata takibi ve logların izlenmesi hataların çözümü için çok önemlidir. 		}
catch (NullPointerException e) { // farklı hata tiplerine göre birden fazla catch bloğu açabilirsiniz. 			
e.printStackTrace();
		}
		
return -1; 	}
		
public Date convertToDate(String dateAsText) throws ParseException { 		
SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd"); 	
// bu örnekte ise String haldeki date bilgisini Date verisine çevirmeye çalıştık. // parse fonksiyonu "ParseException" tipinde bir hata fırlattığı için biz de bu hatayı çağrıldığımız bir üste ilettik. return dateFormatter.parse(dateAsText); 	}
	
}
```

__"catch"__ bloklarının sıralaması önemlidir. Çünkü, sıralanmış haline göre işletilir.

```java
catch (NumberFormatException e) {
    e.printStackTrace();
// bu kısımda mutlaka loglama yapmanız önerilir. 
// kurumsal projelerde hata takibi ve logların izlenmesi hataların çözümü için çok önemlidir.    }
catch (NullPointerException e) { 
    // farklı hata tiplerine göre birden fazla catch bloğu açabilirsiniz.
    e.printStackTrace();
   }
```

Yukarıdaki örnekte ilk önce gelen hatanın __"NumberFormatException"__ tipinde olup olmadığına bakılır. Eğer gelen hata bu tipte değilse, sonra sırayla alttaki catch blokları kontrol edilir. Uygun hata hangi bloğa denk geliyorsa o __"catch"__ bloğu işletilir.


Aynı zamanda __Exception__ sınıfındaki hiyerarşik yapısında bulunan sıraya göre bu bloklar sıralanmalıdır.

```java
catch (Exception e) {     ...
   }
catch (NullPointerException e) {     ...
   }
```

Bu örnekteki gibi sıralanmış bir __"catch"__ bloğunda en genel __"Exception"__ sınıfı kullanıldığı için gelen her __"Exception"__ bu blok tarafından yakalancak ve o blok çalışacaktır. Bu __"NullPointerException"__ bloğundaki davranışın hiç çalışmamasına yani programda __"NullPointerException"__ yakalandığı zaman uygulamanın beklendiği gibi davranmamasına neden olacaktır.

Eğer, belirli hata tiplerine göre işlemler yaptırmanız gerekmiyorsa tek bir __"catch"__ bloğu yazıp tüm hataların aynı __"catch"__ bloğuna düşmesini sağlayabilirsiniz. Bunun içinde ATA sınıf olan __"Exception"__ tipinde bir hata tipi belirtmeniz gerekir.


```java
catch (Exception e) { 	
    e.printStackTrace();
}
```

## "finally" Bloğu


__"try-catch"__ sonrasında opsiyonel olarak __"finally"__ kod bloğunu ekleyebilirsiniz. __"try"__ bloğu içindeki kod bloğu hata alsın ya da almasın __"finally"__ bloğu her koşulda çalıştırılır. 


