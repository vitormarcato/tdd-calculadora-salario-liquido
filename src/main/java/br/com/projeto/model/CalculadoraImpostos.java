package br.com.projeto.model;

import java.math.BigDecimal;

public class CalculadoraImpostos {

    public BigDecimal calcular(Salario salarioBruto, Imposto imposto){
        return imposto.calcular(salarioBruto);
    }

}
