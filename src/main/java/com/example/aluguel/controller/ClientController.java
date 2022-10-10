package com.example.aluguel.controller;

import com.example.aluguel.model.Client;
import com.example.aluguel.service.Interface.IclientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/client")
public class ClientController {
    private final IclientService clientService;

    @Autowired
    public ClientController(IclientService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Client> create(@RequestBody Client clientDTO) {

        Client client = clientService.create(clientDTO);

        return new ResponseEntity<Client>( client, HttpStatus.CREATED);
    }

}
