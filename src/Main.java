import java.util.Scanner;

class CalculatorClass {
    private double number1;
    private double number2;
    private int operator;

    public CalculatorClass(double number1, double number2, int operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public double count() {
        double result = 0;
        switch (operator) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Division by zero is not permitted.");
                    return Double.NaN;
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return Double.NaN;
        }
        return result;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCalculator");
        System.out.println("=========================");
        System.out.println("1. Increase ( + )");
        System.out.println("2. Decrease ( - )");
        System.out.println("3. Multiplication ( * )");
        System.out.println("4. Distribution ( / )");

        System.out.print("\nSelect Operation (1, 2, 3, 4): ");
        int operator = scanner.nextInt();

        System.out.print("Input Number-1: ");
        double number1 = scanner.nextDouble();

        System.out.print("Input Number-2: ");
        double number2 = scanner.nextDouble();

        CalculatorClass kalkulator = new CalculatorClass(number1, number2, operator);
        double result = kalkulator.count();

        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
    }
}