# Nesne Oluşturma
Sınıflar nesneleri tarif eden şablonlardı. Nesneler ise bu şablonlardan üretilen fiziksel yapılardır. Her üretilen nesne Hesap Hafıza Bölgesi'nde tutulur. Böylece sınıftan fiziksel karşılığı olan bir yapı elde etmiş oluruz. Sınıftan onlarca, yüzlerce nesne yaratabiliriz. Hepsi de hafıza başka adresleri gösterirler.

```java
public class Car {
    // nitelikler
    String type;
    String model;
    String color;
    int speed;

    // davranışlar
    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }
    
    void printSpeed() {
        System.out.println("Speed : " + speed);
    }
    // ...
}
```
### Java'da nesne üretmek için kullanılan sözdizimi :

```java
ClassName object = new ClassName();
```  
* __ClassName :__ Nesne oluşturmak istediğimiz sınıfı belirtiyoruz. Bu sınıf daha öncesinde projemizde tanımlanmış olması gerekmektedir.
* __object :__ Nesnemize verdiğimiz isimdir ve aynı isimde birden fazla nesne oluşturulamaz.
* __new :__ Java'da nesne üretmek için "new" anahtar kelimesini kullanırız.
* __ClassName(); :__ Sınıfa ait Kurucu (Constructor) Metodu temsil eder. Varsayılan olarak parametresiz tanımlanır.

### Car sınıfına ait örnek nesne oluşturma :
```java
Car audi = new Car();
Car bmw = new Car();
Car mercedes = new Car();
```
Yukarıdaki örnekte __"Car"__ sınıfına ait 3 tane farklı nesne ürettik. Bu nesnelerin her birinin nitelikleri farklı olmakla beraber hafızada ayrı ayrı yer kaplamaktadırlar.

# Sınıf Niteliklerine Erişim
Sınıflara ait niteliklere erişim sağlamak için nokta (.) kullanılır. İlgili nesnenin ismini sonuna nokta koyularak erişilmek istenilen niteliğin ismi yazılır.

```java
public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.speed = 10;
        System.out.println("Audi Hızı : " + audi.speed);

        Car bmw = new Car();
        bmw.speed = 25;
        System.out.println("Bmw Hızı : " + bmw.speed);

        Car mercedes = new Car();
        mercedes.speed = 30;
        System.out.println("Mercedes Hızı : " + mercedes.speed);

    }
}
```
```
Programın çıktısı :

Audi Hızı : 10
Bmw Hızı : 25
Mercedes Hızı : 30
```

# Sınıf Metotlarına Erişim
Sınıfa ait davranışlara yani metotlara erişmek için nokta __(.)__ kullanılır. İlgili nesnenin ismini sonuna nokta koyularak erişilmek istenilen metodun ismi yazılır ve var ise parametreleri girilir.

```java
    Car mercedes = new Car();
    mercedes.speed = 20;
    mercedes.printSpeed();
```