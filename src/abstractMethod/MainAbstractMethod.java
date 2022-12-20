package abstractMethod;

public class MainAbstractMethod {
    public static void main(String[] args) {
        Cat cat = new Cat("Pussi");
        cat.run();
        cat.canEat();

        Cat cat2 = new Cat("Catty");
        cat2.run();
        cat2.canEat();

        Cat cat3 = new Cat("Citty");
        cat3.run();
        cat3.canEat();

        Horse horse = new Horse("Baidu");
        horse.run();
        horse.canEat();

        Bird bird = new Bird("El");
        bird.run();
        bird.canEat();

        Fish fish = new Fish("Lemon");
        fish.run();
        fish.canEat();

        Fish fish2 = new Fish("Elmoo");
        fish2.run();
        fish2.canEat();

        Cow cow = new Cow("Momo");
        cow.run();
        cow.canEat();
    }
}
