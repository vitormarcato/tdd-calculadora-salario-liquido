import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculadoraSalarioLiquidoTeste {

    @Test
    @DisplayName("Calcular valor do imposto INSS")
    void calcularValorDoImpostoInss() {
        Salario salario = new Salario(new BigDecimal("5000"), "0", new BigDecimal("0"));
        Imposto inss = new Imposto();
        CalculadoraImpostos calculadora = new CalculadoraImpostos();
        int salarioLiquido = calculadora.calcular;

        Assertions.assertEquals(new BigDecimal("700"), salarioLiquido);

    }

}
