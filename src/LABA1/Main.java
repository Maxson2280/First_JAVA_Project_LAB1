package LABA1;

public class Main {

    public static void main(String[] agrs) {
        Animal[] animals = {
                new Cat("Persik"),// добавить параметр дистанцию
                new Dog("Bulbik"),
                new Tiger("Tolik"),
                new Duck("Donald"),
                new Donkey("Ishak")
        };
        for (Animal a : animals) {
            a.run(500);
            a.swim(50);
        }

        System.out.println("Всего живых котов " + Cat.countCat);
        System.out.println(("Всего живых собак " + Dog.countDog));
        System.out.println(("Всего живых ослов " + Donkey.countDonkey));
        System.out.println(("Всего живых уток " + Duck.countDuck));
        System.out.println(("Всего живых тигров " + Tiger.countTiger));
    }
}
