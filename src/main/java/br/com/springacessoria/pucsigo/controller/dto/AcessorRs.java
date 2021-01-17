package br.com.springacessoria.pucsigo.controller.dto;

import java.text.DateFormat;

import br.com.springacessoria.pucsigo.model.Acessor;

public class AcessorRs {

    private Long id;
    private String nome;
    private String descricao;
    private String cpf;
    private String cnpj;
    private String telefone;
    private String data_criacao;
    private String data_alteracao;
    private Boolean indativo;

    public static AcessorRs converter(Acessor p) {
        var acessor = new AcessorRs();
        acessor.setId(p.getId());
        acessor.setNome(p.getNome());
        acessor.setDescricao(p.getDescricao());
        acessor.setCpf(p.getCpf());
        acessor.setCnpj(p.getCnpj());
        acessor.setTelefone(p.getTelefone());
        acessor.setDataCriacao(p.getDataCriacao());
        acessor.setDataAlteracao(p.getDataAlteracao());
        acessor.setIndativo(p.getIndativo());
        return acessor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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
