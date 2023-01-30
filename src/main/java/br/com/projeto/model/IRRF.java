package br.com.projeto.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IRRF extends Imposto {

    private BigDecimal aliquotaIrrf;
    protected BigDecimal baseDeCalculoIrrf;

    @Override
    protected BigDecimal efetuarCalculo(Salario salario) {

        baseDeCalculoIrrf = salario.getSalarioBruto().subtract(new INSS().efetuarCalculo(salario)).subtract(new Dependentes().efetuarCalculo(salario));

        if (baseDeCalculoIrrf.compareTo((new BigDecimal("1903.98"))) <= 0) {
            aliquotaIrrf = new BigDecimal("0");

        }else if (baseDeCalculoIrrf.compareTo((new BigDecimal("1903.98"))) > 0 && baseDeCalculoIrrf.compareTo((new BigDecimal("2826.66"))) < 0) {
            aliquotaIrrf = new BigDecimal("0.075");

        }else if (baseDeCalculoIrrf.compareTo((new BigDecimal("2826.65"))) > 0 && baseDeCalculoIrrf.compareTo((new BigDecimal("3751.06"))) < 0) {
                aliquotaIrrf = new BigDecimal("0.150");

        } else if (baseDeCalculoIrrf.compareTo((new BigDecimal("3751.05"))) >0 && baseDeCalculoIrrf.compareTo((new BigDecimal("4664.68"))) <0) {
            aliquotaIrrf = new BigDecimal("0.225");

        } else if (baseDeCalculoIrrf.compareTo((new BigDecimal("4664.68"))) >0){
            aliquotaIrrf = new BigDecimal("0.275");
        }

        return baseDeCalculoIrrf.multiply(aliquotaIrrf).setScale(2, RoundingMode.HALF_UP);
    }

}

