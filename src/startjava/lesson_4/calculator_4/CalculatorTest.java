package src.startjava.lesson_4.calculator_4;

import java.util.Scanner;

public class CalculatorTest {


    public static void main(String[] args) {
        do {
            System.out.println("Введите два числа и операцию с пробелами между ними");

            Scanner scanner = new Scanner(System.in);
            String calculation = scanner.nextLine();
            System.out.println("Ответ: " + calculate(calculation));
        } while (isNext());
    }
//
    public static double calculate(String calculation) {
        String[] arr = calculation.split(" ");

        int result = 0;
        int data0 = Integer.parseInt(arr[0]);
        int data1 = Integer.parseInt(arr[2]);

        String operation = arr[1];

        switch (operation) {
            case "+":
                return data0 + data1;
            case "-":
                return data0 - data1;
            case "*":
                return data0 * data1;
            case "/":
                return data0 / data1;
            case "^":
                return Math.pow( data0,data1);
            default:
                System.out.println("Неверный оператор: " + operation);
                return result;
        }
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
