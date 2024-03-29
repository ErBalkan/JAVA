# Arrays Sınıfı ve Metotları
__Java.util__ paketindeki __Arrays__ sınıfı, Java Collection Framework'ün bir parçasıdır. Bu sınıf, Java dizilerini dinamik olarak oluşturmak ve bunlara erişmek için statik metotlar sağlar. Yalnızca statik metotlar ve Object sınıfının metotlarından oluşur. Bu sınıfın metotları, sınıf adının kendisi tarafından kullanılabilir.

`import java.util.Arrays;`
Import deyimi ile __java.util.Arrays__ sınıfını projeye dahil etmemiz gerekmektedir.


__`Arrays.toString()`__
Diziye ait elemanları direk ekrana basmak için kullanılan bir metottur.
```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {3, 5, 79, 12, 25, -3, 66, 82, -49, 152};
        System.out.println(Arrays.toString(dizi));
    }
}

// Çıktısı
// [3, 5, 79, 12, 25, -3, 66, 82,-49,152]
```

__`Arrays.fill()`__
__Arrays.fill__ metodu ile dizilerimizin belirli bir bölümlerine değerler atayabiliriz.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste, 2);
        System.out.println(Arrays.toString(liste));

        int[] liste2 = {15, 1, 99, 7, 7, -22, 11, 2, -49, 52};

        Arrays.fill(liste2, 3, 5, 7);
        System.out.println(Arrays.toString(liste2));
    }
}

// Çıktısı
// [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
// [15, 1, 99, 7, 7, -22, 11, 2, -49, 52]
```

__`Arrays.sort()`__
__Arrays.sort()__ metodu ile dizilerdeki elemanları sıralayabiliriz.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};
        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));
    }
}
// Çıktısı
// [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]
```

__`Arrays.binarySearch()`__
Java'da dizideki bir elemanın indis değerini bulmak için binarySearch kullanılabilir. Ama bu metodu kullanabilmek için, dizinin sıralı olması gerekmektedir.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        Arrays.sort(liste);
        System.out.println(Arrays.toString(liste));

        int index = Arrays.binarySearch(liste, 33);
        System.out.println("33'ün indeksi :" + index);
    }
}
// [-321, -21, -11, 1, 2, 6, 21, 27, 33, 55]
// 33'ün indeksi :8
```

__`Arrays.copyOf() ve Arrays.copyOfRange() metotu`__
Mevcut diziden belli bir uzunlukta yeni bir dizi oluşturmak için __Arrays.copyOf()__ metotu kullanılır

Mevcut diziden belli bir aralıkta yeni bir dizi oluşturmak için ise __Array.copyOfRange()__ metodu kullanılır.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] liste = {6, 1, 55, 21, 33, -321, -21, 2, -11, 27};

        int[] copyArray = Arrays.copyOf(liste, 3);
        System.out.println(Arrays.toString(copyArray));

        int[] copyOfRangeArray = Arrays.copyOfRange(liste, 0,5);
        System.out.println(Arrays.toString(copyOfRangeArray));
    }
}
// [6, 1, 55]
// [6, 1, 55, 21, 33]
```

__`Arrays.equals() metotu`__
Java'da iki dizinin eşitliğini kontrol etmek için __Arrays.equals()__ metotu kullanılır.

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {1, 2, 10};

        System.out.println(Arrays.equals(list1, list2)); // true
        System.out.println(Arrays.equals(list2, list3)); // false
    }
}
```

