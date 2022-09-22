package LABA1;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    Scaner in1 = new Scanner(System.in); // ввод с клавиатуры
    System.out.println("Введите максимальную дистанцию бега");
    
    Scanner in2 = new Scanner(System.in) ; // ввод с клавиатуры
    System.out.println("Введите максимальную дистанцию плавания")

    int distanseRun = in1.nextInt();
    
    int distanseSwim = in2.nextInt();
    
    public static void main(String[] agrs) {
        Animal[] animals = {
                new Cat("Persik"), // добавить параметр дистанцию
                new Dog("Bulbik"),
                new Tiger("Tolik"),
                new Duck("Donald"),
                new Donkey("Ishak")
        };

        for (Animal a : animals) { // перделать
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
