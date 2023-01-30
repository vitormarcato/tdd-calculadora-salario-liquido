package br.com.projeto.model;

import java.math.BigDecimal;

public class Dependentes extends Desconto {

    private BigDecimal deducaoPorDependente = new BigDecimal("189.59");
    @Override
    protected BigDecimal efetuarCalculo(Salario salario) {
        return deducaoPorDependente.multiply(salario.getNumeroDependentes());
    }

}
