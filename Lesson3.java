/**
 * Java-1; Lesson-3;
 *
 * @author: Раков Валерий;
 * @version dated: 7 июня 2019 года
 */

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

class Lesson3 {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.print("Играем? Выбери игру (1 или 2):\n1. Угадай число\n2. Угадай слово\n3. Выход\n=> ");
            switch (scanner.next()) {
                case "1":
                    guessMyNumber();
                    break;
                case "2":
                    guessMyWord();
                    break;
                default:
                    System.out.print("Досвидание...");
                    return;
            }
        }
    }
//~~> №1
   public static void guessMyNumber() {
        do {
            int countValue = 0;
            int guessValue = -1;
            int number = random.nextInt(10);
            System.out.print("ИГРА - Угадай число (0..9) с 3-ёх попыткок.\n");
            while (countValue < 3 && guessValue != number) {
                System.out.print((countValue + 1) + "-ая попытка: ");
                try {
                    guessValue = scanner.nextInt();
                    if (number == guessValue) {
                        System.out.println("Вы выиграли!!!");
                    } else {
                        System.out.println("Ваше число " + ((guessValue > number)? "Больше." : "Меньше."));
                        countValue++;
                    }
                } catch (InputMismatchException e) {
                    scanner.next();
                }
            }
            if (countValue == 3) {
                System.out.println("Извините, Вы проиграли.");
            }
            System.out.print("Играем ещё? (1-Да / 0-Нет): ");
        } while (scanner.next().equals("1"));
    }

//~~> №2
    public static void guessMyWord() {
        String[] arrWords = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String userWord = null;
        int countValue;

        do {
            String secretWord = arrWords[random.nextInt(arrWords.length)];
//            System.out.print(secretWord + "\n");
            System.out.print("ИГРА - Угадай слово.\nВсе слова маленькие, Английские язык, фрукты, играем пока не угадаешь.\n");
            userWord = null;
            countValue = 0;

            do {
                countValue += 1;
                System.out.print(countValue + "-ая попытка: ");
                userWord = scanner.next();

                for (int i = 0; i < 15; i++) {
                    if (i < secretWord.length() && i < userWord.length() && secretWord.charAt(i) == userWord.charAt(i)) {
                        System.out.print(secretWord.charAt(i));
                    } else {
                        System.out.print((secretWord.equals(userWord)) ? "" : "#");
                    }
                }

                System.out.println();
            } while (!secretWord.equals(userWord));

            System.out.println("Вы выиграли!!!\nИспользовали попыток: " + countValue);
            System.out.print("Играем ещё? (1-Да / 0-Нет): ");
        } while (scanner.next().equals("1"));
    }
}