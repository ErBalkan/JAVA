# DEĞİŞKEN SAYIDA PARAMETRE BELİRTMEK

Değişken sayıda parametre tanımlamak için değişken türünden sonra 3 nokta koyarız. Artık, metodu çağırırken istediğimiz sayıda parametre verebiliriz: bunların her biri için metodu aşırı yüklememiz gerekmez. Java bu parametreleri bize bir dizi (array) halinde sunar.

```java
public int add(int... numbers)
{
	int sum = 0;
	for (int number : numbers)
	{
		sum += number;
	}
	return sum;
}
```

