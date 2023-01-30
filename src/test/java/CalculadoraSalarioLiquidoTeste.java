import br.com.projeto.model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSalarioLiquidoTeste {

    @Test
    @DisplayName("Calcular valor do imposto INSS")
    void calcularValorDoImpostoInss() {
        Salario salario = new Salario(new BigDecimal("5000"),new BigDecimal("0"), new BigDecimal("0"));
        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        assertEquals(new BigDecimal("700.00"), calculadora.calcular(salario, new INSS()));
    }

    @Test
    @DisplayName("Calcular o valor do imposto IRRF")
    void calcularOValorDoImpostoIrrf() {
        Salario salario = new Salario(new BigDecimal("5000"),new BigDecimal("0"), new BigDecimal("0"));
        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        assertEquals(new BigDecimal("967.50"), calculadora.calcular(salario, new IRRF()));

    }

    @Test
    @DisplayName("Calcular a dedução de valor por dependente")
    void calcularADeduçãoDeValorPorDependente() {
        Salario salario = new Salario(new BigDecimal("5000"),new BigDecimal("2"), new BigDecimal("0"));
        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        assertEquals(new BigDecimal("379.18"), calculadora.calcular(salario, new Dependentes()));

    }

    @Test
    @DisplayName("Calcular a dedução de outros descontos")
    void calcularADeduçãoDeOutrosDescontos() {
        Salario salario = new Salario(new BigDecimal("5000"),new BigDecimal("2"), new BigDecimal("250"));
        CalculadoraDescontos calculadora = new CalculadoraDescontos();

        assertEquals(new BigDecimal("250.00"), calculadora.calcular(salario, new OutrosDescontos()));


    }
}
