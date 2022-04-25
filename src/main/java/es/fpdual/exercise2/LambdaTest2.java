package es.fpdual.exercise2;

public class LambdaTest2 {
    public static void main(String[] args) {
        Operations op = (num1, num2) -> System.out.println(num1 + num2);
        op.printOperation(10, 25);

        LambdaTest2 obj = new LambdaTest2();
        obj.myMethod((num1, num2) -> System.out.println(num1 + num2), 14, 36);
    }

    public void myMethod(Operations op, int num1, int num2) {
        op.printOperation(num1, num2);
    }
}
