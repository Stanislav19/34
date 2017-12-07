package oop.homeWork3_4.puppy;

// Сложность: *. Приоритет: ***.
// Создать  объект  класса Щенок,  используя  классы  Животное,  Собака.
// Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(getName() + ": тявк-тявк.");
    }

    public void voice2() {
        System.out.println(getName() + ": Ууррр.");
    }
}
