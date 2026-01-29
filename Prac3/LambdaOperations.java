import java.util.Scanner;

@FunctionalInterface
interface Operation {
    int compute(int a, int b);
}

public class LambdaOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Lambda expressions
        Operation addition = (x, y) -> x + y;
        Operation subtraction = (x, y) -> x - y;
        Operation multiplication = (x, y) -> x * y;
        Operation division = (x, y) -> y != 0 ? x / y : 0;

        // Display results
        System.out.println("Addition: " + addition.compute(a, b));
        System.out.println("Subtraction: " + subtraction.compute(a, b));
        System.out.println("Multiplication: " + multiplication.compute(a, b));

        if (b != 0) {
            System.out.println("Division: " + division.compute(a, b));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        sc.close();
    }
}
