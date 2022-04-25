package es.fpdual.exercise4;

public class Main {
    public static void main(String[] args) {
        System.out.println(create().calculate(50, 25));
    }

    private static LongCalculator create() {
        return (x, y) -> x / y;
    }
}
