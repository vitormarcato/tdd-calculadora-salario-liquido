package br.com.projeto;

import br.com.projeto.model.CalculadoraImpostos;
import br.com.projeto.model.Salario;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Salario salario = new Salario(new BigDecimal("2000"), 0, new BigDecimal(0));
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        calculadora.calcular(salario);
        System.out.println(calculadora.salarioLiquido);
    }
}