# Java’da Yazım ve İsimlendirme Kuralları

## Yazım Kuralları
__Türkçe Karakter Kullanımı :__ Java ve bir çok programlama dili Türkçe karakter desteklememektedir. Programda ki metin ifadeleri dışında Türkçe karakter kullanılmamalıdır. __Türkçe Karakterler :__ `ç, ı, ü, ğ, ö, ş, İ, Ğ, Ü, Ö, Ş, Ç`
__Harf Duyarlılığı :__ Java harfe duyarlı bir dildir. Kelimelerdeki küçük ve büyük harfler farklı olarak algılanır. Java’da Kodluyoruz ile kodluyoruz farklı anlama gelmektedir.
__Sınıf Adları :__ Java’da sınıf adlarının ilk harfi büyük olmalıdır. Eğer 2 kelimeyi birleştirerek bir sınıf adı oluşturursak bu isimlerin baş harfleri büyük olmalıdır. `Örnek: CamelCase`
__Metot Adları :__ Metot adları küçük harfle başlar. Metot adı verilirken iki kelime birleştirilecekse ismin başlangıç harfi küçük diğer birleştirilen kelimelerin başlangıç harfleri büyük yazılır. `Örnek: camelCaseOrnek`

## İsimlendirme Kuralları
### Camel Case Nedir ?
Camel Case, bir bileşik sözcük içindeki her kelimenin ilk sözcük dışında ki sözcüklerin ilk harfleri büyük harflerle yazıldığı bir adlandırma kuralıdır. Yazılım geliştiricileri genellikle kaynak kodu yazarken "Camel Case" kullanır. Camel Case kullanımı zorunlu bir kullanım olmasa da yazılım dilinin jargonudur ve genelde tüm yazılımcılar bu kurala uyar. Bu kural sayesinde değişken isimleri daha okunur olur.

__Örnek :__ `patikaDev, camelCaseKurali, javaPatikasiBasliyor`

### Upper Camel Case Nedir ?
Upper Camel Case isimlendirme kuralı ise, bileşik bir sözcükteki tüm sözcüklerin ilk harflerinin büyük olmasıdır.

__Örnek :__ `PatikaDev, UpperCamelCaseKurali, JavaPatikasiBasliyor`

### Snake Case
Kelimeler alt tire (_) ile birbirine bağlanır.

__Upper snake case örnek:__ `Hello_World`

__Lower snake case örnek:__ `hello_world`

### Screaming Snake Case
Bütün harfleri büyük yazılır. Genellikle sabit isimlendirmede kullanılır.

# Java'da İsimlendirme Kuralları
Java'da isimlendirilen tüm ögeler sadece `A-Z` veya `a-z` gibi harfler, `$` karakteri veya `_` karakteri ile başlayabilirler.
Keyword’ler (Yasaklı Kelimeler) isimlendirmede kullanılamaz.

- Sınıflar için upper camel case kullanılır. `HelloWorld`
* Metotlar için lower camel case kullanılır. `helloWorld`
- Değişkenler için lower camel case kullanılır. `helloWorld`
* Sabitler için screaming snake case kullanılır. `HELLO_WORLD`