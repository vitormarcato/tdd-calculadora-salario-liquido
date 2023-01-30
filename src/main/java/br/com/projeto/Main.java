package br.com.projeto;

import br.com.projeto.model.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Salario salario = new Salario(new BigDecimal("5000"),new BigDecimal("2"), new BigDecimal("0"));
        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        System.out.println(salario.getSalarioBruto());
        System.out.println(calculadora.calcular(salario, new INSS()));
        System.out.println(calculadora.calcular(salario, new Dependentes()));
        System.out.println(calculadora.calcular(salario, new IRRF()));

    }
}