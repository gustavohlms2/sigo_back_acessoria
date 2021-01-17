package br.com.springacessoria.pucsigo.repository;

import br.com.springacessoria.pucsigo.model.Contrato;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ContratoCustomRepository {

    private final EntityManager em;

    public ContratoCustomRepository(EntityManager em) {
        this.em = em;
    }

    public List<Contrato> find(Long id, String nome, String empresa) {

        String query = "select P from Contrato as P ";
        String condicao = "where";

        if(id != null) {
            query += condicao + " P.id = :id";
            condicao = " and ";
        }

        if(nome != null) {
            query += condicao + " P.nome = :nome";
            condicao = " and ";
        }

        if(empresa != null) {
            query += condicao + " P.empresa = :empresa";
        }

        var q = em.createQuery(query, Contrato.class);

        if(id != null) {
            q.setParameter("id", id);
        }

        if(nome != null) {
            q.setParameter("nome", nome);
        }

        if(empresa != null) {
            q.setParameter("empresa", empresa);
        }

        return q.getResultList();
    }

}
