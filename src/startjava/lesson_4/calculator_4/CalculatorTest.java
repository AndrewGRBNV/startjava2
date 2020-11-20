package src.startjava.lesson_2_3.calculator_2;
import java.util.Scanner;

public class CalculatorTest {


    public static void main(String[] args) {
        Calculator_2 calc = new Calculator_2();
        do {
            double num1 = inputNumber();
            char operation = inputOperation();
            double num2 = inputNumber();
            double result = calc.calculate(num1, num2, operation);
            System.out.println("Результат равен " + result);
        } while (!isNext());
    }

    public static double inputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число ");
        if (scan.hasNextDouble()) {
            return scan.nextDouble();
        }
        System.out.println("Число введено не корректно, введите число ");
        return inputNumber();
    }

    public static char inputOperation() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите действие:");
        System.out.println("+ Сложение");
        System.out.println("- Вычитание ");
        System.out.println("* Умножение ");
        System.out.println("/ Деление");
        System.out.println("^ Возведение в степень");
        System.out.println("% Остаток от деления");
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

    public static boolean isNext() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Хотите продолжить? да / нет");
        if (scan.hasNext()) {
            switch (scan.next()) {
                case "да":
                    return true;
                case "нет":
                    return false;
                default:
                    return isNext();
            }
        }
        return isNext();
    }

}
