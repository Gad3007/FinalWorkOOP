import java.util.Scanner;

public class CalculatorView {
    public void printResult(double result) {
        System.out.println("Результат: " + result);
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите операцию (например, 2 + 2): ");
        return scanner.nextLine();
    }
}