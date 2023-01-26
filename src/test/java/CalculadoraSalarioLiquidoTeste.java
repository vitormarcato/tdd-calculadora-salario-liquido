import br.com.projeto.model.CalculadoraImpostos;
import br.com.projeto.model.INSS;
import br.com.projeto.model.Salario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraSalarioLiquidoTeste {

    @Test
    @DisplayName("Calcular valor do imposto INSS")
    void calcularValorDoImpostoInss() {
        Salario salario = new Salario(new BigDecimal("5000"),0, new BigDecimal("0"));
        CalculadoraImpostos calculadora = new CalculadoraImpostos();

        assertEquals(new BigDecimal("700.00"), calculadora.calcular(salario, new INSS(null)));

    }

}
