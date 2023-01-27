package br.com.projeto.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IRRF extends Imposto {

    public IRRF(Imposto outro) {
        super(outro);
    }

    private BigDecimal aliquotaIrrf;

    @Override
    protected BigDecimal efetuarCalculo(Salario salario) {
        if (salario.getSalarioBruto().compareTo((new BigDecimal("1903.98"))) <= 0){
            aliquotaIrrf = new BigDecimal("0");}

        else if ((salario.getSalarioBruto().compareTo((new BigDecimal("1903.98"))) > 0) && (salario.getSalarioBruto().compareTo((new BigDecimal("2826.66"))) < 0)) {
            aliquotaIrrf = new BigDecimal("0.075");

        }else if ((salario.getSalarioBruto().compareTo((new BigDecimal("2826.65"))) > 0) && (salario.getSalarioBruto().compareTo((new BigDecimal("3751.06"))) < 0)) {
                aliquotaIrrf = new BigDecimal("0.150");

        } else if ((salario.getSalarioBruto().compareTo((new BigDecimal("3751.05"))) >0) && (salario.getSalarioBruto().compareTo((new BigDecimal("4664.68"))) <0)) {
            aliquotaIrrf = new BigDecimal("0.225");

        } else if (salario.getSalarioBruto().compareTo((new BigDecimal("4664.68"))) >0){
            aliquotaIrrf = new BigDecimal("0.275");
        }

        return salario.getSalarioBruto().multiply(aliquotaIrrf).setScale(2, RoundingMode.HALF_UP);
    }

}

