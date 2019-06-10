/**
 * Java. Level 1; Lesson 4; Tic-tac-toe;
 *
 * @coauthor: Раков Валерий;
 * @version dated: 10 июня 2019 года
 */

//~~> №1
import java.util.*;

public class Lesson4 {
    final int SIZE = 3;
    final char DOT_X = 'x';
    final char DOT_O = 'o';
    final char DOT_EMPTY = '.';
    char[][] map;
    Scanner sc;
    Random rand;

    public static void main(String[] args) {
        new Lesson4().game();
    }

    Lesson4() {
        map = new char[SIZE][SIZE];
        sc = new Scanner(System.in);
        rand = new Random();
    }

    void game() {
        initMap();
        while (true) {
            printMap();
            humanTurn();
            if (checkWin(DOT_X)) {
                System.out.println("Вы выиграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Извините ничья!");
                break;
            }
            aiTurn();
            if (checkWin(DOT_O)) {
                System.out.println("Искуственный интелект выиграл!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Извините ничья!");
                break;
            }
        }
        printMap();
        System.out.println("Конец игры!");
    }

    void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    void printMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите ваши координатры от 1 до 3. X пробел Y:");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[x][y] = DOT_O;
    }

//~~> №2
    boolean checkWin(char dot) {
        for (int i = 0; i < SIZE; i++) {
            if ((map[i][0] == dot && map[i][1] == dot && map[i][2] == dot) || (map[0][i] == dot && map[1][i] == dot && map[2][i] == dot)) {
                return true;
            }
            if ((map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) || (map[2][0] == dot && map[1][1] == dot && map[0][2] == dot)) {
                return true;
            }
        }
        return false;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[x][y] == DOT_EMPTY;
    }

    boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}
