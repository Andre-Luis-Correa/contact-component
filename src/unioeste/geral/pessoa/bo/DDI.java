package unioeste.geral.pessoa.bo;

import java.io.Serializable;

public class DDI implements Serializable {

    private Integer numeroDDI;

    public DDI(Integer numeroDDI) {
        this.numeroDDI = numeroDDI;
    }

    public Integer getNumeroDDI() {
        return numeroDDI;
    }

    public void setNumeroDDI(Integer numeroDDI) {
        this.numeroDDI = numeroDDI;
    }
}
