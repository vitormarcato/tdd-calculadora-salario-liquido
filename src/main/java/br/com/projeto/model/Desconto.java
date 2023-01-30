package br.com.projeto.model;

import java.math.BigDecimal;

public abstract class Desconto {
    protected abstract BigDecimal efetuarCalculo(Salario salario);

    public BigDecimal calcular(Salario salario){
        return efetuarCalculo(salario);
    }


}
