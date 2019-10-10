package io.swagger.repository;

import org.springframework.data.repository.CrudRepository;

import io.swagger.entity.ClienteEntity;
import io.swagger.entity.ContaEntity;

public interface Contas extends CrudRepository<ContaEntity, Long>{

	ContaEntity findByAgenciaAndNumeroAndDigitoAndCliente(Integer agencia, Integer numero, Integer digito,
			ClienteEntity cliente);
}