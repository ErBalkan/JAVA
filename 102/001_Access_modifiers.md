# Erişim Belirleyiciler (Access Modifiers)

Java'da bir sınıfa ait nitelik ve davranışlara ulaşabilmek için __Erişim Belirleyiciler (Access Modifiers)__ kullanılır. Erişim belirleyiciler, değişken ,metot ve sınıfların önüne yazılır ve yazıldıkları konuların erişilebilecekleri alanları belirlerler. Java'da 3 adet Erişim Belirleyiciler vardır bunlar ; __public__ , __private__ ve __protected__.

## Private Erişim Belirleyici

Java'da private deyimi yazıldığı öğenin sadece ait olduğu sınıftan doğrudan erişilebilir olduğunu ve o sınıfın dışındaki kod parçacıklarından doğrudan erişilemeyeceğini tanımlar. Nesne Yönelimli Programlama'nın temel ilkelerinden olan Sarmalama ilkesi gereği, sınıf içindeki değişkenler sadece sınıf içinde doğrudan erişebilir olması gerekir. Bundan dolayı, genellikle değişkenler __"private"__ olarak tanımlanır. Bazı zamanlarda ise sadece o sınıfta çağrılmasını istediğimiz değişkenler veya metotları da __private__ olarak tanımlarız.

## Public Erişim Belirleyici

Java'da __"public"__ deyimi , yazıldığı öğenin sadece olduğu sınıf için değil, diğer sınıflar tarafından doğrudan erişilebilir olmasını sağlar. Sınıflara ait nesnelerin ve diğer nesneler tarafından kullanılması istenilen metotlar için __"Public Erişim Düzenleyicisi"__ kullanılır.

## Protected Erişim Belirleyici


Java'da __"protected"__ deyimi , __public__ ve __private__ arasında kalan bir erişim düzenleyicidir. __Protected__ ile tanımlanan öğeler, kendisi ile aynı __package (paket)__ bulunan sınıflar tarafından doğrudan erişilir.

## Varsayılan

Eğer yazdığımız kodlarda herhangi bir öğenin önüne erişim düzenleyici yazmazsak, o öğenin erişimi ait olduğu paket ile sınırlandırılır. Aynı pakette bulunan başka bir sınıf içinden o öğeye erişilir.

[alt text](./img/accessmodifiers.jpg)

