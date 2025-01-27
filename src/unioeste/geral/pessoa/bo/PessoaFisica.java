package unioeste.geral.pessoa.bo;

import unioeste.geral.endereco.bo.EnderecoEspecifico;

import java.io.Serializable;
import java.util.List;

public class PessoaFisica extends Pessoa implements Serializable {

    private String primeiroNome;
    private String nomeMeio;
    private String ultimoNome;
    private Sexo sexo;
    private CPF cpf;

    public PessoaFisica(Long id, String nome, EnderecoEspecifico enderecoEspecifico, List<Telefone> telefones, List<Email> emails, String primeiroNome, String nomeMeio, String ultimoNome, Sexo sexo, CPF cpf) {
        super(id, nome, enderecoEspecifico, telefones, emails);
        this.primeiroNome = primeiroNome;
        this.nomeMeio = nomeMeio;
        this.ultimoNome = ultimoNome;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getNomeMeio() {
        return nomeMeio;
    }

    public void setNomeMeio(String nomeMeio) {
        this.nomeMeio = nomeMeio;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }
}
