package br.com.springacessoria.pucsigo.repository;

import br.com.springacessoria.pucsigo.model.Acessor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AcessorCustomRepository {

    private final EntityManager em;

    public AcessorCustomRepository(EntityManager em) {
        this.em = em;
    }

    public List<Acessor> find(Long id, String nome, String telefone) {

        String query = "select P from Acessor as P ";
        String condicao = "where";

        if(id != null) {
            query += condicao + " P.id = :id";
            condicao = " and ";
        }

        if(nome != null) {
            query += condicao + " P.nome = :nome";
            condicao = " and ";
        }

        if(telefone != null) {
            query += condicao + " P.telefone = :telefone";
        }

        var q = em.createQuery(query, Acessor.class);

        if(id != null) {
            q.setParameter("id", id);
        }

        if(nome != null) {
            q.setParameter("nome", nome);
        }

        if(telefone != null) {
            q.setParameter("telefone", telefone);
        }

        return q.getResultList();
    }

}
