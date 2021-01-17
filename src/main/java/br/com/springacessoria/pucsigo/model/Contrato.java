package br.com.springacessoria.pucsigo.model;


import java.text.DateFormat;
import javax.persistence.*;

@Entity
@Table(name = "contrato")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="idacessor")
    private Long idacessor;

    @Column(name="nome")
    private String nome;

    @Column(name="empresa")
    private String empresa;

    @Column(name="descricao")
    private String descricao;

    @Column(name="url")
    private String url;

    @Column(name="valor")
    private String valor;

    @Column(name="data_criacao")
    private String data_criacao;

    @Column(name="data_alteracao")
    private String data_alteracao;

    @Column(name="indativo")
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
