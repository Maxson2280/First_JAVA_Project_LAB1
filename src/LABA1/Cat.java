package LABA1;

public class Cat extends Animal{

    public static int count=0;
    public Cat(String name) {
        super(name);
        count++;
    }
}
