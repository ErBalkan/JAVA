# JDBC NEDİR ?

JDBC, Java diliyle veri tabanlarına bağlanıp sorgu çalıştırmak, veri tabanı ile etkileşimli uygulamalar geliştirmek için ortaya çıkmış bir kütüphanedir. Java Standard Edition (JavaSE) içinde yer almaktadır. Dolayısıyla JDK içinde varsayılan olarak hazır kullanılabilir şekilde gelmektedir.

JDBC API her veri tabanı yönetim sistemi için yazılmış olan sürücü kütüphanelerini kullanarak veri tabanı işlemlerini yapabilmeyi sağlar. Veri tabanıyla iletişimde kullanılabilecek birçok başka soyutlama olmasına karşın JDBC bunların hepsinin temelinde bulunur. Bu nedenle JDBC'nin standartını öğrenmek önemlidir.

Java ile veri tabanı ile etkileşimde olan kodları yazdığınızda sürücü kütüphane örneğin MySQL’den Oracle veri tabanı sistemine geçse bile hiçbir değişiklik gerektirmeden kullanımını sağlar. Böylece, Java ile veri tabanıyla işlemler yapabilmek için yazdığınız kodları değiştirmeden dilediğiniz veri tabanı sistemiyle çalışabilirsiniz. Böyle yüksek bir soyutluluk sağlaması Java kodlarının yeniden kullanılabilirliğini arttırmaktadır. JDBC API ile veri tabanı bağlantısı oluşturup, tablolar üzerinde sorgu çalıştırabilirsiniz. Sorgulama, veri güncelleme, silme veya yeni kayıt ekleme işlemlerini yapabilirsiniz.

## 5 Adımda JDBC’yi Kullanmak


JDBC ile veritabanı etkileşimi kabaca 5 adımdan oluşmaktadır.

1. Veri tabanı sürücü sınıfını kaydetmekle başlayabiliriz. JDBC API hangi veri tabanı sürücüsüyle çalışacağını bilmelidir. Bu nedenle yazılımı gerçekleştirirken bu bilgiyi belirtmek gerekir.

```java
Class.forName("com.mysql.jdbc.Driver"); 
```

Class sınıfındaki __“forName”__ fonksiyonu ile hangi veri tabanı sürücüsünü kullanacağımızı belirtiyoruz. Örneğin burada __“MySQL”__ sürücüsünü kullanacağımızı söylemişiz.

2. Sürücü sınıf belirlendikten hemen sonra veri tabanı bağlantısı kurulur. Modern veri tabanı yönetim sistemlerinin istemci-sunucu (client-server) mimarisinden oluştuğunu bahsetmiştik.

```java
Connection dbConnection = DriverManager.getConnection( "jdbc:mysql://remotemysql.com:3306/S9HHYQdP81?useSSL=false<Sunucu adı>", "S9HHYQdP81<kullanıcı adı>", "7mR2jSrEgT<şifre>");
```

__DriverManager__ sınıfındaki __“getConnection”__ fonksiyonu ile veri tabanına bir bağlantı açarız. Bu fonksiyona uzak bir sunucuda yer alan veri tabanı sunucu adresimizi vereceğiz. Bu adres __IP__ ve __Hostname__ şeklinde olabilir. Burada __“remotemysql.com”__ sunucusundaki __MySQL__ sunucusuna bağlanacağımı söylüyorum. Ardından, bağlantı kuracak kullanıcının, kullanıcı adı ve şifresini veriyorum. Böylece, veri tabanı sunucusuna bir bağlantı açmış oluyorum.

3. Bağlantı kurulduktan sonra JDBC API ile artık sorgu çalıştırabiliriz.

```java
Statement statement = dbConnection.createStatement();
```

__“dbConnection”__ isimli nesne veri tabanı sunucusuyla aramızdaki bağlantı nesnesidir. Bu nesne üzerinden __“createStatement”__ fonksiyonu ile sorgu hazırlayabileceğimiz __“Statement”__ tipinde bir nesne alırız. SQL sorgumuzu bu sorgu üzerinden yapacağız.

