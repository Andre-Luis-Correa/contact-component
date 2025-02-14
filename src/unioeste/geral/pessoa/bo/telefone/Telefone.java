package unioeste.geral.pessoa.bo.telefone;

import unioeste.geral.pessoa.bo.ddd.DDD;
import unioeste.geral.pessoa.bo.ddi.DDI;

import java.io.Serializable;

public class Telefone implements Serializable {

    private String numero;
    private DDD ddd;
    private DDI ddi;

    public Telefone(String numero, DDD ddd, DDI ddi) {
        this.numero = numero;
        this.ddd = ddd;
        this.ddi = ddi;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public DDD getDdd() {
        return ddd;
    }

    public void setDdd(DDD ddd) {
        this.ddd = ddd;
    }

    public DDI getDdi() {
        return ddi;
    }

    public void setDdi(DDI ddi) {
        this.ddi = ddi;
    }
}
