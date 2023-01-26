package br.com.projeto.model;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal efetuarCalculo(Salario salario);

    public BigDecimal calcular(Salario salario){
        BigDecimal valorImposto = efetuarCalculo(salario);
        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (outro != null){
            valorOutroImposto = outro.efetuarCalculo(salario);
        }
        return valorImposto.add(valorOutroImposto);
    }


}
