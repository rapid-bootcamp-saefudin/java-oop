package abstractMethod;

public class Fish  extends Animal {
    public Fish(String name){
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("The fish " + name + ", can swim");
    }

    @Override
    void canEat() {
        System.out.println("The fish " + name + ", can eat worm");
    }
}
