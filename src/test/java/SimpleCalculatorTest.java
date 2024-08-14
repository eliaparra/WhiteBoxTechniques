import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    @Test
    void dosMasDosSonCuatro() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.sumar(2, 2));

    }

    @Test
    void unNumeroNegativo() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(1, calculator.sumar(-1, 2));

    }

    @Test
    void multiplicarPositvos() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.multiplicar(2, 2));
    }

    @Test
    void multiplicarNegativos() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(6, calculator.multiplicar(-2, -3));
    }

    @Test
    void multiplicarPositivoYNegativo() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(-6, calculator.multiplicar(2, -3));
    }

    @Test
    void multiplicarCero() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(0, calculator.multiplicar(0, -3));
    }
}
