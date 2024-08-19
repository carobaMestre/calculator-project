import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double firstNumber = promptNumber(scanner, "Digite o primeiro número:");
            char operator = promptOperator(scanner, "Digite o operador (+, -, *, /):");
            double secondNumber = promptNumber(scanner, "Digite o segundo número:");

            CalculatorService calculatorService = new CalculatorService();
            try {
                double result = calculatorService.calculate(firstNumber, secondNumber, operator);
                System.out.println("O resultado é: " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

    private static double promptNumber(Scanner scanner, String message) {
        System.out.println(message);
        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, digite um número válido.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private static char promptOperator(Scanner scanner, String message) {
        System.out.println(message);
        char operator = scanner.next().charAt(0);
        while (!CalculatorService.isValidOperator(operator)) {
            System.out.println("Operador inválido. Por favor, digite um dos seguintes: +, -, *, /.");
            operator = scanner.next().charAt(0);
        }
        return operator;
    }
}

class CalculatorService {

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';

    public double calculate(double firstNumber, double secondNumber, char operator) {
        switch (operator) {
            case ADDITION:
                return firstNumber + secondNumber;
            case SUBTRACTION:
                return firstNumber - secondNumber;
            case MULTIPLICATION:
                return firstNumber * secondNumber;
            case DIVISION:
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("Divisão por zero não é permitida.");
                }
                return firstNumber / secondNumber;
            default:
                throw new IllegalArgumentException("Operador inválido.");
        }
    }

    public static boolean isValidOperator(char operator) {
        return operator == ADDITION || operator == SUBTRACTION || operator == MULTIPLICATION || operator == DIVISION;
    }
}
