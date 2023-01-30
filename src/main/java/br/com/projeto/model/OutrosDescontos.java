package br.com.projeto.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OutrosDescontos extends Desconto {
    @Override
    protected BigDecimal efetuarCalculo(Salario salario) {
        return salario.getDescontos().setScale(2, RoundingMode.HALF_UP);
    }

}
