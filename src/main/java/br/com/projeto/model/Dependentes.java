package br.com.projeto.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dependentes extends Imposto {

    private BigDecimal deducaoPorDependente = new BigDecimal("189.59");
    @Override
    protected BigDecimal efetuarCalculo(Salario salario) {
        return deducaoPorDependente.multiply(salario.getNumeroDependentes());
    }

}
