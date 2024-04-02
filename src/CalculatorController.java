public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    public void calculate() {
        String input = view.getInput();
        String[] parts = input.split(" ");
        double num1 = Double.parseDouble(parts[0]);
        String operator = parts[1];
        double num2 = Double.parseDouble(parts[2]);
        double result = model.calculate(num1, num2, operator);
        view.printResult(result);
    }
}
