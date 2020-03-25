import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HW04 {
    static Random rand = new Random();
    private final static char EMPTY = '_';
    private final static char DOT_X = 'X';
    private final static char DOT_O = 'O';
    private static int field_size = 3;
    private static int dot_win = 3;
    //|_|_|_|
    //|_|_|_|
    //|_|_|_|

    private void printTab(char[][] tab) {
        int counter = 1;
        System.out.print("   ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
        for (char[] chars : tab) {
            System.out.print(counter + " ");
            counter++;
            for (char sym : chars) {
                System.out.print("|" + sym);
            }
            System.out.println("|");
        }
    }

    private void fillTab(char[][] tab) {
        for (char[] chars : tab) {
            Arrays.fill(chars, EMPTY);
        }
    }

    public void startGame(int fieldSize) {
        // TODO: 23.03.2020 *** fieldSize > 3, 4(WIN)
        if (fieldSize > 3) {
            field_size = fieldSize;
            dot_win = 4;
        } else {
            dot_win = 3;
            field_size = 3;
        }
        char[][] tab = new char[fieldSize][fieldSize];
        fillTab(tab);
        System.out.println("Игра крестики нолики. Вы играете за Х");
        printTab(tab);
        System.out.println("Для того, чтобы совершить" +
                "" +
                " ход введите номер строки" +
                "и номер столбца таблицы");
        boolean inGame = true;
        Scanner in = new Scanner(System.in);
        while (inGame) {
            System.out.println("Ваш ход:");
            int x, y;
            try {
                x = in.nextInt();
                y = in.nextInt();
                x--;
                y--;
                if (isValid(x, y, tab)) {
                    tab[x][y] = DOT_X;
                    printTab(tab);
                    if (isVictory(tab, DOT_X)) {
                        System.out.println("Вы победили");
                        break;
                    }
                    if (draw(tab)) {
                        System.out.println("Ничья");
                        printTab(tab);
                        break;
                    }
                    System.out.print("Компьютер совершает ход");
                    for (int i = 0; i < 5; i++) {
                        Thread.sleep(300);
                        System.out.print(".");
                    }
                    System.out.println();
                    movePC(tab);
                    if (isVictory(tab, DOT_O)) {
                        System.out.println("Вы проиграли");
                        break;
                    }
                    if (draw(tab)) {
                        System.out.println("Ничья");
                        printTab(tab);
                        break;
                    }
                    // TODO: 23.03.2020 Ничья ???
                } else {
                    System.out.println("Данный ход невозможен! Введите новые значения");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Вы ввели не цифры! Введите цифры");
                in.next();
                continue;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //..... game .....
    }

    private boolean isVictory(char[][] tab, char player /*X, O*/) {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (checkLine(tab, i, j, player)) return true;
            }
        }
        return false;
    }

    public static boolean checkLine(char[][] tab, int x, int y, char ch) {
        boolean b;
        // прямые
        if (tab[x][y] != ch) return false;
        if (field_size - x >= dot_win) {
            b = true;
            for (int i = 0; i < dot_win; i++) {
                if (tab[i + x][y] != ch) {
                    b = false;
                    break;
                }
            }
            if (b) return true;
        }
        if (field_size - y >= dot_win) {
            b = true;
            for (int i = 0; i < dot_win; i++) {
                if (tab[x][y + i] != ch) {
                    b = false;
                    break;
                }
            }
            if (b) return true;
        }

        if (field_size - y >= dot_win && field_size - x >= dot_win) {
            b = true;
            for (int i = 0; i < dot_win; i++) {
                if (tab[x + i][y + i] != ch) {
                    b = false;
                    break;
                }
            }
            if (b) return true;
        }
        if (field_size - y >= dot_win && 1 + x >= dot_win) {
            b = true;
            for (int i = 0; i < dot_win; i++) {
                if (tab[x - i][y + i] != ch) {
                    b = false;
                    break;
                }
            }
            if (b) return true;
        }
        return false;
    }

    public static void fillDigSells(int[][] a_array) {
        for (int i = 0; i < a_array.length; i++) {
            for (int j = 0; j < a_array[i].length; j++) {

            }
        }
    }

    private void movePC(char[][] tab) {
        // TODO: 23.03.2020 smart strategy
        // Не смарт :(
        int x, y;
        do {
            x = rand.nextInt(field_size);
            y = rand.nextInt(field_size);
        } while (!isValid(x, y, tab));
        System.out.println(x + " " + y);
        tab[x][y] = DOT_O;
        printTab(tab);
    }

    private boolean isValid(int x, int y, char[][] tab) {
        int len = tab.length;
        if (x >= 0 && x < len && y >= 0 && y < len) {
            if (tab[x][y] == EMPTY) {
                return true;
            }
        }
        return false;
    }

    public static boolean draw(char[][] tab) {
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab[i].length; j++)
                if (tab[i][j] == EMPTY) return false;
        return true;
    }

    public static void main(String[] args) {
        if (args != null && args.length == 1) {
            new HW04().startGame(Integer.parseInt(args[0]));
        } else {
            new HW04().startGame(6);
        }

    }

}
