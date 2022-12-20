package abstractMethod;

public class Cow  extends Animal {
    public Cow(String name){
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("The cow " + name + ", can run");
    }

    @Override
    void canEat() {
        System.out.println("The cow " + name + ", can eat grass");
    }
}
