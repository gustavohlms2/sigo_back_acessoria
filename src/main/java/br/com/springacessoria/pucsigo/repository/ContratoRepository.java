package br.com.springacessoria.pucsigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springacessoria.pucsigo.model.Contrato;

public interface ContratoRepository extends JpaRepository<Contrato, Long> {
    Contrato findById(long id);
}
