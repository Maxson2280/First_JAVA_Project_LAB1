package LABA1;

public class Tiger extends Animal{
public static int countTiger = 0;
    public Tiger(String name, int maxRun, int maxSwim) {
        super(name,maxRun,maxSwim);
        countTiger++;
    }
}

