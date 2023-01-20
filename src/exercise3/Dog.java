package exercise3;

public class Dog implements AnimalBehavior{
    @Override
    public String walk() {
        return "Dog is walking gently";
    }

    @Override
    public String talk() {
        return "Dog is talking loud";
    }

    @Override
    public String eat() {
        return "Dog is eating everything he can";
    }
}
