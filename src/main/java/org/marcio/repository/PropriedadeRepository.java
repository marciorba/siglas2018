package org.marcio.repository;

import java.util.List;

import org.marcio.entity.Propriedade;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Propriedade", path = "Propriedade")
public interface PropriedadeRepository extends PagingAndSortingRepository<Propriedade, Long> {

	List<Propriedade> findByNome(@Param("nome") String nome);
    List<Propriedade> findByNomeContaining(@Param("nome") String nome);

}
