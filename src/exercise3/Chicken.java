package exercise3;

public class Chicken implements AnimalBehavior{
    @Override
    public String walk() {
        return "Chicken is walking but also flying";
    }

    @Override
    public String talk() {
        return "Chicken is talking when it makes an egg";
    }

    @Override
    public String eat() {
        return "Chicken is eating corn";
    }
}
