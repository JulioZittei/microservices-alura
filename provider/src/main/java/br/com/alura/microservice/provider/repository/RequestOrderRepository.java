package br.com.alura.microservice.provider.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.provider.model.RequestOrder;

@Repository
public interface RequestOrderRepository extends CrudRepository<RequestOrder, Long> {

}
