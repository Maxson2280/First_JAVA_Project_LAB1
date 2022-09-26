package LABA1;

public class Donkey extends Animal{
public static int countDonkey = 0;
    public Donkey(String name, int maxRun, int maxSwim) {
        super(name,maxRun,maxSwim);
        countDonkey++;
    }
}
