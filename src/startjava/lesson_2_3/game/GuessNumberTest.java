package src.startjava.lesson_2_3.game;
import java.util.Scanner;

class GuessNumberTest {

    public static void main(String[] args) {
        do {
            GuessNumber game = new GuessNumber();
            Player player_0 = new Player(playerNameEnter('1'));
            Player player_1 = new Player(playerNameEnter('2'));
            game.run(player_0,player_1,game.guessRandom());
        } while (isNext());
    }

    private static String playerNameEnter(char number) {
        System.out.println("Введите имя игрока " + number);
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    private static boolean isNext() {
        System.out.println("Хотите продолжить? да / нет");
        Scanner scan = new Scanner(System.in);
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