package com.example.aluguel.service;

import com.example.aluguel.model.Client;
import com.example.aluguel.repository.ClientRepository;
import com.example.aluguel.service.Interface.IclientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.List;
@Service
public class ClientService implements IclientService {
    @Autowired
    private final ClientRepository clientRepository;
    private final EntityManagerFactory entityManagerFactory;

    public ClientService(ClientRepository clientRepository, EntityManagerFactory entityManagerFactory) {
        this.clientRepository = clientRepository;
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public Client getById(Long id) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public Client create(Client client) {
        System.out.println("job");
        Client clientCreated = clientRepository.save(client);
        return clientCreated;
    }

    @Override
    public Client deleteById(Client clientId) {
        return null;
    }

    @Override
    public Client update(Client client) {
        return null;
    }
}
