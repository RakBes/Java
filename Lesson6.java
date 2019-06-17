/**
 * Java. Level 1; Lesson 6;
 *
 * @coauthor: Раков Валерий;
 * @version dated: 17 июня 2019 года
 */

public class Lesson6 {
    public static void main(String[] args) {
        IAnimal[] animals = {new Cat("Васька"), new Dog("Бобик")};
        Lesson6 game = new Lesson6();
        game.sport(animals, 200, 5);
        game.sport(animals, 250, 10);
        game.sport(animals, 600, 15);
    }

    void sport(IAnimal[] animals, int runDistance, int swinDistance) {
        for (IAnimal animal : animals) {
            System.out.println(animal.voice());
            System.out.println(animal.run(runDistance));
            System.out.println(animal.swim(swinDistance));
            System.out.println();
        }
    }

}


//~~ №1
class Cat extends Animal {
//~~ №3
    final int LIMIT_RUN = 200;
    String resultAction;
    public Cat(String name) {
        super(name);
    }
    public  String voice() {
        return "голос: " + name + ", Мяу-Мяу";
    }
//~~ №2
    public String run(int value) {
        if (value > LIMIT_RUN) {
            resultAction = "бег на " + value + ": " + name + ", сдох.";
        } else{
            resultAction = "бег на " + value + ": " + name + ", пробежал " + value + " м.";
        }
        return resultAction;
    }
    public String swim(int value) {
        return "плавание на " + value + ": " + name + ", не умеет полавать.";
    }
}
//~~ №1
class Dog extends Animal {
//~~ №3
    final int LIMIT_RUN = 500;
    final int LIMIT_SWIM = 10;
    String resultAction;

    public Dog(String name) {
        super(name);
    }

    public  String voice() {
        return "голос: " + name + " Гав-Гав";
    }
//~~ №2
    public String run(int value) {
        if (value > LIMIT_RUN) {
            resultAction = "бег на " + value + ": " + name + ", сдох.";
        } else{
            resultAction = "бег на " + value + ": " + name + ", пробежал " + value + " м.";
        }
        return resultAction;
    }
    public String swim(int value) {
        if (value > LIMIT_SWIM) {
            return "плавание на " + value + ": " + name + ", утанул.";
        } else {
            return "плавание на " + value + ": " + name + ", проплыл " + value + " м.";
        }
    }
}

interface IAnimal {
    public String voice();
//~~ №2
    public String run(int value);
    public String swim(int value);
}

abstract class Animal implements IAnimal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}