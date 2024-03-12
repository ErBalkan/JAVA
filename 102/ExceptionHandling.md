Hata Yönetimi (Exception Handling)


İstisna Durum Nedir? (Exception)


İstisna durum, İngilizce __exception__ diye ifade edilir. Programın normal akışını beklenmeyen şekilde hatalı şekilde kesen durumlara karşılık gelir. Örneğin bir dosya okuması yaparken dosyanın harddiskte olmaması hatası, veritabanına bağlanırken bağlantı hatası, bir web servisi çağırırken bağlantı hatası veya null bir nesneye erişim hatası gibi bir çok hatalı durum meydana gelebilir. Java normal akışı kesen bu hatalı durumları yönetebilmek için yazılım geliştiricilere çeşitli imkanlar sunmuştur. Bu özelliği sayesinde Java programları tutarlı ve güvenli bir şekilde çalışabiliyor.

Java dilinde hatalara __istisna (exception)__ denir. İstisna, adından da anlaşılacağı üzere, programın çalışması sırasında meydana gelen istisnai (anormal) durumları belirtir. Diğer bir deyişle, çalışma zamanında meydana gelen hatalara istisna denir.

Program yazarken belli kurallar yazmış oluruz. Java çalışma ortamı, programımızı bu kurallara göre çalıştırır. Hata ise __istisnai (yani kural dışı)__ bir durumdur. Böyle bir durumda Java çalışma ortamı ne yapacağını bilemez, çareyi programı sonlandırmakta bulur. Kısacası, bir hata oluştuğu zaman programın çalışması sona erer. Bunun önüne geçebilmek için, kodun yazılış aşamasında hata yönetiminin iyi yapılması gerekir.

Hata yönetiminden kastımız, hatanın meydana gelmesini engellemek değildir. Hata yönetimi, en basit ifadesiyle, çalışma sırasında bir hata meydana gelse bile programın çalışmasına devam etmesini sağlamaktır. Java’da bu mümkündür. Java’nın hata yönetim mekanizması sayesinde, program normal akışında çalışır; eğer bir hata olursa, yazdığımız koda uygun olarak bir aksiyon alınır (kullanıcıya hata bilgilendirmesi yapılır, hata kayıt altına alınır vs.) ve sonra program çalışmasına devam eder.

Java’nın hata yönetim mekanizması şu şekilde işler: Programın çalışması sırasında istisnai bir durum oluşursa bu durumla ilgili bir nesne oluşturulur ve __throws__ deyimiyle fırlatılır. Böyle bir durumda, programın olağan akışı durdurulur ve bu hatanın yakalanması beklenir. Hatanın yakalanabilmesi için, hataya sebep olan kodun __try-catch bloğu__ içine yazılması gerekir. Bu durumda Java çalışma ortamı, meydana gelen hatayı yakalayabilecek bir __catch bloğu__ arar, eğer bulursa bu __catch__ bloğu çalıştırılır. Son olarak, eğer bir __finally bloğu__ yazılmışsa bu blok çalıştırılır ve program normal akışına devam eder.

