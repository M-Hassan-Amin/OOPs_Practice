public class Mymodule {

    public static void printMessage() {
        System.out.println("Hello from MyModule!");
    }

    public static int add(int a, int b) {
        int c = a+b;
        return c;
    }

    public static int subtract(int a, int b) {
        int c = a-b;
        return c;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
    }
}
}
