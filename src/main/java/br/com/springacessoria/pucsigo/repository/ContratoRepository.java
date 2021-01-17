package br.com.springacessoria.pucsigo.repository;

import br.com.springacessoria.pucsigo.model.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long> {
    
}
