package unioeste.geral.pessoa.bo.cpf;

import java.io.Serializable;

public class CPF implements Serializable {

    private String cpf;

    public CPF(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
