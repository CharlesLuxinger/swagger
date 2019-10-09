package io.swagger.repository;

import org.springframework.data.repository.CrudRepository;

import io.swagger.entity.TransacaoEntity;

public interface Transacoes extends CrudRepository<TransacaoEntity, Long> {

}
