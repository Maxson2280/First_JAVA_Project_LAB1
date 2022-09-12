package LABA1;

public class Duck extends Animal{
public static int countDuck = 0;
    public Duck(String name) {
        super(name);
        countDuck++;
    }
}
