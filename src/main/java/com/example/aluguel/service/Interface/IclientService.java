package com.example.aluguel.service.Interface;

import com.example.aluguel.model.Client;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface IclientService {

    Client getById(Long id);
    List<Client> findAll();
    Client create(Client client);
    Client deleteById(Client clientId);
    Client update(Client client);
}
