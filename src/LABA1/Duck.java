package LABA1;

public class Duck extends Animal{
public static int countDuck = 0;
    public Duck(String name, int maxRun, int maxSwim) {
        super(name,maxRun,maxSwim);
        countDuck++;
    }
}
