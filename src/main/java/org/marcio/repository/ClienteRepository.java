package org.marcio.repository;

import org.marcio.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "cliente", path = "cliente")
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long> {

	List<Cliente> findByNome(@Param("nome") String nome);
    List<Cliente> findByNomeContaining(@Param("nome") String nome);

}