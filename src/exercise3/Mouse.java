package exercise3;

public class Mouse implements AnimalBehavior{
    @Override
    public String walk() {
        return "Mouse is walking fast";
    }

    @Override
    public String talk() {
        return "Mouse is talking slow";
    }

    @Override
    public String eat() {
        return "Mouse is eating cheese";
    }
}
