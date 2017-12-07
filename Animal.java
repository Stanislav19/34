package oop.homeWork3_4.puppy;

//Сложность: *. Приоритет: ***.
//Создать  объект  класса Щенок,  используя  классы  Животное,  Собака.
// Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.

public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("name: " + name);
    }

}
