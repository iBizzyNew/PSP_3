package main.function;

public class Dog implements Animal {
    private String name;
    private int age;
    private String breed;

    // Конструктор с тремя параметрами
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Конструктор с двумя параметрами (без указания породы)
    public Dog(String name, int age) {
        this(name, age, "Unknown");
    }

    // Конструктор с одним параметром (только имя)
    public Dog(String name) {
        this(name, 1, "Unknown");
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Реализация методов интерфейса Animal
    @Override
    public void eatFood() {
        System.out.println(name + " кушает сухой корм.");
    }

    @Override
    public void sleeping() {
        System.out.println(name + " дает хропака.");
    }

    @Override
    public void makeSounds() {
        System.out.println(name + " лает: Тяу-тяу!");
    }

    @Override
    public void moving() {
        System.out.println(name + " кувыркается.");
    }

    @Override
    public void communicating() {
        System.out.println(name + " балдеет от жизни.");
    }
}
