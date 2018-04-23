package org.marcio.repository;

import org.marcio.entity.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "usuario", path = "usuario")
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long> {

	List<Usuario> findByNome(@Param("nome") String nome);
    List<Usuario> findByNomeContaining(@Param("nome") String nome);
    List<Usuario> findByEmail(@Param("email") String email);

}