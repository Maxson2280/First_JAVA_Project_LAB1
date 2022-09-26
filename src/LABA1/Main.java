package LABA1;

import java.util.Scanner;

public class Main {

    public static void main(String[] agrs) {

//
//        System.out.println("Введите максимальную дистанцию бега");
//        Scanner in1 = new Scanner(System.in); // ввод с клавиатуры
//        int distanseRun = in1.nextInt();
//        System.out.println("Введите максимальную дистанцию плавания");
//        Scanner in2 = new Scanner(System.in); // ввод с клавиатуры
//        int distanseSwim = in2.nextInt();


        Animal[] animals = {
                new Cat("Persik",200,0), // добавить параметр дистанцию
                new Dog("Bulbik",500,10),
                new Tiger("Tolik",1000,15),
                new Duck("Donald",30,1000),
                new Donkey("Ishak",2000,0),
                new Cat("barsic",200,0)
        };


        for (Animal a : animals) { // перделать
            a.run(10);
            a.swim(100);
        }



        System.out.println("Всего котов " + Cat.countCat);
        System.out.println(("Всего собак " + Dog.countDog));
        System.out.println(("Всего ослов " + Donkey.countDonkey));
        System.out.println(("Всего уток " + Duck.countDuck));
        System.out.println(("Всего тигров " + Tiger.countTiger));
    }
}
