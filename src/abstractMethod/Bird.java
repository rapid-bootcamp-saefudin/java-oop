package abstractMethod;

public class Bird extends Animal {
    public Bird(String name){
        this.name = name;
    }

    @Override
    void run() {
        System.out.println("The bird "+ name +", can fly");
    }

    @Override
    void canEat() {
        System.out.println("The bird " + name + ", can eat grains");
    }
}
