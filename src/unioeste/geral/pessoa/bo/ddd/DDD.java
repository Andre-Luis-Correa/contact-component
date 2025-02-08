package unioeste.geral.pessoa.bo.ddd;

import java.io.Serializable;

public class DDD implements Serializable {

    private Integer numeroDDD;

    public DDD(Integer numeroDDD) {
        this.numeroDDD = numeroDDD;
    }

    public Integer getNumeroDDD() {
        return numeroDDD;
    }

    public void setNumeroDDD(Integer numeroDDD) {
        this.numeroDDD = numeroDDD;
    }
}
