package br.com.springacessoria.pucsigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springacessoria.pucsigo.model.Acessor;

public interface AcessorRepository extends JpaRepository<Acessor, Long> {
    Acessor findById(long id);
}
