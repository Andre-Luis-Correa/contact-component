package unioeste.geral.pessoa.bo;

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
