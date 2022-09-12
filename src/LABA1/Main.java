package LABA1;

public class Main {

    public static void main(String[] agrs) {
        Animal[] animals = {
                new Cat("Persik"),
                new Dog("Bulbik"),
                new Tiger("Tolik"),
                new Duck("Donald"),
                new Donkey("Ishak")
        };
        for (Animal a : animals) {
            a.run(10);
            a.swim(5);
        }
        System.out.println(Cat.count);
    }
}
