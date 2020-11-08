package src.startjava.lesson_1.Calculator;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        double num1 = inputNumber();
        char operation = inputOperation();
        double num2 = inputNumber();
        double result = calculate(num1, num2, operation);
        System.out.println("Результат равен " + result);
    }

    private static double inputNumber() {
        System.out.print("Введите число ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextDouble()) {
            return scan.nextDouble();
        }
        System.out.println("Число введено не корректно, введите число ");
        return inputNumber();
    }

    private static char inputOperation() {
        System.out.println("Введите действие:");
        System.out.println("+ Сложение");
        System.out.println("- Вычитание ");
        System.out.println("* Умножение ");
        System.out.println("/ Деление");
        System.out.println("^ Возведение в степень");
        System.out.println("% Остаток от деления");
        Scanner scan = new Scanner(System.in);
        char operation;
        if (scan.hasNext()) {
            operation = scan.next().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '^' || operation == '%') {
                return operation;
            }
        }
        System.out.println("Вы ввели не правильную операцию, введите ");
        return inputOperation();
    }

    private static double calculate(double num1, double num2, char operation) {
        if (operation == '+') {
            return add(num1, num2);
        } else if (operation == '-') {
            return sub(num1, num2);
        } else if (operation == '*') {
            return mul(num1, num2);
        } else if (operation == '/') {
            return div(num1, num2);
        } else if (operation == '^') {
            return power(num1, num2);
        } else {
            return rem(num1, num2);
        }
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double sub(double num1, double num2) {
        return num1 - num2;
    }

    private static double mul(double num1, double num2) {
        return num1 * num2;
    }

    private static double div(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("На 0 делить нельзя");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }

    private static double power(double num1, double num2) {
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

    private static double rem(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("На 0 делить нельзя");
            return Double.NaN;
        } else {
            return num1 % num2;
        }
    }
}