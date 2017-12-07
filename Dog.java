package oop.homeWork3_4.puppy;

// Сложность: *. Приоритет: ***.
// Создать  объект  класса Щенок,  используя  классы  Животное,  Собака.
// Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void voice() {
        System.out.println(getName() + ": Гав-гав");
    }

    public void voice2() {
        System.out.println(getName() + ": Грррр");
    }

    public void jump() {
        System.out.println(getName() + " прыгает.");
    }

    public void run() {
        System.out.println(getName() + " бежит.");
    }

    public void attack() {
        System.out.println(getName() + ", фас!");
    }
}