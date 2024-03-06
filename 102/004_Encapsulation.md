# Encapsulation (Kapsülleme)
Sarmalama ilkesi, bir sınıfa ait değişkenlerin veya niteliklerin ancak o sınıfa ait metotlar tarafından değiştirilebilmesi ve okunabilmesi ilkesidir. Bu ilke sayesinde nesnelerde oluşacak anlamsızlıkların önüne geçilebilir.

Ayrıca değişkenlere sınıfların dışından erişim olmaması ve bir sınıf içindeki değişkenlerin nasıl ve ne kadar olacağının da başka kodlardan saklanmış olması anlamına gelir. Böylelikle biz değişkenlerimizi sarmalayarak istenmeyen durumlardan korunacak bir filtre haline dönüştürebiliriz. Bunu bir örnek ile anlamaya çalışalım.

## Encapsuliaton Örneği
Kitap adında bir sınıfımız olsun ve bu sınıfımıza ait 3 adet değişkenimiz olsun bunlar ; __kitapAdi__, __sayfaSayisi__ ve __yazar__. Bu değişkenlerin erişim belirleyicileri __public__ olsun ve her sınıftan erişilsin. __Kitap__ sınıfından oluşturacağımız bir nesne bu niteliklerin hepsini taşısın. Bu yüzden oluşturacağımız __Constructor (kurucu)__ metodunu bu şekilde oluşturalım.

```java
public class Kitap { 
    public int sayfaSayisi; 
	public String kitapAdi, yazar; 
	Kitap(String kitapAdi, int sayfaSayisi, String yazar) { 
		this.kitapAdi = kitapAdi; 
		this.sayfaSayisi = sayfaSayisi; 
		this.yazar = yazar;
	 }
}
```

Görüldüğü üzere normal bir sınıfımız ve kurucu metodumuz var. Kitap sınıfından bir nesne oluşturalım.

```java
Kitap book = new Kitap("Harry Potter", 500, "JK Rowling");
```

Kitap sınıfından __book__ adlı bir nesne oluşturduk ve bu nesnemizin niteliklerini belirttik. Peki biz bu kurucu metotta sayfa sayısını negatif bir değer girseydik ne olurdu ? Hiç bir kitabın sayfa sayısı negatif bir değer olamayacağı için, nesnemizde bir __anlamsızlık__ olacaktı. Biz bu sorunu __constructor (kurucu)__ metotumuza yazacağımız bir if kontrolü ile çözebiliriz.

```java
public class Kitap {
    public int sayfaSayisi;
    public String kitapAdi, yazar;
    Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        if (sayfaSayisi < 1) {
            this.sayfaSayisi = 10;
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }
}
```

__Constructor__ metodu görüldüğü gibi modifiye ettik ve nesne oluşturulurken anlamsız verilerin olmasını engelledik. Ama sorunlarımız hala bitmedi , biz nesneye ait niteliklere hala dışarıdan erişebiliyoruz ve __book.sayfaSayisi = -10__ dersek , nesneye ait sayfa sayısını yine anlamsızlaştırmış oluruz. Bu sorunu çözmek için sınıfa ait değişkenlere dışarıdan erişimi kapatmamız gerekir ve oluşturduğumuz değişkenlerin erişim belirleyicilerini (Access Modifiers) değiştirmemiz gerekli. __Tüm public'leri private olarak değiştiriyoruz.__

Sınıfımızın son hali

```java
public class Kitap {
    private int sayfaSayisi;
    private String kitapAdi, yazar;
    Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        if (sayfaSayisi < 1) {
            this.sayfaSayisi = 10;
        } else {
            this.sayfaSayisi = sayfaSayisi;
        }
    }
}
```

Sınıfa ait değişkenlerimin izinlerini __private__ yaparak bu sorunu çözdük ama, biz __book__ nesnesine ait değişkenlere erişimi tamamen kısıtladık. Yani biz oluşturduğumuz nesneye ait sayfa sayısını ekrana bastıramayız çünkü değişken __private__ olarak tanımlandı. Ya da sayfa sayısı yanlış girilmiş bir nesneyi daha sonrasında düzenleyemeyiz. Bu sorunu çözmek için sınıfa ait değişkenlerimizi sarmalayarak, sınıf içerisinde ki metotlar yardımı ile değişkenlerimizi koruma altına alıyoruz ve kullanıma sunuyoruz. Bu metotlara sonrasında ismini çok duyacağımız `Getter` ve `Setter` metotları diyoruz.


