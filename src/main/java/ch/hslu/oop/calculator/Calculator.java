package ch.hslu.oop.calculator;

public class Calculator implements ICalculator {


    /**
     * Addiert 2 integers.
     *
     * @param a Integer 1
     * @param b Integer 2
     * @return Summe der integers.
     */
    @Override
    public long addition(int a, int b) {
        return (long) a + b;
    }
}
