package br.com.projeto.model;

import java.math.BigDecimal;

public class Salario {

    private BigDecimal salarioBruto;
    private BigDecimal numeroDependentes;
    private BigDecimal descontos;

    public Salario(BigDecimal salarioBruto, BigDecimal numeroDependentes, BigDecimal descontos) {
        this.salarioBruto = salarioBruto;
        this.numeroDependentes = numeroDependentes;
        this.descontos = descontos;
    }

    public BigDecimal getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(BigDecimal salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public BigDecimal getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(BigDecimal numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public BigDecimal getDescontos() {
        return descontos;
    }

    public void setDescontos(BigDecimal descontos) {
        this.descontos = descontos;
    }
}
