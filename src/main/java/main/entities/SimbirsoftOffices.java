package main.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SimbirsoftOffices {

    @Id
    Integer id;

    String city;

    Integer index;

    String address;

    Boolean isHead;

    @Override
    public String toString() {
        return "OfficeEntity{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", index=" + index +
                ", address='" + address + '\'' +
                ", isHead=" + isHead +
                '}';
    }

}
