package br.com.projeto.model;

import java.math.BigDecimal;

public class CalculadoraDescontos {

    public BigDecimal calcular(Salario salarioBruto, Desconto desconto){
        return desconto.calcular(salarioBruto);
    }

}
