package src.startjava.lesson_2_3.calculator_2;
public class Calculator_2 {

    public double calculate(double num1, double num2, char operation) {
        switch (operation) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return div(num1, num2);
            case '^': return power(num1, num2);
            default: return rem(num1, num2);
        }
    }

    private double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("На 0 делить нельзя");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }

    private double power(double num1, double num2) {
        if (num2 == (int)num2 && 0 < num2) {  // введённое число натуральное
            int pow = 0;
            double result = 1;
            for (pow = 0; pow < num2; pow++) {
                result *= num1;
            }
            return result;
        } else {
            System.out.println("Степень должна быть целым числом");
            return Double.NaN;
        }
    }

    private double rem(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("На 0 делить нельзя");
            return Double.NaN;
        } else {
            return num1 % num2;
        }
    }
}