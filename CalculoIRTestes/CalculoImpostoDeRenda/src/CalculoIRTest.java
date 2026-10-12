import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculoIRTest {

    private final CalculoIR calculadora = new CalculoIR();

    @Test
    void testRendimentoInvalido() {
        assertEquals("Erro: Rendimento inválido", calculadora.calcularIR(-1.00));
    }

    @Test
    void testIsencaoTotal() {
        assertEquals("Isenção total", calculadora.calcularIR(4000.00));
    }

    @Test
    void testDesconto75() {
        assertEquals("Desconto de 75%", calculadora.calcularIR(5200.00));
    }

    @Test
    void testDesconto50() {
        assertEquals("Desconto de 50%", calculadora.calcularIR(5800.00));
    }

    @Test
    void testDesconto25() {
        assertEquals("Desconto de 25%", calculadora.calcularIR(6200.00));
    }

    @Test
    void testDesconto10() {
        assertEquals("Desconto de 10%", calculadora.calcularIR(7000.00));
    }

    @Test
    void testAliquotaMaxima() {
        assertEquals("Alíquota 27,5%", calculadora.calcularIR(8000.00));
    }
}