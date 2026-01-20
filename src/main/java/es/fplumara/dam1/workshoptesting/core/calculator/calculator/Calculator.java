package es.fplumara.dam1.workshoptesting.core.calculator.calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division por cero no permitida");
        }
        return a / b;
    }
}