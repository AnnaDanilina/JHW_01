import java.util.Random;
import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exit;
        do {
            game(sc);
            System.out.println("Игра закончена.");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            exit = sc.nextInt();

        } while (exit != 0);
        sc.close();
    }

    public static void game(Scanner sc) {
        Random rand = new Random();
        int x = rand.nextInt(10);
        int guess;

        for (int i = 0; i < 3; i++) {
            System.out.println(x);
            System.out.print("Введите число от 0 до 9 :");
            guess = sc.nextInt();
            if (guess == x) {
                System.out.println("Вы удалали это число " + guess);
                break;
            } else if (guess < x) System.out.println("Загаданное число больше");
            else System.out.println("Загаданое число меньше");

        }
    }
}
