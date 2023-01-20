package exercise3;

public class Duck implements AnimalBehavior{
    @Override
    public String walk() {
        return "Duck is walking but loves flying";
    }

    @Override
    public String talk() {
        return "Duck is talking when it's happy";
    }

    @Override
    public String eat() {
        return "Duck is eating bread";
    }
}
