# Sınırlandırılmış Türler (bounded types)

Jenerik sınıf veya metot tanımlarken parametre olarak aldığınız türü sınırlandırabilirsiniz. Örneğin, parametre olarak aldığım tür Number sınıfının alt sınıflarından biri olsun, diyebilirsiniz. Böyle bir durumda Number sınıfından türetilmemiş hiçbir sınıfı parametre olarak veremezsiniz.

Tür sınırlandırması yaparken __extends__ veya __super__ deyimi kullanılır. Bu deyimlerden sonra bir sınıf veya arayüz ismi verilir. Bu deyimleri kullanarak parametre olarak jenerik türünü sınırlandırmış oluruz:

- __extends deyimini kullandıysak yalnızca belirttiğimiz türü veya alt sınıflarını kullanabiliriz. Buna üst sınır (upper-bound) denir.__


- __super deyimini kullandıysak yalnızca belirttiğimiz türün üst sınıflarını kullanabiliriz. Buna alt sınır (lower-bound) denir.__

`public class Nullable<T extends Number>`

