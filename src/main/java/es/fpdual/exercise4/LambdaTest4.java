package es.fpdual.exercise4;

import es.fpdual.exercise3.Calculator;

public class LambdaTest4 {

    public static void main(String[] args) {

        LongCalculator longCalc = (x, y) -> x + y;
        engine(longCalc);

        System.out.println(engine((IntegerCalculator) (x, y) -> x + y));
    }

    public static void engine(IntegerCalculator calculator) {
    }

    public static void engine(LongCalculator calculator) {
    }

}
