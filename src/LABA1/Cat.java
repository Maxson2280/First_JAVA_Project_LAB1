package LABA1;

public class Cat extends Animal{

    public static int countCat =0;
    public Cat(String name, int maxRun, int maxSwim) {
        super(name,maxRun,maxSwim);
        countCat++;}
}
