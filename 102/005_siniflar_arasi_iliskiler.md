# Sınıflar Arası İlişkiler


Java ve Nesne Yönelimli Programlamada, sınıfların oluşturulması gerekmektedir. Sınıfların belirlenmesi ve sistemi dizayn ederken sınıflar arasında nasıl bir ilişki olacağını karar vermek gerekir. Bu sistem dizaynlarını güzel oluşturduğumuz taktirde iyi bir başlangıç yapmış olup yazacağımız kodun kalitesini arttırırız. Peki bu sınıflar arasındaki ilişkiler nelerdir ?



Sınıflar arası oluşturulabilecek 3 temel ilişki vardır ; __Bağımlılık (Dependency)__ , __Birleştirme (composition)__ , __Kalıtım (inheritance)__



## Bağımlılık (Dependency) / “uses a” İlişkisi


Java'da Bağımlılık bir diğer adı ile __"uses a"__ ilişkisi, eğer bir sınıfın metotlarından en az biri başka bir sınıfa ait bir parametre alıyorsa, parametre alan metoda ait sınıf diğeri __sınıfa bağımlıdır__ ya da onu kullanır __(uses)__ denir. Yazılan program da sınıflar arası bağımlılığı arttırmak, birlikte yönetilmesi gereken sınıf miktarının da artmasına sebep olur. Bu durumda programın yönetilebilirliği veya bakımı zorlaşacaktır. Bunun sebebi ise, bir sınıf içinde yapılacak herhangi bir değişiklik bağımlı olduğu sınıfları da etkileyecektir ve bakım yükü artacaktır.



## Birleştirme (Composition) / "has a" İlişkisi


Java'da Birleştirme __(Composition)__ ilişkisi , eğer bir sınıfın değişkenlerinden en az bir tanesi başka bir sınıf türünden ise, değişkene sahip olan sınıf diğer sınıfı içerir yani __"has a"__ olarak adlandırılır.



## Kalıtım (Inheritance) / "is a" İlişkisi


Java'da Kalıtım __(Inheritance)__ ilişkisi, eğer bir sınıfa ait tüm nesneler aynı zamanda daha genel yapıdaki başka bir sınıfa aitse, o zaman bu iki sınıf arasında __kalıtım__ ilişkisi vardır.

