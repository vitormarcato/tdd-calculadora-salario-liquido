package br.com.projeto.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class INSS extends Desconto {

    private BigDecimal aliquotaInss;

    @Override
    protected BigDecimal efetuarCalculo(Salario salario) {
        if (salario.getSalarioBruto().compareTo((new BigDecimal("1212.01"))) < 0){
            aliquotaInss = new BigDecimal("0.075");}

        else if ((salario.getSalarioBruto().compareTo((new BigDecimal("1212.00"))) > 0) && (salario.getSalarioBruto().compareTo((new BigDecimal("2427.36"))) < 0)) {
            aliquotaInss = new BigDecimal("0.090");

        } else if ((salario.getSalarioBruto().compareTo((new BigDecimal("2427.36"))) >0) && (salario.getSalarioBruto().compareTo((new BigDecimal("3641.04"))) <0)) {
            aliquotaInss = new BigDecimal("0.120");

        } else if (salario.getSalarioBruto().compareTo((new BigDecimal("3641.04"))) >0){
            aliquotaInss = new BigDecimal("0.140");
        }

        return salario.getSalarioBruto().multiply(aliquotaInss).setScale(2, RoundingMode.HALF_UP);
    }

}

