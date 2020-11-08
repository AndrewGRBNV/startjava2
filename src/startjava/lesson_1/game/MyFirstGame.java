package src.startjava.lesson_1.MyFirstGame;
import java.util.Scanner;

class MyFirstGame {
    public static void main(String[] args) {
        int unknownNumber = 56;
        int inputNumber;
        System.out.println("Компьютер загадал число, Вам нужно его отгадать");
        do {
            inputNumber = inputNumber();
        } while (!testNumber(unknownNumber, inputNumber));
        System.out.println("Вы угадали число ");
    }

    private static int inputNumber() {
        System.out.print("Введите число от 0 до 100 ");
        Scanner scan = new Scanner(System.in);
        int number;
        if (scan.hasNextInt()) {
            number = scan.nextInt();
            if ((number < 0) || (number > 100)) {
                System.out.println("Число введено не верно, число меньше 0 или число больше 100, введите число заново ");
                return inputNumber();
            } else {
                return number;
            }
        } else {
            System.out.println("Число введено не верно, введите число заново ");
            return inputNumber();
        }
    }

    private static boolean testNumber(int unknownNumber, int inputNumber) {
        if (unknownNumber == inputNumber) {
            return true;
        } else {
            if (unknownNumber < inputNumber) {
                System.out.println("Введённое Вами число больше загаданного");
            } else {
                System.out.println("Введённое Вами число меньше загаданного");
            }
            return false;
        }
    }
}