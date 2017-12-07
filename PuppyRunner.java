package oop.homeWork3_4.puppy;

// Сложность: *. Приоритет: ***.
// Создать  объект  класса Щенок,  используя  классы  Животное,  Собака.
// Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.

public class PuppyRunner {

    public static void main(String[] args) {

        Puppy puppy2 = new Puppy("Jackson");

        puppy2.printName();
        puppy2.voice();
        puppy2.voice2();
        puppy2.jump();
        puppy2.run();
        puppy2.attack();

    }
}
