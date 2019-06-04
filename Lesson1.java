/**
 * Раков Валерий, Задание №1, 31.05.2019
 */
public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        System.out.println("Создан метод main()\n");
/**
 * Раков Валерий, Задание №2, 31.05.2019
 */
        byte byteValue;
        short shortValue;
        int intValue;
        long longValue;
        float floatValue;
        double doubleValue;
        char charValue;
        boolean booleanValue;

        byteValue = 10;
        shortValue = 10000;
        intValue = 200000;
        longValue = 3000000000L;

        floatValue = 3.14f;
        doubleValue = 99.999;

        charValue = '\u2222';

        booleanValue = true;
        System.out.println("Задание №2");
        System.out.println("Тип примитивный byte: " + byteValue);
        System.out.println("Тип примитивный short: " + shortValue);
        System.out.println("Тип примитивный int: " + intValue);
        System.out.println("Тип примитивный long: " + longValue);

        System.out.println("Тип примитивный float: " + floatValue);
        System.out.println("Тип примитивный double: " + doubleValue);

        System.out.println("Тип примитивный char: " + charValue);

        System.out.println("Тип примитивный boolean: " + booleanValue + "\n");
/**
 * Раков Валерий, Задание №3, 31.05.2019
 */
        System.out.println("Задание №3");
        System.out.println("Результат расчета: a * (b + (c / d)) = " + calculate(2,2,2,2) + "\n");

/**
 * Раков Валерий, Задание №4, 31.05.2019
 */
        System.out.println("Задание №4");
        System.out.println("Сумма x1 и x2 лежит в диапазоне от 10 до 20 = " + task10and20(5, 6) + "\n");

/**
 * Раков Валерий, Задание №5, 31.05.2019
 */
        System.out.println("Задание №5");
        isPositiveOrNegative(-50);

/**
 * Раков Валерий, Задание №6, 31.05.2019
 */
        System.out.println("Задание №6");
        System.out.println("Переданное число отрицательное = " + isNegative( -6) + "\n");

/**
 * Раков Валерий, Задание №7, 31.05.2019
 */
        System.out.println("Задание №7");
        greetings("Валерий");

/**
 * Раков Валерий, Задание №8, 31.05.2019
 */
        System.out.println("Задание №8");
        leapYear(2019);    }

    public static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20(int x1, int x2) {
        int x = x1 + x2;
        boolean booleanResult = false;

        if (x >= 10 && x <= 20) {
            booleanResult=true;
        }
        return booleanResult;
    }

    public static void isPositiveOrNegative(int x) {
        if(x >= 0) {
            System.out.println("Введенное число x = положительное\n");
        } else if (x < 0){
            System.out.println("Введенное число x = отрицательное\n");
        }
    }

	public static boolean isNegative(int x) {
        if(x < 0) {
            return true;
        }
        return false;
    }

	public static void greetings(String name) {
        System.out.println("\"Привет, " + name + "!\"\n");
    }

    public static void leapYear(int x) {
        if ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0)) {
            System.out.println("Введенный год: " + x + " = Высокостный\n");
        } else {
            System.out.println("Введенный год: " + x + " = Не высокостный\n");
        }
    }

}
