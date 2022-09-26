package LABA1;

public class Dog  extends Animal{
    public static int countDog = 0;
    public Dog(String name, int maxRun, int maxSwim) {
        super(name,maxRun,maxSwim);
        countDog++;
    }
}
