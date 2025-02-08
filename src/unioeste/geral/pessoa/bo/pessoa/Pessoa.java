package unioeste.geral.pessoa.bo.pessoa;

import unioeste.geral.endereco.bo.enderecoespecifico.EnderecoEspecifico;
import unioeste.geral.pessoa.bo.telefone.Telefone;
import unioeste.geral.pessoa.bo.email.Email;

import java.io.Serializable;
import java.util.List;

public class Pessoa implements Serializable {

    private Long id;
    private String nome;
    private EnderecoEspecifico enderecoEspecifico;
    private List<Telefone> telefones;
    private List<Email> emails;

    public Pessoa(Long id, String nome, EnderecoEspecifico enderecoEspecifico, List<Telefone> telefones, List<Email> emails) {
        this.id = id;
        this.nome = nome;
        this.enderecoEspecifico = enderecoEspecifico;
        this.telefones = telefones;
        this.emails = emails;
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

    public EnderecoEspecifico getEnderecoEspecifico() {
        return enderecoEspecifico;
    }

    public void setEnderecoEspecifico(EnderecoEspecifico enderecoEspecifico) {
        this.enderecoEspecifico = enderecoEspecifico;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }
}
