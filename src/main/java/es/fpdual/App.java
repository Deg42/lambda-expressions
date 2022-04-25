package es.fpdual;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Lambda lambda = () -> System.out.println("Hello World");
        lambda.greeting();

        App obj = new App();
        obj.myMethod(lambda);

    }

    public void myMethod(Lambda param) {
        param.greeting();
    }
}
