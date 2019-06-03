/**
 * Java-1; Lesson-2; Раков Валерий; 3 июня 2019 года
 */
import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("Задание №1");
        invertArray();

        System.out.println("\nЗадание №2");
        System.out.println(Arrays.toString(fillArray()));

        System.out.println("\nЗадание №3");
        changeArray();

        System.out.println("\nЗадание №4");
        fillDiagonal(5);

        System.out.println("\nЗадание №5");
        findMinMax(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});

        System.out.println("\nЗадание №6");
        int[] test1 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(Arrays.toString(test1) + " " + checkBalance(test1));
        int[] test2 = {1, 1, 1, 2, 1};
        System.out.println(Arrays.toString(test2) + " " + checkBalance(test2));
        int[] test3 = {10, 11};
        System.out.println(Arrays.toString(test3) + " " + checkBalance(test3));
        int[] test4 = {3, 3, 6};
        System.out.println(Arrays.toString(test4) + " " + checkBalance(test4));
        int[] test5 = {6, 3, 3};
        System.out.println(Arrays.toString(test5) + " " + checkBalance(test5));
    }

//~~> №1
    static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 1)? 0 : 1;
        }
        System.out.println(Arrays.toString(array));
    }

//~~> №2
    static int[] fillArray() {
        int sumValue = 0;
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sumValue += 3;
            }
            array[i] = sumValue;
        }
        return array;
    }

//~~> №3
    static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6)
                array[i] *= 2;
        }
        System.out.println(Arrays.toString(array));
    }

//~~> №4
    static void fillDiagonal(int lengthArr) {
        int[][] arr = new int[lengthArr][lengthArr];
        for (int i = 0; i < lengthArr; i++) {
            arr[i][i] = 1;
            arr[i][lengthArr - i - 1] = 1;
        }
        for (int i = 0; i < lengthArr; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

//~~> №5
    static void findMinMax(int[] array) {
        int numberMin = array[0];
        int numberMax = array[0];

        for (int i = 1; i < array.length; i++) {
            if (numberMin > array[i]) {
                numberMin = array[i];
            } else if (numberMax < array[i]) {
                numberMax = array[i];
            }
        }
        System.out.println("Мин. число: " + numberMin);
        System.out.println("Мак. число: " + numberMax);
    }

//~~> №6
    static boolean checkBalance(int[] array) {
        int count = 0;
        int sumLeft;
        int sumRight;
        boolean val = false;


        while (count != array.length) {
            count += 1;
            sumLeft = 0;
            for (int i = 0; i < count; i++) {
                sumLeft += array[i];
            }
            sumRight = 0;
            for (int i = 0 + count; i < array.length; i++) {
                sumRight += array[i];
            }
            if (sumLeft == sumRight) {
                val = true;
            }
        }
        return val;
    }
}
