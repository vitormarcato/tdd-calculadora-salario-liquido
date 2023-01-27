package br.com.projeto;

import br.com.projeto.model.CalculadoraImpostos;
import br.com.projeto.model.INSS;
import br.com.projeto.model.IRRF;
import br.com.projeto.model.Salario;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Salario salario = new Salario(new BigDecimal("5000"),0, new BigDecimal("0"));
        CalculadoraImpostos calculadora = new CalculadoraImpostos();

        System.out.println(salario.getSalarioBruto());
        System.out.println(calculadora.calcular(salario, new INSS()));
        System.out.println(calculadora.calcular(salario, new IRRF()));
    }
}