# Getter ve Setter Metotları

## Getter
Sınıfımıza ait __private__ değişkenler mevcut. Bu değişkenlere dışarıdan erişebilmek için her bir değişkenimiz için __Getter__ metodu yazmalıyız. Nesneye ait bu metot çağrıldığında geriye bir değer döndürmeli ve bu değer bizim istediğimiz private değişken olmalı. sayfaSayisi değişkeni için getter metodu tanımlayalım,

```java
public class Kitap {
	private int sayfaSayisi;
	private String kitapAdi, yazar;


	Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
		this.kitapAdi = kitapAdi;
		this.yazar = yazar;
		if (sayfaSayisi < 1) {
			this.sayfaSayisi = 10;
		} else {
			this.sayfaSayisi = sayfaSayisi;
		}
	}
	
	public int getSayfaSayisi() {
		return this.sayfaSayisi;
	}
}
```

Görüldüğü gibi basit bir metot yardımı ile sınıfa ait __private__ değişkenimize ulaşabildik. Burada dikkat edilmesi gereken noktalar __getter__ metotları __geri dönüşü olan metot tipindedir__ ve isimlendirilmesi ise __get__ ile başlayıp sonra değişken ismi yazılmalıdır. İsimlendirmeyi bu şekilde yapmasak da çalışacaktır lakin kodun okunabilirliği adına bu kurala uyulması gerekir.

## Setter
Biz __getter__ metodu ile __private__ olan değişkenimize ulaştık.Peki bu değişkenin değerini değiştirmek istediğimizde ne yapmalıyız ? Bir sınıfa ait __private__ bir değişkenin değerini değiştirmek için, __setter__ metodu yazılmalıdır. sayfaSayisi değişkeni için __setter__ metodu yazalım.

```java
public class Kitap {
	private int sayfaSayisi;
	private String kitapAdi, yazar;


	Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
		this.kitapAdi = kitapAdi;
		this.yazar = yazar;
		if (sayfaSayisi < 1) {
			this.sayfaSayisi = 10;
		} else {
			this.sayfaSayisi = sayfaSayisi;
		}
	}
	
	public int getSayfaSayisi() {
		return this.sayfaSayisi;
	}
	
	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}
}
```

Görüldüğü üzere __setter__ metodu sadece değiştirme işlemi yapacağı için __void__ olarak tanımlandı ve bir adet __parametre__ aldı. Bu parametre bizim yeni değerimi taşıyor olup, sınıfa ait değişkene aktarılmıştır. Ama burada hala bir sorun söz konusudur, bizler __setter__ metodunu kullanarak sayfa sayısını __negatif__ girebiliriz. Bu sorunu aşmak için __constructor (kurucu)__ metotta yaptığımız gibi bir __if__ koşulu ile bu sorunu çözebiliriz.

```java
public class Kitap {
	private int sayfaSayisi;
	private String kitapAdi, yazar;


	Kitap(String kitapAdi, int sayfaSayisi, String yazar) {
		this.kitapAdi = kitapAdi;
		this.yazar = yazar;
		if (sayfaSayisi < 1) {
			this.sayfaSayisi = 10;
		} else {
			this.sayfaSayisi = sayfaSayisi;
		}
	}


	public int getSayfaSayisi() {
		return this.sayfaSayisi;
	}


	public void setSayfaSayisi(int sayfaSayisi) {
		if (sayfaSayisi < 1) {
			this.sayfaSayisi = 10;
		} else {
			this.sayfaSayisi = sayfaSayisi;
		}
	}
}
```

__Setter__ metodunu modifiye ederek nesnemiz için anlamsız olan durumu ortadan kaldırmış olduk. __Setter__ metodunun genel özellikleri ise , geriye bir değer döndürmeyen metot olması ve isimlendirme yaparken başlangıç olarak __set__ yazıp sonrasında değişken ismini yazmaktır.

Bu örnekteki __sayfaSayisi__ değişkenini koruma ve anlamsızlaşmasını önlemek için Nesne Yönelimli Programlamanın ilkesi olan __Encapsulation (Sarmalama)__ ilkesinden yararlandık. Bir sınıfa ait değişkenlerimizi __Getter ve Setter__ metotları yardımı ile sarmaladık ve istenilen şartlara göre oluşmasını sağladık.

