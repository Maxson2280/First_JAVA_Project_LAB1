package LABA1;

public class Dog  extends Animal{
    public static int countDog = 0;
    public Dog(String name) {
        super(name);
        countDog++;
    }
}
