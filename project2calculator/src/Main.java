import java.util.*;

public class Calculator {
    private static final List<String> history = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");

        while (true) {
            System.out.print("Please enter your arithmetic expression: ");
            String expression = scanner.nextLine();

            if (expression.equalsIgnoreCase("history")) {
                showHistory();
                continue;
            }

            try {
                double result = evaluateExpression(expression);
                System.out.println("Result: " + result);
                history.add(expression + " = " + result);
            } catch (Exception e) {
                System.out.println("Invalid expression: " + e.getMessage());
            }

            System.out.print("Do you want to continue? (y/n): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Thank you for using the Calculator!");
    }

    private static void showHistory() {
        System.out.println("Calculation History:");
        for (String entry : history) {
            System.out.println(entry);
        }
    }

    private static double evaluateExpression(String expression) throws Exception {
        expression = expression.replaceAll(" ", "");

        try {
            return new ScriptEngineManager().getEngineByName("JavaScript").eval(expression) instanceof Number ?
                    ((Number) new ScriptEngineManager().getEngineByName("JavaScript").eval(expression)).doubleValue() : 0;
        } catch (Exception e) {
            throw new Exception("Invalid input. Please enter a valid arithmetic expression.");
        }
    }
}
import java.util.*;

public class Calculator {
    private static final List<String> history = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator!");

        while (true) {
            System.out.print("Please enter your arithmetic expression: ");
            String expression = scanner.nextLine();

            if (expression.equalsIgnoreCase("history")) {
                showHistory();
                continue;
            }

            try {
                double result = evaluateExpression(expression);
                System.out.println("Result: " + result);
                history.add(expression + " = " + result);
            } catch (Exception e) {
                System.out.println("Invalid expression: " + e.getMessage());
            }

            System.out.print("Do you want to continue? (y/n): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Thank you for using the Calculator!");
    }

    private static void showHistory() {
        System.out.println("Calculation History:");
        for (String entry : history) {
            System.out.println(entry);
        }
    }

    private static double evaluateExpression(String expression) throws Exception {
        expression = expression.replaceAll(" ", "");

        try {
            return new ScriptEngineManager().getEngineByName("JavaScript").eval(expression) instanceof Number ?
                    ((Number) new ScriptEngineManager().getEngineByName("JavaScript").eval(expression)).doubleValue() : 0;
        } catch (Exception e) {
            throw new Exception("Invalid input. Please enter a valid arithmetic expression.");
        }
    }
}
