/**
 * Java. Level 1; Lesson 7;
 *
 * @coauthor: Раков Валерий;
 * @version dated: 21 июня 2019 года
 */

import java.util.*;

public class Lesson7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitFoot =false;
        Cat[] cats = {new Cat("Мурзик", 10),
                      new Cat("Васька", 20),
                      new Cat("Барсик", 30)};

        Plate plate = new Plate();
        do {
            for (Cat cat : cats) {
                cat.eat(plate);
                System.out.println(cat);
                exitFoot = cat.fullness;
            }
            System.out.println("В тарелке: " + plate);
            if (!exitFoot) {
                System.out.print("Положить в тарелку еды: ");
                plate.add(scanner.nextInt());
            }
        } while (!exitFoot);
        System.out.println("Все коты накормлены.");
    }
}

class Cat {
    protected String name;
    protected int appetite;
    protected boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "Имя=" + name + ", аппетит=" + appetite + ", сытость=" + fullness;
    }
}

class Plate {
    protected int food;

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return String.valueOf(food);
    }
}
