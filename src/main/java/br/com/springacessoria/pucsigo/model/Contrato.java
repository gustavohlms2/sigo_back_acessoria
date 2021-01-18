package br.com.springacessoria.pucsigo.model;


import java.text.DateFormat;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "contrato")
public class Contrato implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @NotNull
    private Long idacessor;

    @NotNull
    private String nome;

    @NotNull
    private String empresa;

    @NotNull
    private String descricao;

    @NotNull
    private String url;

    @NotNull
    private String valor;

    @NotNull
    private String data_criacao;
    
    private String data_alteracao;

    @NotNull
    private Boolean indativo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdAcessor() {
        return idacessor;
    }

    public void setIdAcessor(Long idacessor) {
        this.idacessor = idacessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getDataCriacao() {
        return data_criacao;
    }

    public void setDataCriacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public String getDataAlteracao() {
        return data_alteracao;
    }

    public void setDataAlteracao(String data_alteracao) {
        this.data_alteracao = data_alteracao;
    }

    public Boolean getIndativo() {
        return indativo;
    }

    public void setIndativo(Boolean indativo) {
        this.indativo = indativo;
    }
}
