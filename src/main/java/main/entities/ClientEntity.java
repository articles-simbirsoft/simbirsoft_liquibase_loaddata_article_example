package main.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class ClientEntity {
    @GeneratedValue
    @Id
    UUID id;

    @ManyToOne
    SimbirsoftOffices simbirsoftOffices;

    public SimbirsoftOffices getOfficeEntity() {
        return simbirsoftOffices;
    }

    public void setOfficeEntity(SimbirsoftOffices simbirsoftOffices) {
        this.simbirsoftOffices = simbirsoftOffices;
    }

    @Override
    public String toString() {
        return "ClientEntity{" +
                "id=" + id +
                ", officeEntity=" + simbirsoftOffices +
                '}';
    }
}
