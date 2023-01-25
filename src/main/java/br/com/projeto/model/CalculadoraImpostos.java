package br.com.projeto.model;

import java.math.BigDecimal;

public class CalculadoraImpostos {
    public BigDecimal salarioLiquido;

    public BigDecimal calcular(Salario salarioBruto){
        salarioLiquido = salarioBruto.getSalarioBruto().multiply(new BigDecimal("0.14"));
        return salarioLiquido;
    }

}
