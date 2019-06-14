/**
 * Java. Level 1; Lesson 5;
 *
 * @coauthor: Раков Валерий;
 * @version dated: 14 июня 2019 года
 */

import java.text.MessageFormat;
import java.util.*;

public class Lesson5 {
    public static void main(String[] args) {
//~~> №4
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                                    "892312312", 30000, 30);
        persArray[1] = new Person("Petrov Petr", "Main Engineer", "petrovp@mailbox.com",
                "892312312", 50000, 40);
        persArray[2] = new Person("Sidorov Sidr", "Analyst", "sidorovs@mailbox.com",
                "892311111", 25000, 45);
        persArray[3] = new Person("Vasilev Vasiliy", "Developer", "vasilevv@mailbox.com",
                "892312222", 55000, 39);
        persArray[4] = new Person("Sergeev Sergey", "Director", "sergeevs@mailbox.com",
                "892313333", 70000, 55);
//~~> №5
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                System.out.println(persArray[i].workerPrint());
            }
        }
    }
}
//~~> №1
class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

//~~> №2
    public Person(String name, String position, String email, String phone,
                  int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() { // getter for age
        return age;
    }

//~~> №3
    public String workerPrint() {
        String pattern = "ФИО: {0}, Должность: {1}, E-mail: {2}, Телефон: {3} Зарплата: {4}, Возраст: {5}";
        return MessageFormat.format(pattern, this.name, this.position, this.email, this.phone,
                this.salary, this.age);
    }

}