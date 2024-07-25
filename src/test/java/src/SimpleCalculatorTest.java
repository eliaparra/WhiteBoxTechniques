package src;

import org.junit.jupiter.api.Test;

import  static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

    @Test
    void dosMasDosSonCuatro(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(calculator.sumar(2,2),4);

    }
    @Test
    void unNumeroNegativo(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(calculator.sumar(-1,2),1);

    }
    @Test
    void multiplicarPositvos(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(calculator.multiplicar(2,2),4);
    }
    @Test
    void multiplicarNegativos(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(calculator.multiplicar(-2,-3),6);
    }
    @Test
    void multiplicarPositivoYNegativo(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(calculator.multiplicar(2,-3),-6);
    }
    @Test
    void multiplicarCero(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(calculator.multiplicar(0,-3),0);
    }
}
