package br.com.projeto.model;

import java.math.BigDecimal;

public class Salario {

    private BigDecimal salarioBruto;
    private int numeroDependentes;
    private BigDecimal descontos;

    public Salario(BigDecimal salarioBruto, int numeroDependentes, BigDecimal descontos) {
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

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public BigDecimal getDescontos() {
        return descontos;
    }

    public void setDescontos(BigDecimal descontos) {
        this.descontos = descontos;
    }
}
