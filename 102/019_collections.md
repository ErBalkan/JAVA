# Collection Arayüzü (interface)

`“Collection”` interface’den kalıtım alan alt sınıflar __“java.util”__ paketi altında toplanmıştır. __“Collection”__ interface ile liste tipinde veri tutan bir veri yapısında hangi işlevlerin olması gerektiği belirtilmiştir. Liste tipinde veri tutacak olan her sınıf doğrudan veya dolaylı yoldan bu interface’den kalıtım almalıdır. Bu nedenle soyağacının en tepesinde __“Collection”__ interface yer almaktadır.


Java Collection sınıfları ile liste halindeki veri üzerinde __arama, ekleme, silme, sıralama__ gibi işlemler yapabilirsiniz.

Biliyoruzki interface’ler de birbirinden kalıtım alabilir. __“Collection”__ interface’den kalıtım almış en önemli arayüzler __“List”, “Queue”, “Set”__ interface’leridir.


Bu üç interface’den kalıtım alan alt sınıflar ise aşağıdaki gibidir.

- List interface’den kalıtım alan alt sınıflar: ArrayList, LinkedList, Vector, Stack

- Queue interface’den kalıtım alan alt sınıflar: PriorityQueue, ArrayQueue

- Set interface’den kalıtım alan alt sınıflar: HashSet, LinkedHashSet, TreeSet

Collection interface’den türeyen alt sınıfların sağlamak zorunda olduğu fonksiyonlar:

![](./img/collections.png)

