package exercise3;

public class Cat implements AnimalBehavior{
    @Override
    public String walk() {
        return "Cat is walking smoothly";
    }

    @Override
    public String talk() {
        return "Cat is talking rude";
    }

    @Override
    public String eat() {
        return "Cat is eating wisely";
    }
}
