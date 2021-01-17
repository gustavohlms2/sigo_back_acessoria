package br.com.springacessoria.pucsigo.controller.dto;

import java.text.DateFormat;

import br.com.springacessoria.pucsigo.model.Contrato;

public class ContratoRs {

    private Long id;
    private Long idacessor;
    private String nome;
    private String empresa;
    private String descricao;
    private String url;
    private String valor;
    private String data_criacao;
    private String data_alteracao;
    private Boolean indativo;


    public static ContratoRs converter(Contrato p) {
        var contrato = new ContratoRs();
        contrato.setId(p.getId());
        contrato.setIdAcessor(p.getIdAcessor());
        contrato.setDescricao(p.getDescricao());
        contrato.setNome(p.getNome());
        contrato.setEmpresa(p.getEmpresa());
        contrato.setUrl(p.getUrl());
        contrato.setValor(p.getValor());
        contrato.setDataCriacao(p.getDataCriacao());
        contrato.setDataAlteracao(p.getDataAlteracao());
        contrato.setIndativo(p.getIndativo());
        return contrato;
    }

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
