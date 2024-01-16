
public class TryMyModule {
    public static void main(String[] args) {
        // Import the custom module and use its functions
        int sum = Mymodule.add(5, 3);
        int difference = Mymodule.subtract(10, 4);
        int product = Mymodule.multiply(6, 7);
        double quotient = Mymodule.divide(15.0, 3.0);
        Mymodule.printMessage();

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
