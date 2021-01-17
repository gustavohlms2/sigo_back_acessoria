package br.com.springacessoria.pucsigo.repository;

import br.com.springacessoria.pucsigo.model.Acessor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcessorRepository extends JpaRepository<Acessor, Long> {
    
}
