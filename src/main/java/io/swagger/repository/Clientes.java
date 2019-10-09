package io.swagger.repository;

import org.springframework.data.repository.CrudRepository;

import io.swagger.entity.ClienteEntity;

public interface Clientes extends CrudRepository<ClienteEntity, Long> {

	ClienteEntity findByCpfAndPassword(String cpf, String password);
}