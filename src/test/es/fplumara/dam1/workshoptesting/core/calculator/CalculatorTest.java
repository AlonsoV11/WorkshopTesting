package es.fplumara.dam1.workshoptesting.core.calculator;

import es.fplumara.dam1.workshoptesting.core.calculator.calculator.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

        private static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }


    @Test

  public void divisionEnteraPorero(){
       Calculator calculator = new Calculator();
       IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
           calculator.divide(4, 0);
       });
       assertEquals("Divsión por cero no permitida",ex.getMessage());

       }


  }




