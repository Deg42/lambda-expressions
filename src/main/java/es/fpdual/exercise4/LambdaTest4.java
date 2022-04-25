package es.fpdual.exercise4;

public class LambdaTest4 {

    public static void main(String[] args) {

        engine((IntegerCalculator) (x, y) -> x + y);

        LongCalculator longCalc = (x, y) -> x + y;
        engine(longCalc);
    }

    public static void engine(IntegerCalculator calculator) {
    }

    public static void engine(LongCalculator calculator) {
    }

}
