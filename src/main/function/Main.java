package main.function;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Чмоня", 5, "Чихуахуа");
        myDog.eatFood();
        myDog.sleeping();
        myDog.makeSounds();
        myDog.moving();
        myDog.communicating();


        String dogBreed = myDog.getBreed();
        System.out.println("Порода собаки: " + dogBreed);
        int dogAge = myDog.getAge();
        System.out.println("Возраст собаки: " + dogAge);

        System.out.println("*******************************************************************************************");
        Dog myDog2 = new Dog("Бобик", 3);
        myDog2.eatFood();
        myDog2.sleeping();
        myDog2.makeSounds();
        myDog2.moving();
        myDog2.communicating();


        String dogBreed2 = myDog2.getBreed();
        System.out.println("Порода собаки: " + dogBreed2);
        int dogAge2 = myDog2.getAge();
        System.out.println("Возраст собаки: " + dogAge2);

        System.out.println("*******************************************************************************************");
        Dog myDog3 = new Dog("Шарик");
        myDog3.eatFood();
        myDog3.sleeping();
        myDog3.makeSounds();
        myDog3.moving();
        myDog3.communicating();


        String dogBreed3 = myDog3.getBreed();
        System.out.println("Порода собаки: " + dogBreed3);
        int dogAge3 = myDog3.getAge();
        System.out.println("Возраст собаки: " + dogAge3);

    }
}
