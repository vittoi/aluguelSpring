package com.example.aluguel.repository;

import com.example.aluguel.model.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@Repository

public interface ClientRepository  extends JpaRepository<Client, Long> {

}