4. Sorgu nesnemiz hazır olduğu için bir SQL ifadesi hazırlayıp veri tabanı sunucusunda bu sorgu işletilir ve sorgu sonucu “ResultSet” tipinde bir nesne ile geri döndürülür.

```java
ResultSet resultSet = statement.executeQuery("select * from employees");   
while(resultSet.next())
{  
        System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));  
} 
```

__“executeQuery”__ fonksiyonu ile veri tabanı sunucusuna basit __“SELECT”__ sorgusu attık. Bunun sonucunda __“ResultSet”__ tipinde bir nesnede veri tabanından dönen kayıtlar geldi. Bu kayıtları bir __“while”__ döngüsü ile işletip erişebiliriz. __“next”__ fonksiyonu her çağrıldığında sonuç kümesinden bir satır kayıt getirir. Bu satır üzerindeki sütunlara __indis__ yoluyla veya direkt sütun isimlerini vererek erişlebiliriz.

5. İşimiz bitince veri tabanı sunucu ile olan bağlantımızı kapatırız.

```java
dbConnection.close(); 
```

__“Connection”__ tipindeki sınıftan bir nesne ile veri tabanı bağlantımızı oluşturmuştuk. Aynı şekilde bu nesne üzerindeki __“close”__ fonksiyonu ile bağlantıyı kapatıyoruz.

# VERİTABANI BAĞLANTISI

Uygulamanızda hangi veritabanını kullanacaksanız o veritabanına ait JDBC Driver’ı indirmeniz gerekmektedir.



Oracle veritabanı için buradan indirebilirsiniz.
(https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html)


MySql veritabanı için buradan indirebilirsiniz.
(https://www.mysql.com/products/connector/)


JDBC uygulaması oluşturulurken aşağıdaki adımlar izlenir:


1. __import java.sql.* paketinin içe aktarılması.__

2. __Sürücüleri kaydetme.__

3. __Bağlantı açma. Veritabanı ile fiziksel bağlantı sağlayan ve Connection nesnesini oluşturan DriverManager.getConnection() metodu gerekmekte.__

4. __Sorgu çalıştırma. Veritabanına SQL ifadesi göndermek için, Statement türünde bir nesne gerekmekte.__

5. __SQL cümlesine göre veri işlemi.__

6. __Kullanılan kaynağı kapatmak.__

```java
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
public class DBConnect { 
    public static final String DB_URL = "jdbc:mysql://localhost/dbName"; 
    public static final String DB_USERNAME = "username"; 
    public static final String DB_PASSWORD = "password"; 
    public static void main(String[] args) { 
        Connection conn = null; 
        try {
        conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException ex) { 
            System.out.println("SQLException: " + ex.getMessage()); 
            System.out.println("SQLState: " + ex.getSQLState()); 
            System.out.println("VendorError: " + ex.getErrorCode());         
            }
    }
}
```

# Veritabanı İşlemleri ve Statement Interface

Statement interface ile veri tabanı tabloları üzerinde SQL komutlarını çalıştırırız. SQL komutuna göre hangi fonksiyonu kullanacağımız değişebilir. Aşağıda bunlar listelenmiştir.

- __public ResultSet executeQuery(String sql):__ “SELECT” SQL komutuyla tablo üzerinde veri sorgulaması yapılacaksa bu fonksiyon kullanılmalıdır. Sorgu sonucunda __“ResultSet”__ tipinde bir nesne dönecektir. Bu nesne içinde sorgulanan tablodan dönen kayıtlar olacaktır.
- __public int executeUpdate(String sql):__ DML ve DDL tipinde SQL komutları çalıştırılabilir. INSERT, UPDATE, DELETE gibi tablo verisinde değişikliği sağlayan komutlar işletilebilir. Tabloda veya veri tabanında yapısal değişikliğe yol açan CREATE, DROP gibi komutlar da çalıştırılabilir.
- __public boolean execute(String sql):__ Eğer çalıştıracağımız SQL komutu birden fazla sonuç dönecekse bu fonksiyonu kullanabiliriz.

