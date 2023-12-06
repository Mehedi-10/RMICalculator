import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            String url = "rmi://localhost/CalculatorService";
            Calculator calc = (Calculator) Naming.lookup(url);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter two numbers:");
            float a = scanner.nextFloat();
            float b = scanner.nextFloat();
            System.out.println("Addition: " + calc.add(a, b));
            System.out.println("Subtraction: " + calc.subtract(a, b));
            System.out.println("Multiplication: " + calc.multiply(a, b));
            System.out.println("Division: " + calc.divide(a, b));

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
