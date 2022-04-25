package es.fpdual.exercise3;

public class LambdaTest3 {
    public static void main(String[] args) {
        engine((x, y) -> x + y);
        engine((x, y) -> x - y);
        engine((x, y) -> x * y);
        engine((x, y) -> x % y);
    }

    private static void engine(Calculator calculator) {
        int x = 9, y = 5;
        int result = calculator.calcualte(x, y);
        System.out.println(result);
    }
}
