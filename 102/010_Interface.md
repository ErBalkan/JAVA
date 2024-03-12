# Interface (Arayüzler)


Java'da soyutlamayı sağlamanın bir başka yolu __"interface"__ tanımlamaktır. __"interface"__ 'ler abstract sınıflara göre soyutlama oranı çok yüksektir. Çünkü, __"interface"__ içinde sadece soyut fonksiyonlar tanımlayabilirsiniz. Metot gövdesi olan normal fonksiyonlar tanımlayamazsınız.



__"interface"ler__ sözleşmeler gibidir. Bir sınıf eğer bir interface'den kalıtım alıyorsa o __"interface"de__ tanımlı olan tüm soyut özellikleri karşılamak zorundadır. Eğer, kalıtım alan sınıf __"interface"deki__ bazı metotlara ihtiyaç duymuyorsa yazılım tasarımınızda bir problem var demektir. Bu noktada __"Interface Segregation"__ yapmanızı öneririm. __"Interface Segregation"__ ile interface'ler alt interface tanımlarına bölünebilir.

## Neden "interface" kullanırız?

Bir sınıf __"interface"den__ kalıtım alıyorsa __"implements"__ anahtar kelimesi kullanılır. Örnek bir tanımlamaya göz atalım.

```java
// interface anahtar kelimesi ile bir interface tipi tanımlanır. 
public interface PaymentProvider { 
// interface içinde yer alan fonksiyonların hepsi soyuttur.
 // Bu soyut fonksiyonlar interface'den kalıtım alan alt sınıflarda doldurulur. 
public boolean cancelCharge(int chargeId); 
public int charge(double totalPrice); 
public String loadInvoice(int chargeId); 
}
```

Alt sınıflar interface'den kalıtım alırlar.

```java
public class AssecoPaymentSystem implements PaymentProvider {

	@Override
	public boolean cancelCharge(int chargeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int charge(double totalPrice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String loadInvoice(int chargeId) {
		// TODO Auto-generated method stub
		return null;
	}
}

public class IyzicoPaymentSystem implements PaymentProvider {

	@Override
	public boolean cancelCharge(int chargeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int charge(double totalPrice) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String loadInvoice(int chargeId) {
		// TODO Auto-generated method stub
		return null;
	}
}
```

