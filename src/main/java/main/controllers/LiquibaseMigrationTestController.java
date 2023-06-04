package main.controllers;


import main.entities.ClientEntity;
import main.entities.SimbirsoftOffices;
import main.repositories.ClientRepository;
import main.repositories.OfficeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.Random;

@RestController
public class LiquibaseMigrationTestController {
    private final OfficeRepository officeRepository;
    private final ClientRepository clientRepository;

    public LiquibaseMigrationTestController(OfficeRepository officeRepository, ClientRepository clientRepository) {
        this.officeRepository = officeRepository;
        this.clientRepository = clientRepository;
    }

    @GetMapping("/add")
    public ResponseEntity<?> createClient(){
        Random r = new Random();
        int officeId = r.nextInt(5);
        Optional<SimbirsoftOffices> officeEntity = officeRepository.findById(officeId);
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setOfficeEntity(officeEntity.get());
        clientEntity = clientRepository.save(clientEntity);
        return ResponseEntity.ok(clientEntity.toString());
    }

    @GetMapping("/view")
    public ResponseEntity<?> viewClients(){
        Iterable<ClientEntity> clientEntityIterable = clientRepository.findAll();
        clientEntityIterable.forEach(System.out::println);
        return ResponseEntity.ok(clientEntityIterable.toString());
    }
}
