package exercise3;

public class AnimalLearning {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.printf("I can say this about a cat: \n%s\n%s\n%s\n", myCat.walk(), myCat.talk(), myCat.eat());

        Dog myDog = new Dog();
        System.out.printf("I can say this about a dog: \n%s\n%s\n%s\n", myDog.walk(), myDog.talk(), myDog.eat());

        Mouse myMouse = new Mouse();
        System.out.printf("I can say this about a mouse: \n%s\n%s\n%s\n", myMouse.walk(), myMouse.talk(), myMouse.eat());

        Chicken myChicken = new Chicken();
        System.out.printf("I can say this about a chicken: \n%s\n%s\n%s\n", myChicken.walk(), myChicken.talk(), myChicken.eat());

        Duck myDuck = new Duck();
        System.out.printf("I can say this about a duck: \n%s\n%s\n%s\n", myDuck.walk(), myDuck.talk(), myDuck.eat());
    }
}
