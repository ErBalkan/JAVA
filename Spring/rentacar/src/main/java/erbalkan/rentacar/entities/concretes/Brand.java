package erbalkan.rentacar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "brands") // DB'deki tabloyu belirtiriz.
@Data // getter ve setterları oto olusturur.
@AllArgsConstructor // Bütün fieldler ile constructor
// @Getter
// @Setter
// sadece getterler ya da sadece setterlar olsun istersen üstteki gibi ayırabilirsin.
@NoArgsConstructor // parametresiz constructor
@Entity // bir veritabanı varlığı olduğunu belirtiriz.
public class Brand {
    @Id // tabloda Id olduğunu belirttik.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;



    // public Brand(){}
    // public Brand(int id, String name){
    //     this.id = id;
    //     this.name = name;
    // }
    
    // public int getId() {
    //     return id;
    // }
    // public void setId(int id) {
    //     this.id = id;
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }

}
