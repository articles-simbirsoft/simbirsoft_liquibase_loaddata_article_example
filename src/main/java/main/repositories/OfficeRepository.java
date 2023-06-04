package main.repositories;

import main.entities.SimbirsoftOffices;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeRepository extends CrudRepository<SimbirsoftOffices, Integer> {
}
